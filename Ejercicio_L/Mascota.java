public class Mascota {
    String nombre;
    String especie;
    int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public Mascota(Mascota otro) {
        this.nombre = otro.nombre;
        this.especie = otro.especie;
        this.edad = otro.edad;
    }

    void mostrarMascota(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Especie: "+ especie);
        System.out.println("Edad: "+ edad + " años");
        System.out.println("_____________________");
    }

    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Tobby", "De casa", 1);
        Mascota copia = new Mascota(mascota1);
        
        // mascota1.nombre = "Tobby";
        // mascota1.especie = "Chiguagua";
        // mascota1.edad = 8;

        mascota1.mostrarMascota();

        copia.mostrarMascota();

    }
}
