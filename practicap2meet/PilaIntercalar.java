import TP4.PUNTO7.Cola;
//diferentes tamaños
public class PilaIntercalar {
    private int[] elementos;
    private int cima;
    private final int maxpila = 10;

    public PilaIntercalar(){
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

    public PilaEntero intercalar(PilaEntero p1, ColaEntero c1){
        PilaEntero p2 = new PilaEntero();
        PilaEntero auxp1 = new PilaEntero();
        ColaEntero auxc1 = new ColaEntero();

        while(!p1.estaVacia() && !c1.estaVacia()){
            int elemp = p1.sacar();
            int elemc = c1.desencolar();

            p2.meter(elemp);
            p2.meter(elemc);

            auxp1.meter(elemp);
            auxc1.encolar(elemc);
        }

        while(!p1.estaVacia()){
            int elemp = p1.sacar();
            p2.meter(elemp);
            auxp1.meter(elemp);
        }

        while (!c1.estaVacia()) {
            int elemc = c1.desencolar();
            p2.meter(elemc);
            auxc1.encolar(elemc);
        }

        while (!auxp1.estaVacia()){
            p1.meter(auxp1.sacar());
        }

        while (!auxc1.estaVacia()){
            c1.encolar(auxc1.desencolar());
        }
        return p2;
    }
}
