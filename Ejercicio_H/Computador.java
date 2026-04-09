public class Computador {
    String marca;
    int memoriaRAM; 
    int almacenamiento; 
    boolean encendido;

    
    public Computador(String marca, int memoriaRAM, int almacenamiento, boolean encendido) {
        this.marca = marca;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
        this.encendido = encendido;
    }

    
    void encender() {
        encendido = true;
        System.out.println("El computador está encendido.");
    }

    void apagar() {
        encendido = false;
        System.out.println("El computador está apagado.");
    }

    void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Memoria RAM: " + memoriaRAM + " GB");
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
        System.out.println("Encendido: " + encendido);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Computador pc1 = new Computador("Lenovo", 16, 512, false);
        Computador pc2 = new Computador("HP", 8, 256, true);

        pc1.mostrarInfo();
        pc2.mostrarInfo();
    }
}
/*La clase Computador es como el plano conceptual define qué atributos y comportamientos tiene un computador 
(marca, memoria, almacenamiento, encender, apagar). Es una plantilla abstracta que describe cómo debería ser cualquier computador.
En cambio, los objetos creados a partir de esa clase (pc1, pc2) son máquinas concretas, con valores específicos y únicos.
 */