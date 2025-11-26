//Invertir el orden de los elementos de la cola usando una pila auxiliar

public class ColaInvertir {
    private String[] elementos;
    private int frente;
    private int fin;
    private final int MAX = 10;

    public ColaInvertir() {
        elementos = new String[MAX];
        frente = 0;
        fin = 0;
    }

    public boolean estaVacia() {
        return fin == 0; 
    }
    
    public boolean estaLlena() { 
        return fin == MAX; 
    }

    public void encolar(String elem) {
        elementos[fin] = elem;
        fin++;
    }

    public String desencolar() {
        String aux = elementos[0];
        for (int i = 0; i < fin - 1; i++)
            elementos[i] = elementos[i + 1];
        fin--;
        return aux;
    }

    public void invertir(){
        PilaString pila = new PilaString();

        while (!this.estaVacia()){
            pila.apilar(this.desencolar());
        }
        while (!pila.estaVacia()){
            this.encolar(pila.desapilar());
        }
    }
}
