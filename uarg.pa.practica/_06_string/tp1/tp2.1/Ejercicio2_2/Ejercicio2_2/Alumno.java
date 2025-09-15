package Ejercicio2_2.Ejercicio2_2;

public class Alumno {
    private String nombre;
    private String apellido;
    private String dni;

    public Alumno(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getDni() {
        return this.dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
}
