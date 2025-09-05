package Ejercicio2_2.Ejercicio2_2;

public class Cancion {
    private String titulo;
    private String artista;
    private double duracion;

    public Cancion(String titulo, String artista, double duracion) {
        this.titulo = titulo;
        this.artista = titulo;
        this.duracion = duracion;
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return this.artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getDuracion() {
        return this.duracion;
    }
    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }
}
