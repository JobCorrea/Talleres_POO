/*Corrige una clase donde el estudiante haya puesto el método fuera de la clase. #1*/
//EJEMPLO INCORRECTO
public class Estudiante {
    String nombre;
    int edad;
}

// El método está fuera de la clase (esto da error)
void mostrarInfo() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
}

//EJEMPLO CORREJIDO
public class Estudiante {
    String nombre;
    int edad;

    // Método dentro de la clase
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Auntuam";
        estudiante1.edad = 20;

        estudiante1.mostrarInfo();
    }
}
//En Java, todos los métodos deben estar dentro de una clase.
