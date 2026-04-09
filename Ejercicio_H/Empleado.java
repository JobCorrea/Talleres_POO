public class Empleado {
    String nombre;
    int edad;
    String cargo;
    double salario;

    // Constructor
    public Empleado(String nombre, int edad, String cargo, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Método para mostrar información
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: $" + salario);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Yo mismo", 28, "Ingeniero de Software", 3500000);
        empleado1.mostrarInfo();
    }
}
/*Modelar un Empleado con clases y objetos es mejor que usar variables sueltas porque permite organizar la información en una estructura 
clara y reutilizable. Con una clase, cada empleado se convierte en un objeto independiente con sus propios atributos y métodos, lo que facilita 
la lectura, el mantenimiento y la expansión del código. En cambio, con variables sueltas es más fácil confundirse, duplicar datos o cometer 
errores al llamarlas.
 */