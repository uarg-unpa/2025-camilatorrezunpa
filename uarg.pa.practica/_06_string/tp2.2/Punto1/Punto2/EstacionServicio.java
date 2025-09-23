package Punto2;

public class EstacionServicio {
    private int litros;
    private int capacidadMaxima;
    private String combustible;

    public EstacionServicio(int litros, int capacidadMaxima, String combustible){
        this.litros = litros;
        this.capacidadMaxima = capacidadMaxima;
        this.combustible = combustible;
    }

    public int getLitros(){
        return litros;
    }
    public void setLitros(int litros){
        if(litros >=0 && litros <= capacidadMaxima){
            this.litros = litros;
        }
    }

    public int getcapacidadMaxima(){
        return capacidadMaxima;
    }
    public void setcapacidadMaxima(int capacidadMaxima){
        if(capacidadMaxima >= litros){
            this.capacidadMaxima = capacidadMaxima;
        }
    }

    public String getCombustible(){
        return combustible;
    }
    public void setCombustible(String combustible){
        this.combustible = combustible;
    }

    public boolean cargarCombustible(int cantidad) {
        if(cantidad <= 0 || cantidad > litros){
            return false;
        } else {
            litros -= cantidad;
            return true;
        }
    }

    public boolean reponerCombustible(int cantidad) {
        if(cantidad <=0 || litros + cantidad > capacidadMaxima){
            return false;
        } else {
            litros += cantidad;
            return true;
        }
    }

    public boolean nivelCuidado() {
        return litros < 10;
    }

    public String estadoActual(){
        return litros + " / " + capacidadMaxima + " litros de " + combustible;
    }

    public String toString(){
        return "[Estacion de servicio: litros:" + litros + ", capacidadMaxima" + capacidadMaxima + ", tipo de combustible: " + combustible + "]";
    }
}
