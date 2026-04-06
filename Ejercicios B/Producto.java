public class Producto {
    String precio; 
    int stock; 
    String nombre;
    
    void mostrarProducto(){
        System.out.println("Nombre: "+ nombre );
        System.out.println("Precio: "+ precio);
        System.out.println("Stock: "+ stock);
    }

    public static void main(String[] args) {
        Producto producto1= new Producto();
        producto1.nombre = "Crema para Rizos";
        producto1.precio = "$15.000";
        producto1.stock = 30 ;

        producto1.mostrarProducto();
    }
}
