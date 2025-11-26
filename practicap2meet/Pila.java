package practicap2meet;
//intercalo pila y cola y guardo en p2 pero no tienen el mismo tamaño pero despues se vuelve a la forma original

import TP4.PUNTO7.Cola;

public class Pila {
    private int[] elementos;
    private int cima;
    private final int maxpila = 10;

    public Pila(){
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

    public Pila intercalar(Pila p1, Cola c1){
        Pila p2 = new Pila();
        Pila auxp1 = new Pila();
        Cola auxc1 = new Cola();

        while(!p1.estaVacia() || !c1.estaVacia()){
            if(!p1.estaVacia()){
                int elemp = p1.sacar();
                p2.meter(elemp);
                auxp1.meter(elemp);
            }

            if(!c1.estaVacia()){
                int elemc = c1.desencolar();
                p2.meter(elemc);
                auxc1.encolar(elemc);
            }
        }

        while(!auxp1.estaVacia()){
            p1.meter(auxp1.sacar());
        }

        while(!auxc1.estaVacia()){
            c1.encolar(auxc1.desencolar());
        }

        return p2;
    }
}
