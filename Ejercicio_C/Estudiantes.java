 class Estudiantes{
    String nombre;
    int semestre;
    int codigo;

    void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Semestre: " + semestre);
    }
    void cambiarSemestre(int nuevoSemestre){
        semestre = nuevoSemestre;
        System.out.println("Felicidades avanzo a "+nuevoSemestre+ " Semestre");
    }

    public static void main(String[] args) {
        Estudiantes estudiantes1 = new Estudiantes();
        estudiantes1.nombre = "Job Daniel";
        estudiantes1.codigo = 254748;
        estudiantes1.semestre = 2;
        
        estudiantes1.mostrarInfo();

        estudiantes1.cambiarSemestre(5);

        estudiantes1.mostrarInfo();
    }

}