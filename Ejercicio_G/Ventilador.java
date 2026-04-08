public class Ventilador {
    String marca;
    int velocidad;
    boolean encendido;

    public Ventilador(String marca, int velocidad, boolean encendido){
        this.marca = marca;
        this.velocidad = velocidad;
        this.encendido = encendido;
    }

    void encender(){
        encendido = true;
        System.out.println("Ventilador prendido");
        System.out.println("________________________");

    } 
    void apagar(){
        encendido = false;
        velocidad = 0;
        System.out.println("Ventilador Apagado");
        System.out.println("________________________");

    } 
    void subirVelocidad() {
        System.out.println("Marca: " + marca);
        if (encendido) {
            if (velocidad < 3) { // límite de velocidad
                velocidad++;
                System.out.println("Velocidad actual: " + velocidad);
            } else {
                System.out.println("Velocidad máxima");
            }
        } else {
            System.out.println("Ventilador apagado");
        }
        System.out.println("________________________");
    }

    public static void main(String[] args) {
        Ventilador ventilador1 = new Ventilador("MATUSHA", 0, false); 

        ventilador1.encender();
        ventilador1.subirVelocidad();
        ventilador1.subirVelocidad();
        ventilador1.apagar();
        
    }
}
