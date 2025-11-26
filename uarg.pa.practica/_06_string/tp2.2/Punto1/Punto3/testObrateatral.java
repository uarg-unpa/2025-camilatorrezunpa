public class testObrateatral {
    public static void main(String[] args) {
        Teatro teatro = new Teatro("Teatro Colon", "Cerrito 628");

        teatro.setObra(0, new Obra("Romeo y Julieta", 20.000));
        teatro.setObra(1, new Obra("Hamlet", 12.500));
        teatro.setObra(2, new Obra("Edipo Rey", 15.900));

        teatro.mostrarObras();

        //cambio el nombre del teatro
        teatro.setNombre("Teatro Cervantes");

        //modifico precio de la obra
        teatro.getObra(1).setPrecio(13.000);

        System.out.println("n/actualizacion");
        teatro.mostrarObras();
    }
}
