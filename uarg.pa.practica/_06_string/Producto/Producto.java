public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;
    private int stock;

    public Producto(String nombre, double precio, int cantidadEnStock, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
        this.stock = stock;
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

    public int getcantidadEnStock(){
        return cantidadEnStock;
    }
    public void setcantidadEnStock(int cantidadEnStock){
        this.cantidadEnStock = cantidadEnStock;
    }

    public int getStock(){
        return stock;
    }
    public void setStock(int stock){
        this.stock = stock;
    }

    public boolean hayStock(int cantidad){
        if(stock > cantidadEnStock){
            return true;
        } else {
            return false;
        }
    }

    public void vender(int cantidad){
        if(hayStock(cantidad)){
            this.cantidadEnStock = cantidadEnStock--;
        }
    }

    public void aumentarStock(int cantidad){
        if(hayStock(cantidad)){
            this.cantidadEnStock = cantidadEnStock++;
        }
    }

    public void tieneMasStockQue(Producto otroProducto){
       if (this.cantidadEnStock > otroProducto.getStock());
        return true;
    }else{
        return false;
    }

    public String toString(){
        return "Producto: [nombre:" + nombre + ", precio: " + precio + ", cantidadEnStock: " + cantidadEnStock + ", stok: " + stock +"]";
    }
}
    
