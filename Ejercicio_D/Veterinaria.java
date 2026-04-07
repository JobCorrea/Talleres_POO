public class Veterinaria {
    String nombreMascota;
    String especie;
    String dueño;
    int edad;

    void mostrarInfo() {
        System.out.println("Mascota: " + nombreMascota);
        System.out.println("Especie: " + especie);
        System.out.println("Dueno: " + dueño);
        System.out.println("Edad: " + edad + " anos");
        System.out.println("________________________");
    }

    public static void main(String[] args) {
        Veterinaria mascota1 = new Veterinaria();
        mascota1.nombreMascota = "YaPerr";
        mascota1.especie = "Perro"; // mismo valor
        mascota1.dueño = "Ana";
        mascota1.edad = 5;

        Veterinaria mascota2 = new Veterinaria();
        mascota2.nombreMascota = "Ella";
        mascota2.especie = "Perro"; // mismo valor
        mascota2.dueño = "Carlos";
        mascota2.edad = 2;

        mascota1.mostrarInfo();
        mascota2.mostrarInfo();
    }
}