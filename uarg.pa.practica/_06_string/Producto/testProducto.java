import java.util.Scanner;

public class testProducto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto 1: ");
        String nombre1 = scanner.nextLine();

        System.out.println("Ingrese el precio del producto 1: ");
        double precio1 = scanner.nextDouble();

        System.out.println("Ingrese la cantidad en stock del producto 1: ");
        int stock1 = scanner.nextInt();

        scanner.nextLine();

        Producto p1 = new Producto (nombre1, precio1, stock1);

        System.out.println("Ingrese el nombre del producto 2: ");
        String nombre2 = scanner.nextLine();

        System.out.println("Ingrese el precio del producto 2: ");
        double precio2 = scanner.nextDouble();

        System.out.println("Ingrese la cantidad en stock del producto 2: ");
        int stock2 = scanner.nextInt();

        Producto p2 = new Producto (nombre2, precio2 , stock2);

        //Vender una cantidad del producto1

        System.out.println("Ingrese la cantidad que desea vender de " + p1.getNombre() + ": ");
        int cantidad = scanner.nextInt();
        if(p1.vender(cantidad)){
            System.out.println("Se vendieron " + cantidad + " unidades de " + p1.getNombre());
        } else {
            System.out.println("No se pudo vender, falta de stock.");
        }

        //aumentar stock del p2
        p2.aumentarStock(10);
        System.out.println("Se aumento el stock de: " + p2.getNombre() + " en 10 unidades.");

        //mostrar quien tiene mas stock
        if (p1.tieneMasStockQue(p2)) {
            System.out.println("El producto que tiene mas stock es: " + p1.getNombre());
        } else if (p2.tieneMasStockQue(p1)) {
            System.out.println("El producto con más stock es: " + p2.getNombre());
        } else {
            System.out.println("Ambos productos tienen la misma cantidad de stock.");
        }

        scanner.close();
    }
}
