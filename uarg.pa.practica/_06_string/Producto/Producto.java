public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    public Producto(String nombre, double precio, int cantidadEnStock){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    public int getCantidadEnStock(){
        return cantidadEnStock;
    }
    public void setCantidadEnStock(int cantidadEnStock){
        this.cantidadEnStock = cantidadEnStock;
    }

    public boolean hayStock(int cantidad){
        return cantidadEnStock >= cantidad;
    }
    

    public boolean vender(int cantidad){
        if(hayStock(cantidad)){
            cantidadEnStock -= cantidad;
            return true;
        }
        return false;
    }

    public void aumentarStock(int cantidad){
        if(hayStock(cantidad)){
           cantidadEnStock += cantidadEnStock;
        }
    }

    public boolean tieneMasStockQue(Producto otro){
       if (this.cantidadEnStock > otro.getCantidadEnStock()){
        return true;
       } else {
        return false;
       }
    }


    public String toString(){
        return "Producto: [nombre:" + nombre + ", precio: " + precio + ", cantidadEnStock: " + cantidadEnStock +"]";
    }
}
    
