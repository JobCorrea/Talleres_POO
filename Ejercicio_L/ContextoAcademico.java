public class ContextoAcademico {
    String nombre;
    int edad;
    String universidad;
    String carrera;
    int semestre;

    public ContextoAcademico(String nombre, int edad, String universidad, String carrera, int semestre){
        this.nombre = nombre;
        this.edad = edad;
        this.universidad = universidad;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Universidad: " + universidad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
        System.out.println("-------------------------");
    }
    void avanzarSemestre(){
        semestre++;
    }
    void actualizarCarrera(String nuevaCarrera){
        carrera = nuevaCarrera;
    }

    public static void main(String[] args) {
        ContextoAcademico yo = new ContextoAcademico("Job Correa", 25, "Universidad de Cartagena", 
                                                        "ING. Softwre", 2);

        yo.mostrarInfo();
       
        yo.actualizarCarrera("Coodinacion de procesos Logisticos");
        yo.avanzarSemestre();
        yo.mostrarInfo();
    }
}
