public class Libro {
    String titulo;
    String autor;
    String editorial;
    int añoPublicacion;

    //Constructor vacio
    public Libro(){}
    // Constructor con Parametros
    public Libro(String titulo, String autor, String editorial, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.añoPublicacion = añoPublicacion;
    }

    //Metodos
    void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
        System.out.println("Ano: " + añoPublicacion);
        System.out.println("---------------------");
    }

    //Objetos
    public static void main(String[] args) {
        // Objeto usando el constructor vacío
        Libro libro1 = new Libro();
        libro1.titulo = "Harry Potter y la piedra filosofal";
        libro1.autor = "J.K. Rowling";
        libro1.editorial = "Bloomsbury";
        libro1.añoPublicacion = 1997;


        // Objeto usando el constructor con parámetros
        Libro libro2 = new Libro("Los juegos del hambre", "Suzanne Collins", "Scholastic Press", 2008);

       

        libro1.mostrarInfo();
        libro2.mostrarInfo();
        
       
    }
}
