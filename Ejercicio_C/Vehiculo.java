public class Vehiculo {
    String marca;
    String modelo;
    int velocidad;

    void mostrarEstado(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Velocidad Actual: " + velocidad+"Km/h");
        System.out.println("_______________________");
    }
    //Metodo acelelar
    void acelelar(){
        velocidad += 10;
        System.out.println(marca +" Acelerooo" );
        System.out.println("_______________________");

    }
    //Metodo frenar
    void frenar(){
        if(velocidad >= 10){
            velocidad -= 10;
        }else{
            velocidad = 0;
        }
        System.out.println(marca +" Freno" );
        System.out.println("_______________________");

    }

    public static void main(String[] args) {
        //Primer Objeto
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.marca = "BMW";
        vehiculo1.modelo = "xDrive60 2026";
        vehiculo1.velocidad = 120;

         //segundo Objeto
        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.marca = "Yamaha";
        vehiculo2.modelo = "MT-09";
        vehiculo2.velocidad = 80;

        //Estado inicial
        vehiculo1.mostrarEstado();
        vehiculo2.mostrarEstado();

        //Estado de aceleacion
        vehiculo1.acelelar();
        vehiculo2.acelelar();
        
        vehiculo1.mostrarEstado();
        vehiculo2.mostrarEstado();

        //Frenado
        // do {
        //     vehiculo1.frenar();
        //     vehiculo1.mostrarEstado();
        // } while (vehiculo1.velocidad > 0);

        // do {
        //     vehiculo2.frenar();
        //     vehiculo2.mostrarEstado();
        // } while (vehiculo2.velocidad > 0);
        vehiculo1.frenar();
        vehiculo2.frenar();
        
        //Estado Final
        vehiculo1.mostrarEstado();
        vehiculo2.mostrarEstado();
    }
}
