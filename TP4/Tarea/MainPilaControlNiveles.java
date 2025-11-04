package TP4.Tarea;

import java.util.Scanner;

public class MainPilaControlNiveles {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 

       int opcion;

       PilaControlNiveles pila = new PilaControlNiveles();

       do {

        System.out.println("\n=== MENU CONTROL DE NIVELES ===");
        System.out.println("1. Agregar nuevos niveles de energia");
        System.out.println("2. Mostrar nivel que se encuentra en la cima");
        System.out.println("3. Contar ocurrencias de un valor x");
        System.out.println("0. Salir");
        System.out.println("Opcion: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                if(pila.estaLlena()){
                    System.out.println("La pila esta llena, no puede agregar mas niveles");
                } else {
                    System.out.println("Ingrese el nuevo nivel de energia: ");
                    int nivel = sc.nextInt();
                    pila.meter(nivel);
                    System.out.println("Nivel agregado");
                }
                break;
            
            case 2:
                if(pila.estaVacia()){
                    System.out.println("La pila esta vacia");
                } else {
                    System.out.println("El nivel que se encuentra en la cima es: " + pila.verTope());
                }
                break;
            
            case 3:
                if(pila.estaVacia()){
                    System.out.println("No hay niveles");
                } else {
                    System.out.println("Ingrese un valor X que se va a contar");
                    int x = sc.nextInt();
                    int cantidad = pila.contarOcurrencias(x);
                    System.out.println("El valor " + x + " esta " + cantidad + " veces en la pila");

                }
                break;

            case 0:
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opcion invalida. Intente de nuevo");
                break;
                
            } 
       } while (opcion != 0);

        sc.close();
    }
}
