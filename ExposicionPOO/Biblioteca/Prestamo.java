package Biblioteca;

public class Prestamo {
    String fecha;

    // EL CONCEPTO CLAVE: Recibe un objeto 'Libro' completo como parámetro
    public void procesarPrestamo(Libro unLibro) {
        System.out.println("Registrando préstamo en la fecha: " + fecha);
        
        // Colaboración entre clases: Invocamos el método del libro
        unLibro.prestar(); 
    }
}