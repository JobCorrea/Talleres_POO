public class Cancion {
    String titulo;
    String artista;
    double duracion;

    public Cancion(String titulo, String artista, double duracion){
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    void mostrarInfo(){
        System.out.println("Titulo: "+ titulo);
        System.out.println("Artista: "+ artista);
        System.out.println("Duracion: "+ duracion+ " Minutos");
        System.out.println("''''''''''''''''''''''''''''");
    }

    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("El Gancho", "El michel-Imperio", 4.27);
        Cancion cancion2 = new Cancion("Sin saber que me espera", "Diomedez Diaz", 4.31);

        cancion1.mostrarInfo();
        cancion2.mostrarInfo();
    }

}
