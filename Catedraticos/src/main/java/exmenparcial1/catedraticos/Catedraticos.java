package exmenparcial1.catedraticos;

public class Catedraticos {
    private static int contadorCatedraticos = 0;
    private int numeroCatedratico;
    private String nombre;
    
    
    public Catedraticos(String nombre) {
        this.nombre = nombre;
        contadorCatedraticos++;
        numeroCatedratico = contadorCatedraticos;
    
    }
    
    public void imprimirDatos(){
        System.out.println("Catedrático No. "+ numeroCatedratico);
        System.out.println("Nombre del catedratico: "+nombre);
    }
    public static void main (String[] args) {
        Catedraticos catedratico1= new Catedraticos ("Jonh Doe");
        catedratico1.imprimirDatos();
        
        Catedraticos catedratico2 = new Catedraticos ("James Smith");
        catedratico2.imprimirDatos();
    
    }
}
