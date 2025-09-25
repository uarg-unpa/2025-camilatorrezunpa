public class testFecha {
    
    public static void main(String[] args) {
        Fecha f1 = new Fecha(12, 12, 2025);
        System.out.println("Fecha valida: " + f1.mostrarFecha());

        Fecha f2 = new Fecha(31, 2, 2024);
        System.out.println("Fecha invalida: " + f2.mostrarFecha());

        f1.setDia(20);
        f1.setMes(12);
        f1.setAnio(2032);
        System.out.println("Fecha modificada: " + f1.mostrarFecha());

        System.out.println("Dia: " + f1.getDia());
        System.out.println("Mes: " + f1.getMes() + " (" + f1.getNombreMes() + ")");
        System.out.println("Año: " + f1.getAnio());
    }
    
}
