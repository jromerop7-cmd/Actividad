package Ejercicio3;

public class Prueba {

        public static void main(String[] args) {
            Empleado emp = new Empleado("Lucía", 3000.0);
            Gerente ger = new Gerente("Andrés", 5000.0, "Finanzas");

            emp.mostrarDetalles();
            System.out.println();
            ger.mostrarDetalles(); // Usa el método sobrescrito
        }
}
