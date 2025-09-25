package Punto5;

public class Empleado {
    private int legajo;
    private double sueldoBase;
    private double pagoHoraExtra;
    private int horasExtras;
    private boolean casado;
    private int hijos;

    public Empleado(int legajo, double sueldoBase, double pagoHoraExtra, int horasExtras, boolean casado, int hijos){
        this.legajo = legajo;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
        this.horasExtras = horasExtras;
        this.casado = casado;
        this.hijos = hijos;
    }

    public int getLegajo(){
        return legajo;
    }
    public void setLegajo(int legajo){
        this.legajo = legajo;
    }

    public double getsueldoBase(){
        return sueldoBase;
    }
    public void setsueldoBase(double sueldoBase){
        this.sueldoBase = sueldoBase;
    }

    public double getpagoHoraExtra(){
        return pagoHoraExtra;
    }
    public void setpagoHoraExtra(double pagoHoraExtra){
        this.pagoHoraExtra = pagoHoraExtra;
    }

    public int gethorasExtras(){
        return horasExtras;
    }
    public void sethorasExtras(int horasExtras){
        this.horasExtras = horasExtras;
    }

    public boolean isCasado(){
        return casado;
    }

    public int getHijos(){
        return hijos;
    }
    public void setHijos(int hijos){
        this.hijos = hijos;
    }

    public double calcularComplementoHorasExtras(){
        return pagoHoraExtra * horasExtras;
    }

    public double calcularSueldoBruto(){
        return sueldoBase + calcularComplementoHorasExtras();
    }

    public double calcularRetenciones(){
        double porcentaje = casado? 10 : 0;
        porcentaje += hijos;
        return sueldoBase * porcentaje / 100;
    }

    public String toString(){
        return "[Empleado: legajo:" + legajo + ", sueldo base: " + sueldoBase + ", pago horas extras: " + pagoHoraExtra + ", horas extras: " + horasExtras + ", casado: " + casado + ", hijos: " + hijos + "]";
    }
}
