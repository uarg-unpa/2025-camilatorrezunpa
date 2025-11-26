package Punto1;

public class testPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("Camila");

        p1.setNombre("Maitena");
        p1.setEdad(13);
        p1.setDni("12345678");
        p1.setSexo('M');
        p1.setPeso(60);
        p1.setAltura(1.55);

        System.out.println(p1);
        System.out.println("¿Es mayor de edad? " + p1.esMayorDeEdad());

        System.out.println(p2);
    }
}
