/*Atributos         Metodos         Objetos Reales
    nombre          mostrarClase    Docentes, con diferentes clases
    asignatura      
    aula
 */
public class Docente{
    String nombre;
    String asignatura;
    String aula;

    public Docente(String nombre, String asignatura,String aula){
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.aula = aula;
    }

    void mostrarClase(){
        System.out.println("Nombre de Docente: "+nombre);
        System.out.println("Asignatura: "+asignatura);
        System.out.println("Aula: "+aula);
        System.out.println("________________________");
    }

    public static void main(String[] args) {
        Docente doc = new Docente("Kener", "Enfermeria", "Bloque C 202");
        Docente doc1 = new Docente("Isabel", "ADM de empresa", "Bloque A 15");
        
        doc.mostrarClase();
        doc1.mostrarClase();
    }

}