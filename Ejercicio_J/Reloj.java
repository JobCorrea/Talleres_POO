import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Reloj {
    LocalTime hora;

    public Reloj(LocalTime hora){
        this.hora = hora;
    }

    void mostrarHora(){
        // Formato hh:mm:ss a → 12 horas con AM/PM
        DateTimeFormatter formato12 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("La hora es: " + hora.format(formato12));
    }

    public static void main(String[] args) {
        Reloj time = new Reloj(LocalTime.now());
        time.mostrarHora();
    }
}