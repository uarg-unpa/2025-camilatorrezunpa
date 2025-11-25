//11. Escribe un método recursivo que cuente las ocurrencias de un número dado en un arreglo de enteros. 
//Pista: Compara el elemento actual con el número buscado y llama recursivamente con el resto del arreglo. 

public class ContOcurrencias {

    public static int contOcurrencias (int [] arreglo, int n, int x){
        if (n < 0){
            return 0;
        } 

        int suma = 0;

        if (arreglo[n] == x){
            suma = 1;
        } 

        return suma + contOcurrencias(arreglo, n - 1, x);

    }
}
