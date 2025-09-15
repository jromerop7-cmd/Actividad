package Ejercicio2;
public class Pez extends Animal {
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie); // Llama al constructor de Animal
        this.tipoDeAgua = tipoDeAgua;
    }

    public void mostrarDetalles() {
        super.mostrarEspecie(); // Llama al método de Animal
        System.out.println("🌊 Tipo de agua: " + tipoDeAgua);
    }
}


