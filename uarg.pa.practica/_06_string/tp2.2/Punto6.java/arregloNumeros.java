
public class arregloNumeros {
    private int [] numeros;
    private int cima;
    private final int maxpila = 10;

    public arregloNumeros(){
        numeros = new int[maxpila];
        cima = 0;
    }

    public boolean ingresarNumero(int n){
        if(cima < maxpila) {
            numeros[cima] = n;
            cima++;
            return true;
        } else {
            return false;
        }

    }

    public String obtenerNumeros(){
        if(cima == 0){
            return "El arreglo está vacío.";
        } else {
            String resultado = "";
            for (int i = 0; i < cima; i++) {
                resultado += numeros[i] + " ";
            }
            return resultado.trim();
        }

        public void vaciarArreglo() {
            cima = 0;
        }

        public boolean estaVacio() {
            return cima == 0;
        }

 
        public boolean estaLleno() {
            return cima == maxpila;
        }

    
    }
}

