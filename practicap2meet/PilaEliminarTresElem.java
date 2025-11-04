//elimiar los 3 primeros elementos

package practicap2meet;

public class PilaEliminarTresElem {
    private int []elementos;
    private int cima;
    private final int maxpila = 10;

    public PilaEliminarTresElem(){
        elementos = new int [maxpila];
        cima = -1;
    }

    public boolean estaVacia(){
        return cima == -1;
    }

    public boolean estaLlena(){
        return cima == maxpila - 1;
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

    public void EliminarTres(){
        PilaEliminarTresElem aux = new PilaEliminarTresElem();
        int contador = 0;

        while(!this.estaVacia()){
            int elem  = this.sacar();
            contador++;

            if(contador > 3){
                aux.meter(elem);
            }
        }

        while (!aux.estaVacia()){
            this.meter(aux.sacar());
        }
    }
}
