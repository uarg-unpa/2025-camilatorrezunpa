package tp1.tp2;

public class Persona {
//Atributos
    String nombre;
    String apellido;
    int edad;
    int dni;
//Constructor
public Persona(String nombre, String apellido, int edad, int dni)
{
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
    this.dni=dni;
}
//metodos gets y sets
public String getNombre(){
    return this.nombre;
}
public void setNombre(String Nombre)
{
    this.nombre=nombre;
}

//otras operaciones
//persona
public boolean mayorDeEdad()
{
    if(edad>=18)
        return true;
    else
        return false;
}



