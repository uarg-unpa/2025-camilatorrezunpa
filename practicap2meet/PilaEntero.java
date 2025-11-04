package practicap2meet;
//intercalo pila y cola guardo en p2
import TP4.PUNTO7.Cola;

public class PilaEntero {
    private int[] elementos;
    private int cima;
    private final int maxpila = 10;

    public PilaEntero(){
        elementos = new int[maxpila];
        cima = -1;
    }

    public boolean estaVacia(){
        return cima == - 1;
    }

    public boolean estaLlena(){
        return cima == maxpila -1;
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

    public PilaEntero intercalar(Pila p1, Cola c1){
        Pila p2 = new Pila();
        Pila auxp = new Pila();
        Cola auxc = new Cola();

        while(!p1.estaVacia() || !c1.estaVacia()){
            if(!p1.estaVacia()){
                int elemP = p1.sacar();
                p2.meter(elemP);
                auxp.meter(elemP);
            }

            if(!c1.estaVacia()){
                int elemC = c1.desencolar();
                p2.meter(elemC);
                auxc.encolar(elemC);
            }
        }

        while(!auxp.estaVacia()){
            p1.meter(auxp.sacar());
        }

        while(!auxc.estaVacia()){
            c1.encolar(auxc.desencolar());
        }

        return p2;
    }
}
