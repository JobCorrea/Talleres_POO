public class Puerta {
    String material;
    boolean abierta;

    public Puerta(String material,boolean abierta){
        this.material = material;
        this.abierta = abierta;
    }

    void abrir(){
        abierta = true;
    }

    void cerrar(){
        abierta = false;
    }

    void mostrarEstado(){
        System.out.println("Material: "+material);
        if(abierta){
            System.out.println("Puerta abierta ##ADELANTE##");
        }else{
            System.out.println("Puerta Cerrada *_*");
        }
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Puerta puerta1 = new Puerta("Aluminio", false);
        
         
        puerta1.mostrarEstado();

        puerta1.abrir();
        puerta1.mostrarEstado();

        puerta1.cerrar();
        puerta1.mostrarEstado();
    }

}
