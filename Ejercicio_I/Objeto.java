/*Corrige un ejemplo donde un objeto intenta acceder a atributos de otro sin referencia adecuada. #5 */
//Ejemplo incorrecto
public class Objeto {
    String nombre;
    int edad;

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
         Objeto obj = new Objeto();
        obj.nombre = "Mesa ";
        obj.edad = 200;

        Objeto obj1 = new Objeto();
        obj1.nombre = "Silla";
        obj1.edad = 150;

        //  Error conceptual: obj intenta acceder directamente a atributos de obj1
        System.out.println(obj1.nombre);
        obj.nombre = obj1.nombre; // confusión de referencias
        obj.mostrarInfo();
    }
}/*Aquí el problema es que se mezclan los atributos de estudiante1 con los de estudiante2 sin un método claro que lo permita.
 */

//Ejemplo corregido
public class Objeto {
    String nombre;
    int edad;

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    // Método que recibe otro objeto como referencia
    void copiarDatosDe(Objeto otro) {
        this.nombre = otro.nombre;
        this.edad = otro.edad;
    }

    public static void main(String[] args) {
        Objeto obj = new Objeto();
        obj.nombre = "Mesa ";
        obj.edad = 200;

        Objeto obj1 = new Objeto();
        obj1.nombre = "Silla";
        obj1.edad = 150;

        // Ahora obj copia datos de obj1 con un método explícito
        obj.copiarDatosDe(obj1);
        obj.mostrarInfo();
    }
}