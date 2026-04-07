/* Clase Estudiante -> es la base para crear el objeto a la cual se le van agregando atributos como, nombre, edad entre otros.
    Objeto est1 -> es  una instancia concreta de esa clase, donde esos atributos ya tienen valores específicos y se pueden 
    ejecutar acciones reales.
*/

//Ejercicio 20
public class explicacion {
    String nombre;
    String sonido;
    String volar;
    int huevos;

    void mostrarInfo(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Sonido: "+sonido);
        System.out.println("Vuelan: "+ volar);
        System.out.println("Huevos: "+huevos+" por nido");
        System.out.println("_______________________");
    }

    public static void main(String[] args) {
        //Primer objeto 'Ave'
        explicacion ave1 = new explicacion();
        ave1.nombre = "Gallina Criolla";
        ave1.sonido ="coc-coc-coc";
        ave1.volar = "No";
        ave1.huevos = 8;

        //Segundo objeto 'Ave'
        explicacion ave2 = new explicacion();
        ave2.nombre = "Pajaro Carpintero";
        ave2.sonido ="Taca-taca-taca-taca";
        ave2.volar = "Si";
        ave2.huevos = 4;

        //Tercer objeto 'Ave'
        explicacion ave3 = new explicacion();
        ave3.nombre = "Pinguino";
        ave3.sonido ="Honk-honk-honk";
        ave3.volar = "No";
        ave3.huevos = 2;
        
        
        ave1.mostrarInfo();
        ave2.mostrarInfo();
        ave3.mostrarInfo();
    }

}
/*Los tres objetos comparten la misma clase, por eso tienen
    los mismos atributos y métodos. Sin embargo, se diferencian en los valores
    concretos de esos atributos. 
    cada uno representa un ave distinta con su
    propio nombre, sonido, capacidad de volar y cantidad de huevos.
*/

