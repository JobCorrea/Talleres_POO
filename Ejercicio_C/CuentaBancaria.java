

public class CuentaBancaria{
    int numero;
    double saldo;
    String titular;

    void mostrarCuenta(){
        System.out.println("Numero: "+ numero);
        System.out.println("Saldo: $"+saldo);
        System.out.println("Titular: "+ titular);
        System.out.println("_______________________");
    }

    void consignar(double valor){
        saldo += valor;
        System.out.println("Se consignaron $" + valor + " a la cuenta de " + titular);
    }
    void  retirar(double valor){
       if(valor > saldo){
        System.out.println("Saldo insuficiente");
       }else{
        saldo -= valor;
        System.out.println("Se retiraron $" + valor + " de la cuenta de " + titular);
        }
    }

    public static void main(String[] args) {
        //Primera cuenta
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.numero = 9845985;
        cuenta1.saldo = 400000;
        cuenta1.titular = "Daniel Bello";

        CuentaBancaria cuenta2 = new CuentaBancaria();
        cuenta2.numero = 1234567;
        cuenta2.saldo = 500000;
        cuenta2.titular = "Job Correa";

        //Mostrar estados 
        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();
        System.out.println("_______________________");

        cuenta1.consignar(5000);
        cuenta2.retirar(3000);
        System.out.println("_______________________");

        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();
    }
}
