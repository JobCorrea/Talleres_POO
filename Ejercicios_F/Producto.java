public class Producto {
    double precio; 
    int stock; 
    String nombre;

    public Producto(double precio, int stock, String nombre){
    this.precio = precio;
    this.stock = stock;
    this.nombre = nombre;
    }
    // Método fábrica estático
    public static Producto crearProductoBasico(double precio, int stock, String nombre){
        return new Producto(precio, stock, nombre);
    }

    void mostrarProducto(){
        System.out.println("Nombre: "+ nombre );
        System.out.println("Precio: $"+ precio);
        System.out.println("Stock: "+ stock);
        System.out.println("__________________");
    }


    public static void main(String[] args) {

        // Crear dos productos usando el método fábrica
        Producto producto1 = Producto.crearProductoBasico(89900, 50, "Audifonos Bluetooth");
        Producto producto2 = Producto.crearProductoBasico(299000, 20, "Smartwatch Deportivo");

        producto1.mostrarProducto();
        producto2.mostrarProducto();
    }

}
