/*Corrige un programa donde se confunden atributos con variables locales del método. #4 */
// Ejemplo incorrecto
public class Programa {
    String nombre;
    int fecha;

    void mostrarInfo() {
        // Aquí se crean variables locales con los mismos nombres
        String nombre = "Ana";
        int edad = 20;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + fecha);
    }

    public static void main(String[] args) {
        Programa prom = new Programa();
        prom.nombre = "Carlos";
        prom.fecha = 25;

        prom.mostrarInfo(); //  No muestra los atributos del objeto
    }
}/*el método ignora los atributos del objeto y usa las variables locales, lo que rompe la lógica.
 */
//Ejemplo corregido
public class Programa {
    String nombre;
    int fecha;

    void mostrarInfo() {
        // Usamos directamente los atributos del objeto
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + fecha);
    }

    public static void main(String[] args) {
        Programa prom = new Programa();
        prom.nombre = "Carlos";
        prom.fecha = 25;

        prom.mostrarInfo(); // Muestra los atributos del objeto
    }
}