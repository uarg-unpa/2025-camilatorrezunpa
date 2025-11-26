package PUNTO3;
public class testPilaChar {
    public static void main(String[] args) {
        String palabra = "aprobadas";
        PilaChar p = new PilaChar();

        for (int i=0; i < palabra.length(); i++){
            char letra = palabra.charAt(i);
            p.meter(letra);
        }

        while(!p.estaVacia()){
            System.out.print(" " + p.sacar());
        }
    }
}

