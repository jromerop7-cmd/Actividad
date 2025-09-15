package Ejercicio2;
public class Estudiante {

        // Atributos
        private String nombre;
        private int edad;

        // 1. Constructor con dos parámetros
        public Estudiante(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        // 2. Constructor por defecto que llama al anterior usando this()
        public Estudiante() {
            this("Sin nombre", 0); // Llama al constructor con parámetros
        }

        // 3. Método para imprimir los detalles
        public void mostrarDetalles() {
            System.out.println("Nombre del estudiante: " + nombre);
            System.out.println("Edad: " + edad);
        }
    }


