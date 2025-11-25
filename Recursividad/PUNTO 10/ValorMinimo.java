//10. Escribe un método recursivo que encuentre el valor mínimo en un arreglo de enteros. 
//Pista: Divide el problema en dos partes: el elemento actual y el mínimo de los elementos restantes del arreglo. 

public class ValorMinimo {
    public static int valorMin (int [] arreglo, int n){
        if (n == 0){
            return arreglo[0];
        } 

        int minRestante = valorMin(arreglo, n - 1);

        if (arreglo[n] < minRestante){
            return arreglo[n];
        } else {
            return minRestante;
        }
    }
}
