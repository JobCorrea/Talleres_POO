 class Estudiantes{
    String nombre;
    int semestre;
    int codigo;

    public Estudiantes(){}

    public Estudiantes(String nombre, int codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Estudiantes(String nombre, int semestre, int codigo){
        this.nombre = nombre;
        this.semestre = semestre;
        this.codigo = codigo;
    }

    void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestre);
        System.out.println("______________________");
    }

    public static void main(String[] args) {
        Estudiantes estudiantes1 = new Estudiantes();
        estudiantes1.nombre = "Job Daniel";
        estudiantes1.codigo = 254748;
        estudiantes1.semestre = 2;

        Estudiantes estudiantes2 = new Estudiantes("Simon bolivar", 12151);
        Estudiantes estudiantes3 = new Estudiantes("Michael Jason", 8, 48795163); 
        
        estudiantes1.mostrarInfo();
        estudiantes2.mostrarInfo();
        estudiantes3.mostrarInfo();
    }

}