public class Mascota {
    String nombre;
    String especie;
    int edad;

    void mostrarMascota(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Especie: "+ especie);
        System.out.println("Edad: "+ edad + " años");
    }

    public static void main(String[] args) {
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Tobby";
        mascota1.especie = "Chiguagua";
        mascota1.edad = 8;

        mascota1.mostrarMascota();
    }
}
