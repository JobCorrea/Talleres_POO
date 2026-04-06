public class vehiculo {
    String marca;
    String modelo;
    String velocidad;

    void mostrarEstado(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Velocidad Actual: " + velocidad);
    }

    public static void main(String[] args) {
        vehiculo vehiculo1 = new vehiculo();
        vehiculo1.marca = "BMW";
        vehiculo1.modelo = "xDrive60 2026";
        vehiculo1.velocidad = "120km";

        vehiculo1.mostrarEstado();
    }
}
