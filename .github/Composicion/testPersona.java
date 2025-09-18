public class testPersona {
    public static void main(String[] args) {
        Domicilio d1 = new Domicilio("Lorenzo", 323);
        Domicilio d2 = new Domicilio("Gotti", 345);
        Domicilio d3 = new Domicilio("Lorenzo", 322);

        Persona p1 = new Persona("Camila", 18, "11111111", 'M', 70.5, 1.80, d1);
        Persona p2 = new Persona("Lucas", 20, "22222222", 'H', 85.5, 1.90, d2);
        Persona p3 = new Persona ("Juan", 19, "33333333", 'H', 82.2, 1.88, d3);

        System.out.println("¿Camila y Juan viven en la misma calle?");
        System.out.println(p1.vivenEnLaMismaCalle(p2.getDomicilio()));

        System.out.println("¿Camila y Lucas viven en la misma calle?");
        System.out.println(p1.vivenEnLaMismaCalle(p3.getDomicilio()));
    }
}
