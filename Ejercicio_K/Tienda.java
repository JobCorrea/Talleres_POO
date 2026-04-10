/*ATRIBUTOS         METODOS                                 OBJETO REAL
  - nombre          - mostrarInfo                           - Supermercado Exito
  - tipoTienda      - contratarTrabajadores(int cantidad)   - Tipo de tienda: Alimentos
  - domicilio       - despedirTrabajadores(int cantidad)    - Domicilio: Si
  - trabajadores                                            - Trabajadores: 50
                                                            - Celular: 3001234567
 */
public class Tienda {
    String nombre;
    String tipoTienda;
    boolean domicilio;
    int trabajadores;

    // Constructor
    public Tienda(String nombre, String tipoTienda, boolean domicilio, int trabajadores){
        this.nombre = nombre;
        this.tipoTienda = tipoTienda;
        this.domicilio = domicilio;
        this.trabajadores = trabajadores;
    }

    // Métodos
    void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo de tienda: " + tipoTienda);
        System.out.println("Servicio a domicilio: " + (domicilio ? "Si" : "No")); //ternario
        System.out.println("Numero de trabajadores: " + trabajadores);
        System.out.println("-------------------------");
    }

    void contratarTrabajadores(int cantidad){
        trabajadores += cantidad;
    }

    void despedirTrabajadores(int cantidad){
        if(trabajadores >= cantidad){
            trabajadores -= cantidad;
        }
    }

    public static void main(String[] args) {
        Tienda t1 = new Tienda("Supermercado Exito", "Alimentos", true, 50);

        Tienda t2 = new Tienda("TechWorld", "Tecnologia", false, 20);

        Tienda t3 = new Tienda("Boutique La Moda", "Ropa", true, 10);

        t1.mostrarInfo();
        t2.mostrarInfo();
        t3.mostrarInfo();

        // Probar métodos
        t1.contratarTrabajadores(5); // contratar 5 trabajadores
        t1.mostrarInfo();

        t2.despedirTrabajadores(2); // despedir 2 trabajadores
        t2.mostrarInfo();
    }
}