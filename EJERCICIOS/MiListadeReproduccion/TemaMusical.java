package EJERCICIOS.MiListadeReproduccion;

public class TemaMusical {
    private String interprete;
    private String genero;
    private int anio;

    public TemaMusical(String interprete, String genero, int anio){
        this.interprete = interprete;
        this.genero = genero;
        this.anio = anio;
    }

    public String getInterprete(){
        return interprete;
    }

    public void setInterprete(String interprete){
        this.interprete = interprete;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public int getAnio (){
        return anio;
    }

    public void setAnio(int anio){
        this.anio = anio;
    }

    public String toString(){
        return interprete + "-" + genero + "(" + anio + ")"; 
    }
}
