package TP4.Tarea;

public class PilaControlNiveles {
    private int [] elementos;
    private int cima;
    private final int maxpila = 10;

    public PilaControlNiveles() {
        elementos = new int[maxpila];
        cima = -1;
    }

    public boolean estaVacia () {
        return cima == -1;
    }

    public boolean estaLlena(){
        return cima == maxpila - 1;
    }

    public void meter(int elem) {
        if (!this.estaLlena()){
            cima++;
            elementos[cima]=elem;
        }
    }

    public int sacar() {
        if (!estaVacia()) {
            int elem = elementos[cima];
            cima--;
            return elem;
        }
        return -1;
    }

    public int verTope() {
        if(!estaVacia()){
            return elementos[cima];
        }
        return -1;
    }

    public int contarOcurrencias(int x){
        PilaControlNiveles aux = new PilaControlNiveles();
        int contador = 0;

        while(!this.estaVacia()){
            int elem = this.sacar();
            
            if (elem == x){
                contador++;
            }
            aux.meter(elem);
        }

        while(!aux.estaVacia()){
            this.meter(aux.sacar());
        }

        return contador;
    }
}
