package practicap2meet;

public class ColaEliminarNegativos {
    private int[] elementos;
    private int frente;
    private int fin;
    private final int MAX=10;
    
    public ColaEliminarNegativos(){
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

    public void eliminarNegativo (){
        ColaEliminarNegativos aux = new ColaEliminarNegativos();

        while(!this.estaVacia()){
            int elem = this.desencolar();

            if(elem >= 0){
                aux.encolar(elem);
            }
        }

        while (!aux.estaVacia()){
            this.encolar(aux.desencolar());
        }
    }



}