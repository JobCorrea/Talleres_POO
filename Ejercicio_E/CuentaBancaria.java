public class CuentaBancaria{
    int numero;
    double saldo;
    String titular;

    public CuentaBancaria(int numero, double saldo, String titular){
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    void mostrarCuenta(){
        System.out.println("Numero: "+ numero);
        System.out.println("Saldo: $"+saldo);
        System.out.println("Titular: "+ titular);
        System.out.println("_______________________");
    }

    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria(954687, 989.847, "Jesus Pacho");
        CuentaBancaria cuenta2 = new CuentaBancaria(121416, 600.000, "Eithan Correa");
        CuentaBancaria cuenta3 = new CuentaBancaria(78521456, 1000, "Diany");

        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();
        cuenta3.mostrarCuenta();
    }
}
