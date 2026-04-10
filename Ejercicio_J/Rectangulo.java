public class Rectangulo {
    int base;
    int altura;


    public Rectangulo(int  base, int  altura){
        this.base = base;
        this.altura = altura;
    }

    int calcularArea(){
        return base*altura ;
    }
    int calcularPerimetro(){
        return 2 *(base * altura);
    }

    void MostrarResultados(){
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }

    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo(4, 5);
        // Usando los métodos que devuelven int
        int area = rect.calcularArea();
        int perimetro = rect.calcularPerimetro();

        System.out.println("El Area de un Rectangulo es: " + area);
        System.out.println("Perimetro de un Rectangulo es: " + perimetro);

        // Usando el método void
        rect.MostrarResultados();
    }
}
