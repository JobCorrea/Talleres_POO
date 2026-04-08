public class Celular {
    String marca;
    int bateria;
    boolean prendido;

    void encender(){
        prendido = true;
        System.out.println("El celular esta encendido.");
    } 
    void apagar(){
        prendido = false;
        System.out.println("El celular esta apagado.");
    } 
    void cargarBateria(){
        if (bateria < 100) {
            bateria += 10; 
            if (bateria > 100) {
                bateria = 100;
            }
        }

        System.out.println("Marca: " + marca);
        if (bateria <= 20) {
            System.out.println("Bateria baja: " + bateria + "% - Conectar cargador");
        } else if (bateria == 100) {
            System.out.println("Cargado completamente :D "+ bateria+"%");
        } else {
            System.out.println("CARGANDO.... " + bateria + "%");
        }
        System.out.println("------------------------");
    }
    
    public static void main(String[] args) {
        Celular celular1 = new Celular();
        celular1.marca = "XIAOMI";
        celular1.bateria = 10;
        //celular1.prendido = true;

        celular1.encender();
        celular1.cargarBateria(); // primera carga
        celular1.cargarBateria(); // segunda carga
        celular1.cargarBateria(); // tercera carga
        celular1.apagar();
    }
}
