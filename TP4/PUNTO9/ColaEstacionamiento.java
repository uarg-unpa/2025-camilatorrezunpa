package TP4.PUNTO9;

//Un estacionamiento de autos contiene una sola línea, la cual tiene capacidad para 10 autos. Los 
//autos llegan al extremo sur y salen por el norte, si un cliente llega a retirar su auto que no está muy 
//hacia el norte, todos los autos al norte de su auto son retirados, el auto del cliente sale, y los otros 
//autos son colocados de nuevo en el mismo orden en el que estaban originalmente. Cada vez que sale 
//un auto, todos los autos que están al sur son movidos hacia adelante de tal manera que en todo 
//momento todos los espacios vacíos están en la parte sur del estacionamiento.

public class ColaEstacionamiento {
    private int[] elementos;
    private int frente;
    private int fin;
    private final int MAX = 10;

    public ColaEstacionamiento() {
        elementos = new int[MAX];
        frente = 0;
        fin = 0;
    }

    public boolean estaVacia(){
        return fin == 0;
    }

    public boolean estaLlena(){
        return fin == MAX;
    }

    public void encolar(int elem) {
        elementos[fin] = elem;
        fin++;
    }

    public int desencolar(){
        int aux = elementos[frente];
        for(int i = 0; i < fin -1; i++){
            elementos[i] = elementos[i + 1];
        }
        fin--;
        return aux;
    }

    public void retirarAuto(int patente){
        ColaEstacionamiento aux = new ColaEstacionamiento();
        while (!this.estaVacia()) {
        int auto = this.desencolar();
        if (auto == patente) {
            break;
        } else {
            aux.encolar(auto);
        }
    }

    while (!aux.estaVacia()) {
        this.encolar(aux.desencolar());
    }
}
}
