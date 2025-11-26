package TP4.Tarea;

public class TestPilaEntero {
    public static void main(String[] args) {
        PilaEntero pila = new PilaEntero();
        pila.meter(5);
        pila.meter(2);
        pila.meter(7);
        pila.meter(8);

        int ocurrencias = pila.contarOcurrencias(3);
        System.out.println("Cantidad de ocurrencias de 5: " + ocurrencias);
        System.out.println("Elementos en la pila:");
        while (!pila.estaVacia()) {
            System.out.println(pila.sacar());
        }
    }
}

