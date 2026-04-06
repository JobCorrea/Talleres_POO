public class Vehiculo {
    String marca;
    String modelo;
    String velocidad;

    void mostrarEstado(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Velocidad Actual: " + velocidad);
        System.out.println("_______________________");
    }

    public static void main(String[] args) {
        //Primer Objeto
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.marca = "BMW";
        vehiculo1.modelo = "xDrive60 2026";
        vehiculo1.velocidad = "120km/h";

         //segundo Objeto
        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.marca = "Yamaha";
        vehiculo2.modelo = "MT-09";
        vehiculo2.velocidad = "80 Km/h";

        vehiculo1.mostrarEstado();
        vehiculo2.mostrarEstado();
    }
}
