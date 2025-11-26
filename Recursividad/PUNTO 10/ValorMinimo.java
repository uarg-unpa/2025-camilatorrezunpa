//10. Escribe un método recursivo que encuentre el valor mínimo en un arreglo de enteros. 
//Pista: Divide el problema en dos partes: el elemento actual y el mínimo de los elementos restantes del arreglo. 

public class ValorMinimo {
    public static int valorMin (int [] arreglo, int i){
        if (i == arreglo.length - 1){
            return arreglo[i];
        } else {
            int minRestante = valorMin(arreglo, i + 1);
            if(arreglo [i] < minRestante){
                return arreglo[i];
            } else {
                return minRestante;
            }
        }
        
    }
}
