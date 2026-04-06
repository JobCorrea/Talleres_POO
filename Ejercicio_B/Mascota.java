public class Mascota {
    String nombre;
    String especie;
    int edad;

    void mostrarMascota(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Especie: "+ especie);
        System.out.println("Edad: "+ edad + " años");
        System.out.println("_____________________");
    }

    public static void main(String[] args) {
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Tobby";
        mascota1.especie = "Chiguagua";
        mascota1.edad = 8;

        mascota1.mostrarMascota();

        // Cambiar edad (primer cambio)
        mascota1.edad = 9;
        mascota1.mostrarMascota();

        // Cambiar edad (segundo cambio)
        mascota1.edad = 10;
        mascota1.mostrarMascota();

    }
}
