package practicap2meet;

public class PilaSumaElem {
    private int[] elementos;
    private int cima;
    private final int maxpila = 10;

    public PilaSumaElem(){
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

    public PilaSumaElem sumarPilas(PilaSumaElem p1, PilaSumaElem p2){
        PilaSumaElem p3 = new PilaSumaElem();
        PilaSumaElem auxp1 = new PilaSumaElem();
        PilaSumaElem auxp2 = new PilaSumaElem();

        while(!p1.estaVacia() && !p2.estaVacia()){
            int elem1 = p1.sacar();
            int elem2 = p2.sacar();
            p3.meter(elem1 + elem2);
            auxp1.meter(elem1);
            auxp2.meter(elem2);
        }

        while(!auxp1.estaVacia()){
            p1.meter(auxp1.sacar());
        }
        
        while(!auxp2.estaVacia()){
            p2.meter(auxp2.sacar());      
        }

        return p3;
    }
}
