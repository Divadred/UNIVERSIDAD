
package exmenparcial1.asignaciones;

public class Asignaciones {

class Asignacion {
    private Alumno alumno;
    private ArrayList<Curso> cursosAsignados;

    public Asignacion(Alumno alumno) {
        this.alumno = alumno;
        this.cursosAsignados = new ArrayList<>();
    }

    public void addCurso(Curso curso) {
        cursosAsignados.add(curso);
    }

}
