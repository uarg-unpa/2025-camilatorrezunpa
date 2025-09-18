public class Domicilio {
    private String calle;
    private int numero;

    public Domicilio(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public boolean esCompleto() {
        return calle != null && !calle.trim().isEmpty() && numero > 0;
    }

    @Override
    public String toString() {
        return calle + " " + numero;
    }
}
