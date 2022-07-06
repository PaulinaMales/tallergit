public class Canasta {

    private String producto;
    private double precio;
    private int cantidad;

    //////////////////////////////////////////////////////////////
    public Canasta (String producto, double precio, int cantidad){

        this.producto=producto;
        this.precio= precio;
        this.cantidad= cantidad;
    }
    //////////////////////////////////////////////////////////////

    //METODO SET
    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //METODO GET
    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    ////////////////////////////////////////////////////////////////////
    public void imprimirCanasta(){

        System.out.println("Producto: "+this.getProducto());
        System.out.println("Precio "+this.getPrecio()+"$");
        System.out.println("Cantidad: "+this.getCantidad()+" unidades");
        System.out.println("");

    }
}
