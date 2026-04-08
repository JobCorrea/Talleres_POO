public class Libro {
    String titulo;
    String autor;
    String editorial;
    int añoPublicacion;

    // Constructor copia
    public Libro(String titulo, String autor, String editorial, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.añoPublicacion = añoPublicacion;
    }

    public Libro(Libro otro){
        this.titulo = otro.titulo;
        this.autor = otro.autor;
        this.editorial = otro.editorial;
        this.añoPublicacion = otro.añoPublicacion;
    }
    void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
        System.out.println("Año: " + añoPublicacion);
        System.out.println("---------------------");
    }

    //Objetos
    public static void main(String[] args) {
        // Objeto usando el constructor con parámetros
        Libro original = new Libro("Los juegos del hambre", "Suzanne Collins", "Scholastic Press", 2008);
        Libro copia = new Libro(original);

       original.mostrarInfo();
        copia.mostrarInfo();
       
    }
}