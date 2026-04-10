/*ATRIBUTOS         METODOS                 OBJETO REAL
 - nombre           - mostrarInfo()         - Real Cartagena
 - ciudad           - contratarJugador()    - Ciudad: Cartagena
  - jugadores       - despedirJugador()     - Jugadores: 25
  - entrenador      - cambiarEntrenador()   - Entrenador: Carlos Restrepo
  - estadio                                 - Estadio: Jaime Moron Leon
 */
public class EquipoDeFutbol {
    String nombre;
    String ciudad;
    int jugadores;
    String entrenador;
    String estadio;

    public EquipoDeFutbol(String nombre, String ciudad, int jugadores, String entrenador, String estadio){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.jugadores = jugadores;
        this.entrenador = entrenador;
        this.estadio = estadio;
    }

    void mostrarInfo(){
        System.out.println("Equipo: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Jugadores: " + jugadores);
        System.out.println("Entrenador: " + entrenador);
        System.out.println("Estadio: " + estadio);
        System.out.println("-------------------------");
    }

    void contratarJugador(int cantidad){
        jugadores += cantidad;
    }

    void despedirJugador(int cantidad){
        if(jugadores >= cantidad){
            jugadores -= cantidad;
        }
    }

    void cambiarEntrenador(String nuevoEntrenador){
        entrenador = nuevoEntrenador;
    }

    public static void main(String[] args) {
        EquipoDeFutbol e1 = new EquipoDeFutbol("Atletico Nacional", "Medellin", 28, 
                                            "Hernan Dario Herrera", "Atanasio Girardot");

        EquipoDeFutbol e2 = new EquipoDeFutbol("FC Barcelona", "Barcelona", 27, 
                                                "Hansi Flick", "Camp Nou");

        EquipoDeFutbol e3 = new EquipoDeFutbol("Seleccion Colombia", "Bogota", 23, 
                                                "Nestor Lorenzo", "Metropolitano Roberto Meléndez");

        e1.mostrarInfo();
        e2.mostrarInfo();
        e3.mostrarInfo();

        // Probar métodos
        e1.contratarJugador(2); // contratar 2 jugadores
        e1.mostrarInfo();

        e2.despedirJugador(3); // despedir 3 jugadores
        e2.mostrarInfo();

        e3.cambiarEntrenador("Luis Amaranto Perea"); // cambiar entrenador
        e3.mostrarInfo();
    }
}