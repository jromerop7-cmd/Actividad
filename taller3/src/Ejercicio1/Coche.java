package Ejercicio1;
public class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0;

    // Constructor que incrementa el contador
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++; // Se incrementa cada vez que se crea un objeto
    }

    // Método static para mostrar cuántos coches se han creado
    public static void mostrarContador() {
        System.out.println("🚗 Coches creados: " + contadorCoches);
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }
}
