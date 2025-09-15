package Ejercicio3;
public class Utilidades {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("División por cero.");
            return Double.NaN;
        }
        return a / b;
    }
}
