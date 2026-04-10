import java.time.LocalDate;

public class Reserva {
    String nombreCliente;
    LocalDate fecha;
    boolean activa;

    public Reserva(String nombreCliente, LocalDate fecha, boolean activa){
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.activa = activa;
    }

    //Agregar metodos Confirmar - Cancelar
    void Confirmar(){
        activa = true;
    }
    void Cancelar(){
        activa = false;
    }

    void mostrarReserva(){
        System.out.println("Nombre reservista: "+ nombreCliente);
        System.out.println("Fecha de reserva: "+ fecha);
        
        if(activa == false){
            System.out.println("Reserva cancelada");
        }else{
            System.out.println("Reseva confirmada :D");
        }

        System.out.println("__________________________");
    }
    
    public static void main(String[] args) {
        Reserva reserva = new Reserva("Candelaria",LocalDate.of(2026, 4, 9) , false);    
        Reserva reserva1 = new Reserva("Carlos", LocalDate.now(), true);
    
        reserva.Confirmar();
        reserva.mostrarReserva();

        
        reserva1.Cancelar();
        reserva1.mostrarReserva();

    }
}
