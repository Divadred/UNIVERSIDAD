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
}
