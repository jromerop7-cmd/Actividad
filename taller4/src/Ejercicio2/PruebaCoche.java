package Ejercicio2;
public class PruebaCoche {
        public static void main(String[] args) {
            Coche coche = new Coche("Mazda", "CX-5", 180);

            coche.acelerar(20); // Método válido
            System.out.println(coche);
        }
    }