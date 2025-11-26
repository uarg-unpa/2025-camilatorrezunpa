//Escribir un método recursivo que calcule la siguiente suma: 1 + 2 + 3 + … + (n - 1) + n

public class Suma {
    public static int sumaRec (int n){
        if (n == 1){
            return 1;
        } else {
            return n + sumaRec(n-1);
        }
    }
}