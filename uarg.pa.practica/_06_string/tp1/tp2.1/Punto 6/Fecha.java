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
        int diasEnMes;
        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasEnMes = 31; break;
            case 4: case 6 : case 11:
                diasEnMes = 30; break;
            case 2:
                if (esBisiesto(a)) {
                    diasEnMes = 29;
                } else {
                    diasEnMes = 28;
                }
                break;
            default:
                return false;
        }

        return d >= 1 && d <= diasEnMes;
    }

    private boolean esBisiesto(int a) {
        return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
    }

    public int getDia(){
        return dia;
    }
    public void setDia(int dia) {
        if (esFechaValida(dia, this.mes, this.anio)) {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        if (esFechaValida(this.dia, mes, this.anio)) {
            this.mes = mes;
        }
    }

    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        if (esFechaValida(this.dia, this.mes, anio)) {
            this.anio = anio;
        }
    }

    public String getNombreMes() {
        String [] nombres = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        return nombres[this.mes - 1];
    }

    public String mostrarFecha() {
        return this.dia + " de " + getNombreMes() + " de " + this.anio;
    }
}