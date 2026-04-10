/*Atributos         Metodos                           Objetos reales
- nombre            - mostrarInfo()                   - Una biblioteca llamada Biblioteca Central de Cartagena, 
- direccion         - agregarLibros(int cantidad)       ubicada en el centro histórico, con 10,000 libros y horario de 8:00 a 18:00.
- cantidadLibros    - prestarLibro()
                    - devolverLibro() 

 */
public class Biblioteca {
    String nombre;
    String direccion;
    int cantidadLibros;
    String horario;

    public Biblioteca(String nombre, String direccion, int cantidadLibros, String horario){
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadLibros = cantidadLibros;
        this.horario = horario;
    }

    // Métodos
    int agregarLibros(int cantidad){
        cantidadLibros += cantidad;
        return cantidadLibros;
    }

    int prestarLibro(){
        if(cantidadLibros > 0){
            cantidadLibros--;
        }
        return cantidadLibros;
    }

    int devolverLibro(){
        cantidadLibros++;
        return cantidadLibros;
    }

    void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("DirecciOn: " + direccion);
        System.out.println("Cantidad de Libros: " + cantidadLibros);
        System.out.println("Horario: " + horario);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Biblioteca bio1 = new Biblioteca("Biblioteca Central de Cartagena", 
                                         "Centro histOrico", 
                                         10000, 
                                         "8:00AM  a 6:00 PM");

        Biblioteca bio2 = new Biblioteca("Biblioteca Universitaria de la UDC", 
                                         "Campus Universitario", 
                                         25000, 
                                         "7:00 AM a 9:00 PM");

        // Mostrar información inicial
        bio1.mostrarInfo();
        bio2.mostrarInfo();

        // Probar métodos
        bio1.prestarLibro();
        bio1.mostrarInfo();

        bio2.agregarLibros(100);
        bio2.mostrarInfo();
    }
}