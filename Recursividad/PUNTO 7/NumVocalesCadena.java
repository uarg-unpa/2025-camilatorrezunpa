//Escribir un método recursivo int vocales(String cd) para calcular el número de vocales de una cadena.

public class NumVocalesCadena {

    public static int vocales(String cd, int i){
        if (i == cd.length()){
            return 0;
        } 

        int suma = 0;
        if(cd.charAt(i) == 'a' || cd.charAt(i) == 'e' || cd.charAt(i) == 'i' || cd.charAt(i) == 'o' || cd.charAt(i) == 'u' || cd.charAt(i) == 'A' || cd.charAt(i) == 'E' || cd.charAt(i) == 'I' || cd.charAt(i) == 'O' || cd.charAt(i) == 'U'){
            suma = 1;
        }

        return suma + vocales(cd, i + 1);
        }
    }