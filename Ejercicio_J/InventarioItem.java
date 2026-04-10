public class InventarioItem {
    String nombre;
    int cantidad;
    double precioUnitario;

    public InventarioItem(String nombre, int cantidad, double  precioUnitario){
        this.nombre = nombre;
        this. cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    //metodo calcular valor total del inventario del objeto. 
    double calcular(){
        return cantidad * precioUnitario;
    }

    void mostrarInventario(){
        System.out.println("Nombre del articulo: "+ nombre);
        System.out.println("Cantida: "+cantidad);
        System.out.println("Precio unitario: "+ precioUnitario);
        System.out.println("________________________________");
        System.out.println("El valor total es: "+calcular());
    } 
    
    public static void main(String[] args) {
        InventarioItem items = new InventarioItem("Post day", 15, 2000);
        InventarioItem items1 = new InventarioItem("Game Pass", 150, 30000);
        
        items.mostrarInventario();
        items1.mostrarInventario();
    }
    
}
