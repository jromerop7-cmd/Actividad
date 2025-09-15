package Ejercicio2;

public class Vehiculo {

    protected String marca;
    protected String tipo;

    public Vehiculo(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }
    public void mostrar() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Tipo: " + this.tipo);
    }
}
class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String tipo, int cilindrada) {
        super(marca, tipo);
        this.cilindrada = cilindrada;
    }
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Cilindrada: " + this.cilindrada);

    }
}



class Prueba{
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("yamaha" ,"urbana");
        vehiculo.mostrar();

        vehiculo = new Moto("honda","deportiva", 600);
    }
}
