 class Estudiantes{
    String nombre;
    String semestre;
    int codigo;

    Estudiantes(String nombre, String semestre, int codigo) {
        this.nombre = nombre;
        this.semestre = semestre;
        this.codigo = codigo;
    }
    static Estudiantes crEstudiantes(String nombre, String semestre, int codigo){
        return new Estudiantes(nombre, semestre, codigo);
    }


    void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("COdigo: " + codigo);
        System.out.println("Semestre: " + semestre);
    }

    public static void main(String[] args) {
        Estudiantes estudiantes1 = new Estudiantes("Job Daniel", "Semestre II", 55651);
        // estudiantes1.nombre = "Job Daniel";
        // estudiantes1.codigo = 254748;
        // estudiantes1.semestre = "Semestre II";

        
        estudiantes1.mostrarInfo();
    }

}