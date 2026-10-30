package Biblioteca;

public class Libro {
    String titulo;
    boolean disponible = true; // Empieza estando disponible

    // Método para cambiar el estado a prestado
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("¡El libro '" + titulo + "' ha sido prestado!");
        } else {
            System.out.println("Lo siento, el libro '" + titulo + "' ya está ocupado.");
        }
    }
}