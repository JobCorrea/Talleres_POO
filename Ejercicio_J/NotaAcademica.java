import java.text.DecimalFormat;

public class NotaAcademica {
    String asignatura;
    double n1;
    double n2;
    double n3;

    public NotaAcademica(String asignatura, double n1,double n2,double n3){
        this.asignatura = asignatura;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    double notasTotales(){
        return (n1+n2+n3) / 3;
    }

    void calcularDefinitiva(){
        DecimalFormat df = new DecimalFormat("#.00"); //Cantidada decimales
        System.out.println("Su asignatura es: "+ asignatura);
        System.out.println("Su nota definitiva es: "+ df.format (notasTotales()));
        if(notasTotales()>3){
            System.out.println("Gano la asignatura "+ asignatura);
        }else{ 
            System.out.println("Perdio la asignatura "+ asignatura);
        }
    }

    public static void main(String[] args) {
        NotaAcademica nota = new NotaAcademica("Programacion", 2, 5, 3);

        nota.calcularDefinitiva();
    }
}
