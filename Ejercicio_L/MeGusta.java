import java.util.ArrayList;

public class MeGusta {
    String nombre;
    String actividadPrincipal;
    ArrayList<String> pasatiempos;

    public MeGusta(String nombre, String actividadPrincipal){
        this.nombre = nombre;
        this.actividadPrincipal = actividadPrincipal;
        this.pasatiempos = new ArrayList<>();
    }

    void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Actividad principal: " + actividadPrincipal);
        System.out.println("Pasatiempos: " + pasatiempos);
        System.out.println("-------------------------");
    }

    void agregarPasatiempo(String nuevoPasatiempo){
        pasatiempos.add(nuevoPasatiempo);
    }

    void eliminarPasatiempo(String pasatiempo){
        pasatiempos.remove(pasatiempo);
    }

    public static void main(String[] args) {
        MeGusta persona1 = new MeGusta("Job Correa", "Programar");
        persona1.agregarPasatiempo("Trabajar");
        persona1.agregarPasatiempo("Videojuegos");
        persona1.agregarPasatiempo("Musica");

        persona1.mostrarInfo();

        persona1.eliminarPasatiempo("Videojuegos");
        persona1.mostrarInfo();


    }
}