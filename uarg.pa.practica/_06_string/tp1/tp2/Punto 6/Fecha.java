public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        if (esFechaValida(dia, mes, anio)) {
            this.dia = dia;
            this.mes = mes;
            this. anio = anio;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.anio = 2013;
        }
    }
    private boolean esFechaValida(int d, int m, int a) {
        if (a < 1 || m < 1 || m > 12 || d < 1 ) {
            return false;
        } 
        int [] diasPorMes = {31, esBisiesto(a) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (d > diasPorMes[m - ]) {
            return false;

        }

        return true;
        if (a % 4 == 0 && a % 100)
    }
private boolean esBisiesto(int a){
    if (esFechaValida(dia, this.mes, this.anio)) {
            this.dia = dia;
        }
    }
    public int getDia() {
        return this.dia;
    }

    public void setMes(int mes) {
        if (esFechaValida(this.dia, mes, this.anio)) {
            this.mes = mes;
        }
    }
    public int getMes() {
        return this.mes;
    }

    public void setAnio(int anio) {
        if (esFechaValida(this.dia, this.mes, anio)) {
            this.anio = anio;
        }
    }
    public int getAnio() {
        return this.anio;
    }
}

