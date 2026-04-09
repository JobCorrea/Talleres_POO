public class Curso {
    String nombre;
    String profesor;
    int duracion; 

    
    public Curso(String nombre, String profesor, int duracion) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.duracion = duracion;
    }

    
    void mostrarInfo() {
        System.out.println("Curso: " + nombre);
        System.out.println("Profesor: " + profesor);
        System.out.println("Duracion: " + duracion + " horas");
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        
        Curso curso1 = new Curso("Programacion en Java", "Arrieta Arrieta", 40);
        Curso curso2 = new Curso("Logistica Empresarial", "Isabel Padilla", 30);

        
        curso1.mostrarInfo();
        curso2.mostrarInfo();
    }
}
/* Aunque curso1 y curso2 tienen datos distintos (nombre, profesor y duración), ambos pertenecen a la misma clase Curso porque 
comparten la misma estructura y comportamiento. La clase define el molde  (atributos y métodos), y cada objeto es una
 instancia concreta con valores propios. 
*/