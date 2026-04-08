public class Lampara{
    String marca;
    boolean encendida;
    
    void encender(){
        encendida = true;
    }

    void apagar(){
        encendida = false;
    }

    void mostrarEstado(){
        System.out.println("Marca "+ marca);
        if(encendida){
            System.out.println("Lampara Encendida");
        }else{
            System.out.println("Lampara Apagada");
        }
        System.out.println("___________________________");
    }

    public static void main(String[] args) {
        
        Lampara lampara1 = new Lampara();
        lampara1.marca = "Lg";

        // Estado inicial (apagada por defecto)
        lampara1.mostrarEstado();

        // Encender la lámpara
        lampara1.encender();
        lampara1.mostrarEstado();

        // Apagar la lámpara
        lampara1.apagar();
        lampara1.mostrarEstado();
    }
}
