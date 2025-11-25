public class ColaDuplicarCaracter {
    private char[] elementos;
    private int frente;
    private int fin;
    private final int MAX = 10;

    public ColaDuplicarCaracter() {
        elementos = new char[MAX];
        frente = 0;
        fin = 0;
    }

    public boolean estaVacia() { 
        return fin == 0; 
    }

    public boolean estaLlena() {
        return fin == MAX; 
    }

    public void encolar(char elem) {
        elementos[fin] = elem;
        fin++;
    }

    public char desencolar() {
        char aux = elementos[0];
        for (int i = 0; i < fin - 1; i++)
            elementos[i] = elementos[i + 1];
        fin--;
        return aux;
    }

    public void duplicarVocales() {
        ColaDuplicarCaracter aux = new ColaDuplicarCaracter();

        while (!this.estaVacia()) {
            char c = this.desencolar();
            aux.encolar(c);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                aux.encolar(c);
            }
        }

        while (!aux.estaVacia()){
            this.encolar(aux.desencolar());
        }
    }
     // otro metodo
     public void duplicarPositivos() {
        ColaDuplicarPositivos aux = new ColaDuplicarPositivos();

        while (!this.estaVacia()) {
            int elem = this.desencolar();
            if (elem > 0) {
                aux.encolar(elem);
                aux.encolar(elem);
            } else {
                aux.encolar(elem);
            }
        }

        while (!aux.estaVacia()){
            this.encolar(aux.desencolar());
        }
    }
}
