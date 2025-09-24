package PUNTO3;
public class PilaChar {
    
    private char [] elementos;
    private int cima;
    private final int maxpila = 10;

    public PilaChar(){
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

}

    

