public class Teatro {
    private String nombre;
    private String direccion;
    private Obra[] obras;

    public Teatro(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.obras = new Obra [3];
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public void setObra(Obra obras){
        this.obra = obra;
    }

}
