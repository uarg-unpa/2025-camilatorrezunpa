//11. Escribe un método recursivo que cuente las ocurrencias de un número dado en un arreglo de enteros. 
//Pista: Compara el elemento actual con el número buscado y llama recursivamente con el resto del arreglo. 

public class ContOcurrencias {

    public static int contOcurrencias (int [] arreglo, int n, int i){
        if (i == arreglo.length){
            return 0;
        } else {
            if (arreglo[i] == n){
                return 1 + contOcurrencias(arreglo, n, i + 1);
            } else {
                return contOcurrencias(arreglo, n, i+1);
            }
        }
    }
}

