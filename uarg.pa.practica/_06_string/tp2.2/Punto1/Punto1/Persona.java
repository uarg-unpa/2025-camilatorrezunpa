package Punto1;
public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = "";
        this.sexo = 'M';
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre) {
        this();
        this.nombre = nombre;
    }
    
    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    private boolean comprobarSexo(char sexo) {
        return sexo == 'M' || sexo == 'H';
    }

    public void setSexo(char sexo){
        if (comprobarSexo(sexo)) {
            this.sexo = sexo;
        }
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni){
        this.dni = dni;
    }

    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override

    public String toString(){
        return "Nombre: " + nombre + ", Edad: " + edad + ", Dni: " + dni + ", Sexo: " + sexo + ", Peso: " + peso + "kg, Altura: " + altura + "m";
    }
}
