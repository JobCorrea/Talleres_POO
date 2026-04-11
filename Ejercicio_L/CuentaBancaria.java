//Reescribe uno de tus primeros ejercicios, pero ahora usando constructor con parámetros. 
public class CuentaBancaria{
    int numero;
    double saldo;
    String titular;

    public CuentaBancaria( int numero, double saldo, String titular){
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
        //Primera cuenta
        CuentaBancaria cuenta1 = new CuentaBancaria(9845985, 8894824, "Daniel Bello");
        // cuenta1.numero = 9845985;
        // cuenta1.saldo = 8894824;
        // cuenta1.titular = "Daniel Bello";
        CuentaBancaria cuenta2 = new  CuentaBancaria(121416, 547864554, "Isabel Tarra");
        

        //Mostrar estados 
        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();
    }
}
