//eliminar elementos positivos
package practicap2meet;

public class PilaEliminarPos {
    private int[] elementos;
    private int cima;
    private final int maxpila = 10;

    public PilaEliminarPos(){
        elementos = new int[maxpila];
        cima = -1;
    }

    public boolean estaVacia(){
        return cima == - 1;
    }

    public boolean estaLlena(){
        return maxpila == -1;
    }

    public void meter(int elem){
        if(!this.estaLlena()){
            cima++;
            elementos[cima] = elem;
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

    public void eliminarPositivos() {
        PilaEliminarPos aux = new PilaEliminarPos();

        while(!this.estaVacia()){
            int elem = this.sacar();
            if(elem <= 0){
                aux.meter(elem);
            }
        }

        while(!aux.estaVacia()){
            this.meter(aux.sacar());
        }
    }
}

