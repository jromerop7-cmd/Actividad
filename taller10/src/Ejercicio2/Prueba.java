package Ejercicio2;

public class Prueba {

        public static void main(String[] args) {
            Vehiculo v = new Vehiculo();
            Bicicleta b = new Bicicleta();

            System.out.println("Movimiento del vehículo:");
            v.moverse();

            System.out.println("Movimiento de la bicicleta:");
            b.moverse();
        }
}


