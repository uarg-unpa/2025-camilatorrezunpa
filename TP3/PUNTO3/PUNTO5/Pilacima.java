public class Pilacima {
    
    private char [] elementos;
    private int cima;
    private final int maxpila = 10;

    public Pilacima(){
        elementos = new char[maxpila];
        cima = -1;
    }

    public boolean estaVacia () {
        if (cima == -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean estaLlena(){
        if(cima == maxpila - 1){
            return true;
        }else{
            return false;
        }
    }

    public void meter(char e) {
        if (!this.estaLlena()){
            cima++;
            elementos[cima]=e;
        }
    }

    public char sacar(){
        char aux=' ';
        if(!this.estaVacia()){
            aux=elementos[cima];
            cima--;
        }
        return aux;
    }

    public char elementoCima(){
        char x;
        x = this.sacar(); 
        this.meter(x);     
        return x;   
    }
}


    
