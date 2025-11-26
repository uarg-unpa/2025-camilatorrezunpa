package TP4.PUNTO5;

public class ColaEliminarRepetidos {
    private int[] elementos;
    private int frente;
    private int fin;
    private final int MAX = 10;

    public ColaEliminarRepetidos() {
        elementos = new int[MAX];
        frente = 0;
        fin = 0;
    }

    public boolean estaVacia(){
        return frente == fin;
    }

    public boolean estaLlena() {
        return fin == MAX;
    }

    public void encolar(int elem){
        if(!estaLlena()){
            elementos[fin] = elem;
            fin++;
        }
    }

    public int desencolar() {
        int aux = elementos[frente];
        for (int i = 0; i < fin - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        fin--;
        return aux;
    }

    public void eliminarRepetidos() {
        ColaEliminarRepetidos aux = new ColaEliminarRepetidos();
        int[] visitados = new int[MAX];
        int cantVisitados = 0;

        while(!this.estaVacia()){
            int elem = desencolar();
            boolean repetido = false;

            for (int i = 0; i < cantVisitados; i++) {
                if(visitados[i] == elem){
                    repetido = true;
                    break;
                }
            }

            if(!repetido){
                 visitados[cantVisitados] = elem;
                cantVisitados++;
                aux.encolar(elem);
            }
        }

        while (!aux.estaVacia()){
            encolar(aux.desencolar());
        }
    }
}

