/*Corrige un programa donde se intenta usar un objeto sin haberlo creado. #3 */
//EJEMPLO INCORRECTO
public class Persona {
    String nombre;
    int edad;

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
        Persona persona1; // declarado pero NO creado
        persona1.nombre = "Ana"; // ERROR: objeto no inicializado
        persona1.edad = 39;
        persona1.mostrarInfo();
    }
}
/*Aquí el error ocurre porque persona1 fue declarado pero nunca se creó en memoria con new.
 */

//EJEMPLO CORREGIDO
public class Persona {
    String nombre;
    int edad;

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
        // Crear el objeto con new
        Estudiante persona1 = new Estudiante();
        persona1.nombre = "Rut";
        persona1.edad = 30;
        persona1.mostrarInfo();
    }
}