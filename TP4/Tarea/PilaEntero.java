package TP4.Tarea;

public class PilaEntero {
    private int [] elementos;
    private int cima;
    private final int maxpila = 10;

    public PilaEntero() {
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

    public int contarOcurrencias (int elem){
        int contador = 0;
        PilaEntero aux = new PilaEntero();

        while(!estaVacia()) {
            int elemento = sacar();
            if(elemento == elem) {
                contador++;
            }
            aux.meter(elemento);
        }

        while(!aux.estaVacia()) {
            meter(aux.sacar());
        }
        
        return contador;
    }
}