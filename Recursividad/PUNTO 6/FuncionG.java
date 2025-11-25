//6. Suponer que la función G está definida recursivamente de la siguiente forma: G(x, y) = 1 sí x ≤ y / G(x, y+1) + 1 sí y < x Si x e y son enteros positivos. 
//a) Escribir el método recursivo. 
//b) Encontrar el valor de G(8, 6). 
//c) Encontrar el valor de G(100, 10). 

public class FuncionG {
    
    public static int funcionG (int x, int y){
        if (x <= y){
            return 1;
        } else {
            return funcionG(x, y + 1) + 1;
        }
    }
    public static void main(String[] args) {
        System.out.println("G(8,6) = " + funcionG(8,6));
        System.out.println("G(100,10) = " + funcionG(100,10));
    }
}