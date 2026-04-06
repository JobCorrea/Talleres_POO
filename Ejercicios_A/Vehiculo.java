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
    // public static void main(String[] args) {
    //     Vehiculo vehiculo1 = new Vehiculo();
    //     vehiculo1.mostrarEstado();

    // }
}
