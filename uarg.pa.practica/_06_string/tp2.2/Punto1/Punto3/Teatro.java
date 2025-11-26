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
    
    public Obra getObra(int index){
        if(index >=0 && index < obras.length) {
            return obras[index];
        }
        return null;
    }

    public void setObra(int index, Obra obra){
        if (index >= 0 && index < obras.length){
            obras[index] = obra;
        }
    }

    public void mostrarObras(){
        System.out.println("Obras en cartelera: ");
        for(int i = 0; i < obras.length; i++){
            if(obras[i] != null){
                System.out.println((i+1) + ". " + obras[i]);
            } else {
                System.out.println((i+1) + ". [Sin obra asignada]");
            }
        }
    }
}
