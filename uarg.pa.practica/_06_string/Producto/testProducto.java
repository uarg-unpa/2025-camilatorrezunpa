import java.util.Scanner;

public class testProducto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto");
        String nombre1 = scanner.nextLine();

        System.out.println("Ingrese el precio del producto");
        double precio1 = scanner.nextDouble();

        System.out.println("Ingrese la cantidad en stock");
        int cantidadEnStock1 = scanner.nextInt();

        Producto p1 = new Producto ("nombre1", precio1, cantidadEnStock1);

        System.out.println("Ingrese el nombre del producto2");
        String nombre2 = scanner.nextLine();

        System.out.println("Ingrese el precio del producto2");
        double precio2 = scanner.nextDouble();

        System.out.println("Ingrese la cantidad em stock");
        int cantidadEnStock2 = scanner.nextInt();

        Producto p2 = new Producto ("nombre2", precio2 , cantidadEnStock2);

        System.out.println("Ingrese la cantidad que va a comprar");
        System.out.pritnln(p1.getcantidadEnStock);


        
        
        



    }
    
}
