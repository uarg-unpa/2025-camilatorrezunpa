public class Libro {
    //atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int cantidadPaginas;
    //constructores
    public Libro (String titulo, String autor, int anioPublicacion, int cantidadPaginas) {
        this.titulo=titulo;
        this.autor=autor;
        this.anioPublicacion=anioPublicacion;
        this.cantidadPaginas=cantidadPaginas;
    }
    //metodos set y get
    public void setTitulo(String titulo) {
        this.titulo=titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    //metodos
    public boolean esReciente(){
        if (this.anioPublicacion > 2010) {
        return true;
        }else {
        return false;
    }
}
    
    



    