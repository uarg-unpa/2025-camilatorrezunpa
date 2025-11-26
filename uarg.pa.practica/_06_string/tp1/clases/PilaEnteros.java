
    public class PilaEnteros {
    private int[] elementos; // Array para almacenar los elementos
    private int cima;       
    private final int MAX = 10; // Capacidad máxima de la pila

    // Constructor: inicializa el array y la cima
    public PilaEnteros() {
        elementos = new int[MAX]; // Crear el array
        cima = -1;
        // Completar: inicializar cima
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {
        return cima == -1;
        // Completar: devolver true si cima indica que la pila está vacía

    }

    // Verifica si la pila está llena
    public boolean estaLlena() {
        return cima == MAX -1;
        // Completar: devolver true si cima está en el límite del array
    }

    // Agrega un elemento en la cima (push)
    public void meter(int elem) {
        cima++;
        elementos[cima] = elem;
              // Completar: incrementar cima y asignar el elemento
    }

    // Saca y devuelve el elemento de la cima (pop)
    public int sacar() {
        int aux = elementos[cima];
        cima--;
        return aux;
                  // Completar: guardar el elemento de la cima, decrementar cima y devolverlo
         }
}
