package Parcial;

import TP4.Tarea.ColaInt;

public class ColaEntero {
    private int[] elementos;
    private int frente;
    private int fin;
    private final int MAX=10;
    
    public ColaEntero(){
        elementos = new int[MAX];
        frente = 0;
        fin = 0;
    }

    public boolean estaVacia(){
        return frente == fin;
    }

    public boolean estaLlena(){
        return fin == MAX;
    }

    public void encolar(int elem){
        elementos[fin] = elem;
        fin++;
    }

    public int desencolar(){
        int aux = elementos[frente];
        for (int i = 0; i < fin - 1; i++) {
            elementos[i] = elementos[i + 1];
        } 
        fin--;
        return aux;
    }

    public boolean masElementos (ColaInt q2){
        ColaEntero aux = new ColaEntero();
        ColaEntero auxq2 = new ColaEntero();
        int contq1 = 0;
        int contq2 = 0;

        while(!this.estaVacia()){
            int elemq1 = this.desencolar();
            contq1++;
            aux.encolar(elemq1);

        }
        while(!q2.estaVacia()){
            int elemq2 = q2.desencolar();
            contq2++;
            auxq2.encolar(elemq2);

        }

        while(!aux.estaVacia()){
            this.encolar(aux.desencolar());
        }

        while(!auxq2.estaVacia()){
            q2.encolar(auxq2.desencolar());
        }
        return contq1 > contq2;
    }
}
