public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;
    private Domicilio domicilio;

    public Persona(String nombre){
        if(nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        }
        this.domicilio = new Domicilio("", 0);
    }
    
    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura, Domicilio domicilio){
        if(nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        }
        if (edad >= 0){
            this.edad = edad;
        }
        if (dni != null && !dni.trim().isEmpty()){
            this.dni = dni;
        }
        if (comprobarSexo(sexo)) {
            this.sexo = sexo;
        }
        if (peso >= 0){
            this.peso = peso;
        }
        if (altura >= 0){
            this.altura = altura;
        }
 
        this.domicilio = domicilio;
    
    }

    public boolean esMayorDeEdad(){
        if (edad >= 18)
            return true;
        else 
            return false;   
    }
    public boolean comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M')
            return true;
        else 
            return false;

    }

    public Domicilio getDomicilio(){
        return domicilio;
    }

    public String toString(){
        return "Persona [nombre:" + nombre + ", edad:" + edad + ", dni:" + dni + ", sexo:" + sexo + ", peso:" + peso + ", altura:" + altura + ", domicilio:" + domicilio + "]";
    }

    public String infoDomicilio() {
        return "Domicilio de " + nombre + ": " + domicilio + ". ¿Completo? " + domicilio.esCompleto();
    }

    public boolean vivenEnLaMismaCalle(Domicilio otroDomicilio) {
        String callePersona = this.domicilio.getCalle();

        String calleOtraPersona = this.domicilio.getCalle();

        if (callePersona.equals(calleOtraPersona)){
            return true;
        } else {
            return false;
        }
    }
}

