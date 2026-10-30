public class Main {
    public static void main(String[] args) {
        // Creamos la cuenta con un titular y saldo inicial
        Cuenta cuenta1 = new Cuenta("Ana Torres", 500.0);

        // Mostramos el saldo inicial
        cuenta1.mostrarSaldo();

        // Creamos una transacción de depósito y le pasamos la cuenta como parámetro
        Transaccion deposito = new Transaccion("deposito", 250.0);
        deposito.aplicar(cuenta1);

        // Creamos una transacción de retiro y le pasamos la misma cuenta
        Transaccion retiro = new Transaccion("retiro", 100.0);
        retiro.aplicar(cuenta1);

        // Mostramos el saldo final actualizado
        cuenta1.mostrarSaldo();
    }
}