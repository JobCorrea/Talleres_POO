import java.util.ArrayList;

public class Negocio {
    String nombreNegocio;
    String ceo;
    String redSocial;
    String tipoNegocio;
    ArrayList<String> productos;

    public Negocio(String nombreNegocio, String ceo, String redSocial, String tipoNegocio){
        this.nombreNegocio = nombreNegocio;
        this.ceo = ceo;
        this.redSocial = redSocial;
        this.tipoNegocio = tipoNegocio;
        this.productos = new ArrayList<>();
    }

    void mostrarInfo(){
        System.out.println("Nombre del negocio: " + nombreNegocio);
        System.out.println("CEO: " + ceo);
        System.out.println("Red social: " + redSocial);
        System.out.println("Tipo de negocio: " + tipoNegocio);
        System.out.println("Productos: " + productos);
        System.out.println("-------------------------");
    }

    void agregarProducto(String producto){
        productos.add(producto);
    }

    void quitarProducto(String producto){
        productos.remove(producto);
    }

    public static void main(String[] args) {
       // Objeto 1
        Negocio n1 = new Negocio("Kinkora", "Isabel Padilla", "Instagram", "Emprendimiento - Cuidado del cabello");
        n1.agregarProducto("Crema para peinar Rizos");
        n1.agregarProducto("Shampoo para rizos");
        n1.agregarProducto("Tratamiento para lizos");

        // Objeto 2
        Negocio n2 = new Negocio("Granizados-Don Tubo", "Job yo", "Facebook", "Alimentos & Bebidas");
        n2.agregarProducto("Gomitas enchiladas");
        n2.agregarProducto("Gomitas con Vodka");
        n2.agregarProducto("Granizado Boom");

        // Objeto 3
        Negocio n3 = new Negocio("La Casa del Sabor", "Luis Fernandez", "TikTok", "Restaurante");
        n3.agregarProducto("Pizza");
        n3.agregarProducto("Hamburguesa");
        n3.agregarProducto("Ensalada");

        // Objeto 4
        Negocio n4 = new Negocio("Aseso Bella", "Susana Cuadro", "Instagram y TikTok", "Belleza Femenina");
        n4.agregarProducto("Labiales");
        n4.agregarProducto("Maquillajes");
        n4.agregarProducto("Perfumes");

        // Objeto 5
        Negocio n5 = new Negocio("A pleno SOL", "Vilma Bello", "Facebook", "Accesorios");
        n5.agregarProducto("Relojes");
        n5.agregarProducto("Cadenas");
        n5.agregarProducto("Anillos");

        // Mostrar información de todos los negocios
        n1.mostrarInfo();
        n2.mostrarInfo();
        n3.mostrarInfo();
        n4.mostrarInfo();
        n5.mostrarInfo();

        // Probar métodos con n1
        n1.quitarProducto("Tratamiento para lizos");
        n1.mostrarInfo();
        n1.agregarProducto("Tratamiento para rizos");
        n1.mostrarInfo();
    }
}