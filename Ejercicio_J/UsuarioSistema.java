public class UsuarioSistema {
    String nombreUsuario;
    String clave;
    boolean activo;

    public UsuarioSistema(String nombreUsuario, String clave, boolean activo){
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.activo = activo;
    }

    void activar(){
        activo = true;
        System.out.println("El usuario " + nombreUsuario + " ha sido ACTIVADO.");
    }

    void desactivar(){
        activo = false;
        System.out.println("El usuario " + nombreUsuario + " ha sido DESACTIVADO.");
    }

    void mostrarInfo(){
        System.out.println("Usuario: " + nombreUsuario);
        System.out.println("Clave: " + clave);
        System.out.println("Estado: " + (activo ? "Activo" : "Inactivo")); //ternario
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        UsuarioSistema user1 = new UsuarioSistema("Job123", "claveSegura", false);

        user1.mostrarInfo();
        user1.activar();
        user1.mostrarInfo();

        user1.desactivar();
        user1.mostrarInfo();
    }
}