public class Producto {
    double precio; 
    int stock; 
    String nombre;

    //Constructor vacio
    public Producto(){}
    //Constructor Con Parametros
    public Producto(double  precio, int stock, String nombre){
        this.precio = precio;
        this.stock = stock;
        this.nombre = nombre;
    }
    
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

        // Objeto usando el constructor con parámetros
        Producto producto2 =new Producto(125.000, 70, "Gorra Triple A");
        

        

        producto1.mostrarProducto();
        producto2.mostrarProducto();
        

    }
}
