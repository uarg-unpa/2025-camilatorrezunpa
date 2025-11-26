public class ColaTF {
    private int[] elementos;
    private int frente;
    private int fin;
    private final int MAX = 10;

    public ColaTF() {
        elementos = new int[MAX];
        frente = 0;
        fin = 0;
    }

    public boolean estaVacia() {
        return frente == fin;
    }

    public boolean estaLlena() {
        return fin == MAX;
    }

    public void encolar(int elem) {
        if (!estaLlena()) {
            elementos [fin] = elem;
            fin++;
        }
    }

    public int desencolar() {
        int aux = elementos[frente];
        for (int i = 0; i < fin -1; i++){
            elementos[i] = elementos[i + 1];
        } 
        fin--;
        return aux;
    }

    public boolean sonIguales(ColaTF otracola){
        ColaTF aux1 = new ColaTF();
        ColaTF aux2 = new ColaTF();
        boolean iguales = true;
        while(!this.estaVacia() && !otracola.estaVacia()){
            int e1 = this.desencolar();
            int e2 = otracola.desencolar();

        if (e1 != e2){
           iguales = false;
        }

        aux1.encolar(e1);
        aux2.encolar(e2);
    }

    if(!this.estaVacia() || !otracola.estaVacia()){
        iguales = false;
    }

    while(!aux1.estaVacia()){
        this.encolar(aux1.desencolar());
    }

    while(!aux2.estaVacia()){
        otracola.encolar(aux2.desencolar());
    }

    return iguales;
    }
}