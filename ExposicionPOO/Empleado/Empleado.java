package Empleado;

public class Empleado {
    String nombre;
    double salario;

    // Método para mostrar la información del empleado
    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + " | Salario actual: $" + salario);
    }
}