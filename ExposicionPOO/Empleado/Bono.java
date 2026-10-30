package Empleado;

public class Bono {
    double montoExtra;

    // EL CONCEPTO CLAVE: Recibe un objeto 'Empleado' completo como parámetro
    public void otorgarBono(Empleado unEmpleado) {
        System.out.println("Aplicando bono de: $" + montoExtra);
        
        // Colaboración: Modificamos directamente el atributo del objeto empleado que recibimos
        unEmpleado.salario = unEmpleado.salario + montoExtra;
        
        System.out.println("¡Bono aplicado con éxito a " + unEmpleado.nombre + "!");
    }
}