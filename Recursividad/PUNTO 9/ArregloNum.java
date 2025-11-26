//9. Escribe un método recursivo que determine si un número está presente en un arreglo. Devuelve true si el número se encuentra en el arreglo y false en caso contrario. 
//Pista: El caso base es cuando el tamaño del arreglo es 0, en cuyo caso el número no está presente. De lo contrario, verifica el primer elemento del arreglo y llama recursivamente con el resto del arreglo.

public class ArregloNum {
    
    public static boolean estaPresenteArreglo(int [] arreglo, int num, int i){
        if (i < 0){        // if (i == arreglo.length)
            return false;
        } 

        if (arreglo[i] == num){
            return true;
        }
        
        return estaPresenteArreglo(arreglo, num, i - 1); // +1
    }
}
