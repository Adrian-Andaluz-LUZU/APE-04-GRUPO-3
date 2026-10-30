public class Transaccion {
    String tipo;
    double monto;

    public Transaccion(String tipo, double monto) {
        this.tipo = tipo;
        this.monto = monto;
    }

    // La clase Transaccion recibe un objeto Cuenta como parámetro
    public void aplicar(Cuenta cuenta) {
        if (tipo.equals("deposito")) {
            cuenta.depositar(monto);
            System.out.println("Deposito realizado por: " + monto);
        } else if (tipo.equals("retiro")) {
            cuenta.retirar(monto);
            System.out.println("Retiro realizado por: " + monto);
        } else {
            System.out.println("Tipo de transaccion no valido.");
        }
    }
}