package Ejercicio1;
public class Empleado {
        public String nombre; // Propiedad pública
        private double salario;

        // Getter
        public double getSalario() {
            return salario;
        }

        // Setter con validación
        public void setSalario(double salario) {
            if (salario >= 0) {
                this.salario = salario;
            } else {
                System.out.println("El salario no puede ser negativo.");
            }
        }

        @Override
        public String toString() {
            return "Empleado: " + nombre + " | Salario: $" + salario;
        }
}

