public class Pilapromedio {
    private int[] elementos;
    private int cima;
    private final int maxpila = 10;

    public Pilapromedio(){
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

    public double CalcProm (){
        Pilapromedio aux = new Pilapromedio();
        int suma= 0;
        int cant= 0;

        while(!this.estaVacia()){
            int elem = this.sacar();
            if(elem > 0){
                suma += elem;
                cant++;
            }
            aux.meter(elem);
        }

        while (!aux.estaVacia()) {
            this.meter(aux.sacar());
            
        }

        if (cant == 0){
            return 0;
        } else {
            return (double) suma / cant;
        }
    }

}
