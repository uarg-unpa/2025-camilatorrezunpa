package Punto4;

public class Articulo {
    private String descripcion;
    private double precio;
    private int codigo;
    private int stock;
    
    public Articulo(String descripcion, double precio, int codigo, int stock){
        this.descripcion = descripcion;
        this.precio = precio;
        this.codigo = codigo;
        this.stock = stock;
    }

    public void incrementarStock(int cantidad){
        if(cantidad > 0){
            this.stock +=cantidad;
        }
    }

    public void decrementarStock(int cantidad){
        if(cantidad > 0 && cantidad <= this.stock){
            this.stock -=cantidad;
        }
    }

    public String toString(){
        return "[Articulo: descripcion:" + descripcion + ", precio: " + precio + ", codigo: " + codigo + ", stock: " + stock + "]";
    }
}


