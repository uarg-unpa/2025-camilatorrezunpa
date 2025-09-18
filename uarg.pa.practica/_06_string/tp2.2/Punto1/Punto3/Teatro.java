public class Teatro {
    private String nombre;
    private Direccion direccion;
    private Obra[] obras;

    public Teatro(String nombre, Direccion direccion){
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

    public Direccion getDireccion(){
        return direccion;
    }
    public void setDireccion(Direccion direccion){
        this.direccion = direccion;
    }

    public void setObra(Obra obra){
        this.obra = obra;
    }

}
