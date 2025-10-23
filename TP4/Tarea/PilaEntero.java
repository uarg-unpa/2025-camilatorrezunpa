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
        if (cima == -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean estaLlena(){
        if(cima == maxpila - 1){
            return true;
        }else{
            return false;
        }
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
    }

    public int contarOcurrencias (int elem){
        int contador = 0;
        PilaEntero aux = new PilaEntero();

        while(!estaVacia()) {
            int elemento = sacar();
            if(elemento == elem) {
                contador++;
                aux.meter(elemento);

                while(!aux.estaVacia()) {
                    meter(aux.sacar());
                    return contador;
                }
            }
        }

    }
}  