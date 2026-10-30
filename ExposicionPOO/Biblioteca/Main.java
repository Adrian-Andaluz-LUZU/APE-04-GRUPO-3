package Biblioteca;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos un libro (por defecto nace disponible = true)
        Libro libro1 = new Libro();
        libro1.titulo = "Programacion Orientada a Objetos";

        // 2. Creamos un préstamo con una fecha
        Prestamo miPrestamo = new Prestamo();
        miPrestamo.fecha = "24/10/2026";

        // 3. Procesamos el préstamo pasándole el libro como parámetro (Colaboración)
        miPrestamo.procesarPrestamo(libro1);

        // 4. Intentamos prestar el mismo libro otra vez para ver la validación del if-else
        System.out.println("\n--- Intentando prestar el mismo libro de nuevo ---");
        miPrestamo.procesarPrestamo(libro1);
    }
}