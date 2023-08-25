package exmenparcial1.alumnos;

public class Alumnos {
    private static int contadorCarnet= 200;
    private String carnet;
    private String nombre;
    
    public Alumnos (String nombre){
        this.nombre= nombre;
        contadorCarnet++;
        carnet= "3090-" + contadorCarnet;
    }
    
    public void imprimirDatos() {
        System.out.println("Carnet No. "+carnet);
        System.out.println("Nombre del alumno: "+ nombre);
    }
    public static void main (String[] args) {
        Alumnos alumno1= new Alumnos ("Jonh Doe");
        alumno1.imprimirDatos();
        
        Alumnos alumno2 = new Alumnos ("James Smith");
        alumno2.imprimirDatos();
    }
}
