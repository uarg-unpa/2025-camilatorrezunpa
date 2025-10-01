package Punto2;

public class testEstacion {
    public static void main(String[] args) {
        EstacionServicio e1 = new EstacionServicio(1000, 5000, "Diesel");

        System.out.println("Operando sobre E1: ");
        if(e1.cargarCombustible(900)) {
            System.out.println("E1: Cargado");
        } else {
            System.err.println("E2: Error al cargar.");
        }

        if (e1.nivelCuidado()) {
            System.out.println("E1: NIVEL CUIDADOO");
        }

        System.out.println("E1: " + e1.estadoActual());
    }
    
}
