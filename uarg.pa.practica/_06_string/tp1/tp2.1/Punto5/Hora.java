
public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora(int hora, int minutos, int segundos){
          if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }
    public int getHora() {
        return this.hora;
    }
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        }
    }
    public int getMinutos() {
        return this.minutos;
    }
    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        }
    }
    public int getSegundos() {
        return this.segundos; 
    }
    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        }
    }

    public int getHoraenMinutos() {
        return this.hora * 60 + this.minutos;
    }

    public String mostrarHora() {
        String hora = " " + this.hora;
        String minutos = " " + this.minutos;
        String segundos = " " + this.segundos;

        if (this.hora < 10) hora = "0" + hora;
        if (this.minutos < 10) minutos = "0" + minutos;
        if ( this.segundos < 10) segundos = "0" + segundos;
        
        return hora + ":" + minutos + ":" + segundos + ":";
    }
}

