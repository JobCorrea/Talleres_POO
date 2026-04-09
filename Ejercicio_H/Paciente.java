public class Paciente {
    String nombre;
    int edad;
    String diagnostico;

    // Constructor
    public Paciente(String nombre, int edad, String diagnostico) {
        this.nombre = nombre;
        this.edad = edad;
        this.diagnostico = diagnostico;
    }

    // Método para mostrar información
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Diagnostico: " + diagnostico);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Pepito ", 30, "Hipertension");
        Paciente paciente2 = new Paciente("Sancho", 45, "Diabetes tipo II");

        paciente1.mostrarInfo();
        paciente2.mostrarInfo();
    }
}
/*Decir “crear un paciente” se entiende en un sentido cotidiano: hablamos de una persona ficticia con nombre, edad y diagnóstico que queremos 
representar en el programa. Es una idea más conceptual, como imaginar un caso clínico.
En cambio, “instanciar la clase Paciente” significa tomar el plano o molde (class Paciente) y generar un objeto concreto en memoria con
valores específicos.
 */