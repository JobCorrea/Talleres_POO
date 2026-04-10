public class Temperatura {
    double grados;
     
    public Temperatura(double grados){
        this.grados = grados;

    }

    double convertirFahrenheit(){
        return (grados * 9/5) + 32;
    }

    void mostrarTemperatura(){
        System.out.println("Sus grados: "+ grados+ " Convertidos a fahrenheit es: "+ convertirFahrenheit()+ " °F");
    }

    public static void main(String[] args) {
        Temperatura tp = new Temperatura(65);

        tp.mostrarTemperatura();
    }
}
