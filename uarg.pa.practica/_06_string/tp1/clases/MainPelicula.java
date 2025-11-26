import java.util.Scanner;

public class MainPelicula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese título de la película:");
        String titulo1 = scanner.nextLine();

        System.out.println("Ingrese director de la película:");
        String director1 = scanner.nextLine();

        System.out.println("Ingrese nombre del género:");
        String nombreGenero1 = scanner.nextLine();
        System.out.println("Ingrese rating del género:");
        int ratingGenero1 = scanner.nextInt();
        System.out.println("Ingrese año de publicación:");
        int año1 = scanner.nextInt();
        System.out.println("Ingrese contenido de la película (edad mínima):");
        int contenido1 = scanner.nextInt();
        System.out.println("Ingrese duración (en horas):");
        int duracion1 = scanner.nextInt();
        scanner.nextLine();

        Genero g1 = new Genero(nombreGenero1, ratingGenero1);
        Pelicula p1 = new Pelicula(titulo1, director1, g1, año1, contenido1, duracion1);

        System.out.println("Ingrese título de la película:");
        String titulo2 = scanner.nextLine();

        System.out.println("Ingrese director de la película:");
        String director2 = scanner.nextLine();

        System.out.println("Ingrese nombre del género:");
        String nombreGenero2 = scanner.nextLine();
        System.out.println("Ingrese rating del género:");
        int ratingGenero2 = scanner.nextInt();
        System.out.println("Ingrese año de publicación:");
        int año2 = scanner.nextInt();
        System.out.println("Ingrese contenido de la película (edad mínima):");
        int contenido2 = scanner.nextInt();
        System.out.println("Ingrese duración (en horas):");
        int duracion2 = scanner.nextInt();

        Genero g2 = new Genero(nombreGenero2, ratingGenero2);
        Pelicula p2 = new Pelicula(titulo2, director2, g2, año2, contenido2, duracion2);

        System.out.println(p1);
        System.out.println("¿Es para adultos? " + p1.esParaAdultos());
        System.out.println("Duración en minutos: " + p1.calcularDuracionMinutos());

        System.out.println(p2);
        System.out.println("¿Es para adultos? " + p2.esParaAdultos());
        System.out.println("Duración en minutos: " + p2.calcularDuracionMinutos());

        scanner.close();
    }
}