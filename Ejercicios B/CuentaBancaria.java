public class CuentaBancaria {
    int numero;
    double saldo;
    String titular;

    void mostrarCuenta(){
        System.out.println("Numero: "+ numero);
        System.out.println("Saldo: $"+saldo);
        System.out.println("Titular: "+ titular);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.numero = 9845985;
        cuenta1.saldo = 8894824;
        cuenta1.titular = "Daniel Bello";

        cuenta1.mostrarCuenta();
    }
}
