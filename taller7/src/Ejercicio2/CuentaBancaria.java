package Ejercicio2;
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta; // Propiedad pública

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Getter y Setter para saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }

    // Método para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Cuenta: " + numeroCuenta + " | Tipo: " + tipoCuenta + " | Saldo: $" + saldo);
    }
}
