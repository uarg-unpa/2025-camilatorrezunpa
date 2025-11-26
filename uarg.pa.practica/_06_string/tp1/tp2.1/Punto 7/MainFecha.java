public class MainFecha {
    public static void main(String[] args) {

        Fecha f1 = new Fecha(05, 9, 2024);   
        Fecha f2 = new Fecha(23, 5, 2012);
        
        System.out.println("Primera fecha: " + f1.mostrarFecha());
        System.out.println("Segunda fecha: " + f2.mostrarFecha());

        if (f1.getAnio() > f2.getAnio()) {
            System.out.println("La fecha con mayor año es: " + f1.getDia() + "/" + f1.getMes() + "/" + f1.getAnio());
        } else if (f2.getAnio() > f1.getAnio()) {
            System.out.println("La fecha con mayor año es: " + f2.getDia() + "/" + f2.getMes() + "/" + f2.getAnio());
        } else {
            System.out.println("Ambas fechas tienen el mismo año.");
        }
    }
}

