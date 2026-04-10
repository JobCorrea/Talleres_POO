public class FacturaSimple {
    int numero; 
    String cliente; 
    double valor;
    
    public FacturaSimple(int numero, String cliente, double valor){
        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
    }

    //Metodo de descuento 10%
    double descuento(){
        return valor * 0.10;
    }
    double precioFinal(){
        return valor - descuento();
    }

    void informacionCompra(){
        System.out.println("Numero de Factura: "+ numero);
        System.out.println("Nombre del Cliente: "+cliente);
        System.out.println("Valor a cancelar: "+ valor);
        System.out.println("''''''''''''''''''''''''''''");
        System.out.println("Descuento del 10%: "+ precioFinal());
    }
    public static void main(String[] args) {
        FacturaSimple factura = new FacturaSimple(121415, "Jose de los Santos", 15000);
        factura.informacionCompra();
    }
}
