package exmenparcial1.cine;

class Pelicula {
    String titulo;
    int duracion;
    int edadMinima;
    String director;

    Pelicula(String titulo, int duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }
}

class Espectador {
    String nombre;
    int edad;
    double dinero;

    Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }
}

class Asiento {
    int fila;
    char columna;
    boolean ocupado;

    Asiento(int fila, char columna) {
        this.fila = fila;
        this.columna = columna;
        this.ocupado = false;
    }
}

class CineSede {
    Pelicula peliculaActual;
    double precioEntrada;
    int filas;
    int columnas;
    Asiento[][] asientos;

    CineSede(Pelicula peliculaActual, double precioEntrada, int filas, int columnas) {
        this.peliculaActual = peliculaActual;
        this.precioEntrada = precioEntrada;
        this.filas = filas;
        this.columnas = columnas;
        this.asientos = new Asiento[filas][columnas];

        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                asientos[fila][columna] = new Asiento(filas - fila, (char) ('A' + columna));
            }
        }
    }

    void mostrarPeliculaActual() {
        System.out.println("Película en reproducción: " + peliculaActual.titulo);
    }

    void venderEntrada(Espectador espectador, int fila, char columna) {
        int filaIndex = filas - fila;
        int columnaIndex = columna - 'A';

        if (filaIndex < 0 || filaIndex >= filas || columnaIndex < 0 || columnaIndex >= columnas) {
            System.out.println("Ubicación de asiento inválida.");
            return;
        }

        Asiento asiento = asientos[filaIndex][columnaIndex];
        if (asiento.ocupado) {
            System.out.println("El asiento está ocupado.");
        } else if (espectador.edad < peliculaActual.edadMinima) {
            System.out.println("El espectador es demasiado joven para ver esta película.");
        } else if (espectador.dinero < precioEntrada) {
            System.out.println("El espectador no tiene suficiente dinero para comprar la entrada.");
        } else {
            asiento.ocupado = true;
            espectador.dinero -= precioEntrada;
            System.out.println("Entrada vendida correctamente.");
        }
    }

    void mostrarAsientos() {
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                char estado = asientos[fila][columna].ocupado ? 'X' : 'O';
                System.out.print(estado + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Título de la Película", 120, 13, "Director de la Película");
        Espectador espectador = new Espectador("Nombre del Espectador", 18, 50);
        CineSede cineSede = new CineSede(pelicula, 10, 8, 9);

        cineSede.mostrarPeliculaActual();
        cineSede.mostrarAsientos();

        cineSede.venderEntrada(espectador, 3, 'E');

        cineSede.mostrarAsientos();
    }
}