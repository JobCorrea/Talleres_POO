 class Estudiantes{
    String nombre;
    String semestre;
    int codigo;

    void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestre);
    }

    public static void main(String[] args) {
        Estudiantes estudiantes1 = new Estudiantes();
        estudiantes1.nombre = "Job Daniel";
        estudiantes1.codigo = 254748;
        estudiantes1.semestre = "Semestre II";
        
        estudiantes1.mostrarInfo();
    }

}