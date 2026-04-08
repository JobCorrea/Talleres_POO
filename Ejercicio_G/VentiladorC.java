import java.util.Scanner;

public class VentiladorC {
    String marca;
    int velocidad;
    boolean encendido;

    public VentiladorC(String marca, int velocidad, boolean encendido) {
        this.marca = marca;
        this.velocidad = velocidad;
        this.encendido = encendido;
    }

    void encender() {
        encendido = true;
        System.out.println("Ventilador prendido");
        System.out.println("________________________");
    }

    void apagar() {
        encendido = false;
        velocidad = 0; // al apagar, velocidad vuelve a 0
        System.out.println("Ventilador apagado");
        System.out.println("________________________");
    }

    void subirVelocidad() {
        if (encendido) {
            if (velocidad < 3) {
                velocidad++;
                System.out.println("Velocidad actual: " + velocidad);
            } else {
                System.out.println("Ya está en la velocidad máxima");
            }
        } else {
            System.out.println("No se puede subir velocidad: ventilador apagado");
        }
        System.out.println("________________________");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VentiladorC ventilador1 = new VentiladorC("MATUSHA", 0, false);

        ventilador1.encender();

        String opcion;
        do {
            System.out.println("¿Quieres subir la velocidad del ventilador? (si/no/salir)");
            opcion = sc.nextLine();

            if (opcion.equalsIgnoreCase("si")) {
                ventilador1.subirVelocidad();
            } else if (opcion.equalsIgnoreCase("no")) {
                System.out.println("Velocidad se mantiene en: " + ventilador1.velocidad);
            }
        } while (!opcion.equalsIgnoreCase("salir"));

        ventilador1.apagar();
        sc.close();
    }
}