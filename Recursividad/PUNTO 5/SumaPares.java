//Escribir un método recursivo para encontrar la suma de los enteros pares hasta N. 2 + 4 + 6 + … + (n - 2) + n 

public class SumaPares {

    public static int sumaPar(int n){
        if (n == 0){
            return 0;
        } 

        if (n % 2 == 0){
            return n + sumaPar(n-2);
        } else {
            return sumaPar(n-1);
        }
    }
}
