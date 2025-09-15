package Ejercicio2;
public class Bancaria {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // 1. Constructor por defecto
    public Bancaria() {
        this.numeroCuenta = "00000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Cuenta corriente";
    }

    // 2. Constructor con dos parámetros
    public Bancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0; // Valor predeterminado
    }

    // 3. Constructor sobrecargado con tres parámetros
    public Bancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Método para mostrar los detalles de la cuenta
    public void mostrarDetalles() {
        System.out.println("🏦 Número de cuenta: " + numeroCuenta);
        System.out.println("💰 Saldo: $" + saldo);
        System.out.println("📂 Tipo de cuenta: " + tipoCuenta);
    }
}
