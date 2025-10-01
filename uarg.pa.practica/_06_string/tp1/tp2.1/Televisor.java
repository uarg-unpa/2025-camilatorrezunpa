public class Televisor {
    private boolean encendido;
    private int canal;
    private int volumen;
    private int canalAnterior;

    public Televisor() {
        this.encendido = false;
        this.canal = 1;
        this.volumen = 10;
        this.canalAnterior = 1;
    }

    public boolean isEncendido() { 
        return this.encendido; 
    }
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getCanal() {
        return this.canal;
    }
    public void setCanal(int canal) {
        if (canal > 0) {
            this.canalAnterior = this.canal;
            this.canal = canal;
        }
    }
    public int getVolumen() {
        return this.volumen;
    }
    public void setVolumen(int volumen) {
        if (volumen >= 0 && volumen <= 100) {
            this.volumen = volumen;
        }
    }

    public void encender() {
        this.encendido = true;
    }
     
    public void apagar() {
        this.encendido = false;
    }

    public void subirCanal() {
        this.canalAnterior = this.canal++;
    }

    public void bajarCanal() {
        if (this.canal > 1) {
            this.canalAnterior = this.canal--;
        }
    }

    public void subirVolumen() {
        if (this.volumen < 100) {
            this.volumen++;
        }
    }
    
    public void bajarVolumen() { 
        if (this.volumen > 0) {
            this.volumen--;
        }
    }

    public void volverCanalAnterior() {
        int temp = this.canal;
        this.canal = this.canalAnterior;
        this.canalAnterior = temp;
    }
}

