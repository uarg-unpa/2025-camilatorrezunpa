public class VerificadorExpresion{
    public boolean verificar(String expresion){
        PilaExpresion pila = new PilaExpresion();

        for(int i = 0; i < expresion.length(); i++){
            char c = expresion.charAt(i);

            if(c == '(' || c == '[' || c == '{'){
                pila.meter(c);
            } else if (c == ')' || c == ']' || c == '}'){
                if(pila.estaVacia()){
                    return false;
                }

                char tope = pila.sacar();
                if (!coinciden(tope, c)) {
                    return false; 
                }
            }
        }
        return pila.estaVacia();
    }

    private boolean coinciden(char abre, char cierra) {
    return (abre == '(' && cierra == ')') || (abre == '[' && cierra == ']') || (abre == '{' && cierra == '}');
    }
}