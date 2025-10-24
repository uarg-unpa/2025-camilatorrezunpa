package TP4.PUNTO7;

public class MainPilaEnteros {
    
    public static void main(String[] args) {
        Pila pila = new Pila();
        Cola cola = new Cola();

        While(!pila.estaVacia()){
            int elem = pila.desapilar();
        if(elem % 2 == 0) {
            cola.encolar(elem);
        }   
    }
    
}
