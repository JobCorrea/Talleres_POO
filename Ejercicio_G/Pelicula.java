public class Pelicula {
    String nombre;
    String genero;
    double duracion;

    public Pelicula(String nombre, String genero, double duracion){
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
    }

    void mostrarFicha(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Genero: "+genero);
        System.out.println("Duracion: "+ duracion+ " Horas");
        System.out.println("''''''''''''''''''");
    }

    public static void main(String[] args) {
        Pelicula movi1 = new Pelicula("Rapidos & Furiosos", "Accion/Crimen", 2.31);
        Pelicula movi2 = new Pelicula("Quien *&$%! son los Miller", "Comedia", 1.50);

        movi1.mostrarFicha();
        movi2.mostrarFicha();
    }
}
