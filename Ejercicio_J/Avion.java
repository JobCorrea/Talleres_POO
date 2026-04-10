public class Avion {
    String aerolinea;
    String destino;
    int pasajeros;

    public Avion(String aerolinea, String destino, int pasajeros){
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.pasajeros = pasajeros;
    }

    void abordar(int cantidad){
        pasajeros += cantidad;
        System.out.println("Han abordado " + cantidad + " pasajeros.");
        System.out.println("Total de pasajeros: " + pasajeros);
    }

    void mostrarInfo(){
        System.out.println("Aerolinea: " + aerolinea);
        System.out.println("Destino: " + destino);
        System.out.println("Pasajeros a bordo: " + pasajeros);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Avion avion1 = new Avion("Avianca", "Bogota", 120);

        avion1.mostrarInfo();
        avion1.abordar(30); // suben 30 pasajeros
        avion1.mostrarInfo();
    }
}