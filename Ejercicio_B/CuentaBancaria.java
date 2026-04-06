public class CuentaBancaria {
    int numero;
    double saldo;
    String titular;

    void mostrarCuenta(){
        System.out.println("Numero: "+ numero);
        System.out.println("Saldo: $"+saldo);
        System.out.println("Titular: "+ titular);
        System.out.println("_______________________");
    }

    public static void main(String[] args) {
        //Primera cuenta
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.numero = 9845985;
        cuenta1.saldo = 8894824;
        cuenta1.titular = "Daniel Bello";

        //Segunda Cuenta
        CuentaBancaria cuenta2 = new CuentaBancaria();
        cuenta2.numero = 1234567;
        cuenta2.saldo = 500000;
        cuenta2.titular = "Job Correa";

        //Mostrar estados 
        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();
    }
}
