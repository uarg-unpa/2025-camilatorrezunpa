package Punto4;

public class testArticulo {
    public static void main(String[] args) {
        Articulo a1 = new Articulo ("Remera", 15.000, 123456, 5);
        Articulo a2 = new Articulo ("Jean", 60.000, 123457, 15);

        System.out.println("Estado inicial: ");
        System.out.println(a1);
        System.out.println(a2);

        a1.incrementarStock(5);
        a2.decrementarStock(3);
        
        System.out.println("Despues de la modificacion: ");
        System.out.println(a1);
        System.out.println(a2);
    }
}
