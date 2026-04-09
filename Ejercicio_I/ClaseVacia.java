
/*Corrige una clase donde falte el nombre de la clase. #2 */
//Ejemplo Incorrecto
public class {
    String nombre;
    int edad;

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
/*falta el nombre de la clase después de public class. Eso genera un error de compilación porque Java no sabe cómo identificar la clase
 */

//EJEMPLO CORREGIDO
public class Estudiante {
    String nombre;
    int edad;

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Los de la X";
        estudiante1.edad = 25;

        estudiante1.mostrarInfo();
    }
}
/*En Java, toda clase debe tener un nombre porque es la etiqueta que permite crear objetos a partir de ella.
 */