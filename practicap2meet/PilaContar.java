package practicap2meet;

public class PilaContar {
    private char[] elementos;
    private int cima;
    private final int maxpila = 10;

    public PilaContar(){
        elementos = new char[maxpila];
        cima = -1;
    }

     public boolean estaVacia () {
        return cima == -1;
    }

    public boolean estaLlena(){
        return cima == maxpila - 1;
    }

    public void meter(char elem) {
        if (!this.estaLlena()){
            cima++;
            elementos[cima]=elem;
        }
    }

    public char sacar() {
        if (!estaVacia()) {
            char elem = elementos[cima];
            cima--;
            return elem;
        }
        return '\0';
    }
    
    public void contarAE(){
        PilaContar aux = new PilaContar();
        int cantA = 0, cantE = 0;
        
        while(!this.estaVacia()){
            char c = this.sacar();
            if(c == 'A'){
                cantA++;
            }
            if(c == 'E'){
                cantE++;
            }
            aux.meter(c);
        }

        while(!aux.estaVacia()){
            this.meter(aux.sacar());
        }
    }    
}
