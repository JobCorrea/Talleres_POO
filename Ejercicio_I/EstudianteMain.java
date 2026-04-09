/*Corrige una clase donde el estudiante crea la clase, pero nunca construye el objeto en main.#6  */
//Ejemplo Incorrecto
public class EstudianteMain {
    String nombre;
    int edad;
    String curso;

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
    }

    public static void main(String[] args) {
        // Error: nunca se crea el objeto
        // mostrarInfo(); // Esto no funciona porque no hay objeto instanciado
    }
}

//Ejemplo Corregido
public class EstudianteMain {
    String nombre;
    int edad;
    String curso;

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        //  Crear objetos con new
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Carlos";
        estudiante1.edad = 20;
        estudiante1.curso = "Programación en Java";

        Estudiante estudiante2 = new Estudiante();
        estudiante2.nombre = "Ana";
        estudiante2.edad = 22;
        estudiante2.curso = "Logística Empresarial";

        // Usar el método en los objetos creados
        estudiante1.mostrarInfo();
        estudiante2.mostrarInfo();
    }
}