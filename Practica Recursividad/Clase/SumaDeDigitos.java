/* Devuelve la suma de los digitos de un numero entero positivo, ejemplo: sumaDigitos(1234) -> 1+2+3+4= 10
*/
public class SumaDeDigitos {
    public static int sumaDigitos (int n){
        if (n < 10){
            return 0;
        } else {
            return (n % 10) + sumaDigitos (n/10);
        }
    }
}