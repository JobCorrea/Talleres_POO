public class Producto {
    double precio; 
    int stock; 
    String nombre;
    
    void mostrarProducto(){
        System.out.println("Nombre: "+ nombre );
        System.out.println("Precio: $"+ precio);
        System.out.println("Stock: "+ stock);
        System.out.println("__________________");
    }

    public static void main(String[] args) {
        //Primer Producto
        Producto producto1= new Producto();
        producto1.nombre = "Crema para Rizos";
        producto1.precio = 15.000;
        producto1.stock = 30 ;

        // Segundo Producto
        Producto producto2 = new Producto();
        producto2.nombre = "Smartphone";
        producto2.precio = 1200.00;
        producto2.stock = 10;

        // Tercer Producto
        Producto producto3 = new Producto();
        producto3.nombre = "Auriculares";
        producto3.precio = 150.00;
        producto3.stock = 20;

        // Mostrar estados
        producto1.mostrarProducto();
        producto2.mostrarProducto();
        producto3.mostrarProducto();
        

    }
}
