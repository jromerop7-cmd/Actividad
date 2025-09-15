package Ejercicio3;
public class Persona {

        private String nombre;

        // Método static que intenta acceder a un atributo no estático
        public static void mostrarNombre() {
            System.out.println("Nombre: " + nombre); // Error: Cannot make a static reference to non-static field
        }

}

public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre); // Válido
    }
}

