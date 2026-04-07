public class Libro {
    String titulo;
    String autor;
    String editorial;
    int añoPublicacion;

    void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
        System.out.println("Ano: " + añoPublicacion);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.titulo = "Cien años de soledad";
        libro1.autor = "Gabriel García Márquez";
        libro1.editorial = "Sudamericana";
        libro1.añoPublicacion = 1967;

        Libro libro2 = new Libro();
        libro2.titulo = "El Principito";
        libro2.autor = "Antoine de Saint-Exupéry";
        libro2.editorial = "Reynal & Hitchcock";
        libro2.añoPublicacion = 1943;

        Libro libro3 = new Libro();
        libro3.titulo = "Don Quijote de la Mancha";
        libro3.autor = "Miguel de Cervantes";
        libro3.editorial = "Francisco de Robles";
        libro3.añoPublicacion = 1605;

        Libro libro4 = new Libro();
        libro4.titulo = "La bruja";
        libro4.autor = "German Castro Caycedo";
        libro4.editorial = "Planeta";
        libro4.añoPublicacion = 1994;

        libro1.mostrarInfo();
        libro2.mostrarInfo();
        libro3.mostrarInfo();
        libro4.mostrarInfo();
    }
}
/*
La clase Libro es la plantilla que define qué atributos puede tener cualquier libro (título, autor, editorial, año). 
Los objetos (libro1, libro2, libro3, libro4) son casos concretos, cada uno representa un libro específico con valores distintos en esos atributos.
 */