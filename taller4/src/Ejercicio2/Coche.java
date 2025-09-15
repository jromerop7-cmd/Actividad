package Ejercicio2;
 class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
            System.out.println("🚀 Velocidad incrementada a: " + velocidadMaxima + " km/h");
        } else {
            System.out.println("⚠️ Incremento inválido.");
        }
    }

    @Override
    public String toString() {
        return "Coche: " + marca + " " + modelo + " | Velocidad Máxima: " + velocidadMaxima + " km/h";
    }
}

