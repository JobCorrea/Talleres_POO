/* ATRIBUTOS        METODOS                                                   OBJETOS REALES
- nombre            - mostrarInfo()                                           - Hospital Universitario de Cartagena
- departamento      - asignarDoctor(String nuevoDoctor)                       - Departamento: Pediatría
- doctor            - asignarPaciente(String nuevoPaciente, int nuevaEdad)    - Doctor: Juan Pérez
- paciente                                                                    - Paciente: María López
- edadPaciente                                                                - Edad del paciente: 8 años
 */
public class Hospital {
    String nombre;
    String departamento;
    String doctor;
    String paciente;
    int edadPaciente;

    public Hospital(String nombre, String departamento, String doctor, String paciente, int edadPaciente){
        this.nombre = nombre;
        this.departamento = departamento;
        this.doctor = doctor;
        this.paciente = paciente;
        this.edadPaciente = edadPaciente;
    }

    void mostrarInfo(){
        System.out.println("Hospital: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Doctor: " + doctor);
        System.out.println("Paciente: " + paciente);
        System.out.println("Edad del paciente: " + edadPaciente + " anos");
        System.out.println("-------------------------");
    }

    void asignarDoctor(String nuevoDoctor){
        doctor = nuevoDoctor;
    }

    void asignarPaciente(String nuevoPaciente, int nuevaEdad){
        paciente = nuevoPaciente;
        edadPaciente = nuevaEdad;
    }

    public static void main(String[] args) {
        Hospital h1 = new Hospital("Hospital Universitario de Cartagena", 
                                   "Pediatria", 
                                   "Juan Perez", 
                                   "Maria López", 
                                   8);

        Hospital h2 = new Hospital("Hospital Municipal de Arjona", 
                                   "Cardiologia", 
                                   "Ana Torres", 
                                   "Luis Fernandez", 
                                   56);

        h1.mostrarInfo();
        h2.mostrarInfo();

        // Probando metodos
        h1.asignarDoctor("Carlos Gomez"); // cambiar doctor
        h1.asignarPaciente("Pedro Martinez", 12); // cambiar paciente y edad
        h1.mostrarInfo();
    }
}
