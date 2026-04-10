public class Semaforo {
    boolean rojo;
    boolean naranja;
    boolean verde;

    public Semaforo(boolean rojo,boolean naranja, boolean verde ){
        this.rojo = rojo;
        this.naranja = naranja;
        this.verde = verde;
    }

    void cambioSemaforo(){
        if(rojo == true){
            System.out.println("Semaforo en ROJO Detenga la marcha");
        }else if(naranja == true){
            System.out.println("Semaforo en NARANJADO Reduzca la velocidad");
        }else{
            System.out.println("Semaforo en VERDE Avance");
        }
    }

    public static void main(String[] args) {
        Semaforo stop = new Semaforo(false, true, false);

        stop.cambioSemaforo();
    }
}
