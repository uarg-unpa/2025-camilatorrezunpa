package Punto5;

public class testEmpleado {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado(52321, 1.399999, 200.000, 5, true, 3);

        System.out.println("Datos del empleado: ");
        System.out.println(emp1.toString());
        System.out.println("Complemento por horas extras: $" + emp1.calcularComplementoHorasExtras());
        System.out.println("Sueldo bruto: $" + emp1.calcularSueldoBruto());
        System.out.println("Retenciones: $" + emp1.calcularRetenciones());
    }
}
