package Ejercicio3;
public class Estudiante {

    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método estático con uso incorrecto de this
    public static void mostrarNombre() {
        System.out.println("Nombre: " + this.nombre); // Error de compilación
    }

}

/*
CORRECTO USO
 */
    public class Estudiante {
        private String nombre;
        private int edad;

        public Estudiante(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        // Método corregido: no es estático
        public void mostrarNombre() {
            System.out.println("Nombre: " + this.nombre); // Compila bien
        }
    }


