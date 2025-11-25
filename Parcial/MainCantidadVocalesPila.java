public class MainCantidadVocalesPila {
    public static void main(String[] args) {
        
        PilaCaracteres p = new PilaCaracteres();

        int cantVocales = contarVocales(p);

        System.out.println("Cantidad de vocales en la pila: " + cantVocales);
    }

    public static int contarVocales(PilaCaracteres p) {
        PilaCaracteres aux = new PilaCaracteres();
        int cant = 0;

        while (!p.estaVacia()) {
            char elem = p.sacar();

            if (esVocal(elem)) {
                cant++;
            }

            aux.meter(elem);
        }

        while (!aux.estaVacia()) {
            p.meter(aux.sacar());
        }

        return cant;
    }
}

