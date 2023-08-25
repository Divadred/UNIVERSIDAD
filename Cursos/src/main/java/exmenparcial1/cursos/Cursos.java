package exmenparcial1.cursos;

public class Cursos {
    private String nombre;
    private int cupoMaximo;
    private int cupoActual;

    public Cursos(String nombre, int cupoMaximo){
        this.nombre = nombre;
        this.cupoMaximo = cupoMaximo;
        this.cupoActual = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public int getCupoActual() {
        return cupoActual;
    }

    public boolean verificaEspacio() {
        return cupoActual < cupoMaximo;
    }
    
        public void inscribirAlumno() {
        if (verificaEspacio()) {
            cupoActual++;
            System.out.println("Alumno inscrito en el curso: " + nombre + ". Cupo actual: " + cupoActual);
        } 
        else {
            System.out.println("No hay cupo disponible en el curso; " + nombre + ".");
        }
    }

    public static void main(String[] args) {
        Cursos curso1 = new Cursos("Matemáticas", 30);
        Cursos curso2 = new Cursos("Historia", 25);

        curso1.inscribirAlumno();
        curso1.inscribirAlumno();
        curso1.inscribirAlumno();

        curso2.inscribirAlumno();
        curso2.inscribirAlumno();
    }
}
