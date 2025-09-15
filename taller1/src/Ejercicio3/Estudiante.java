package Ejercicio3;
public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    // 1. Constructor por defecto
    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.curso = "Sin curso";
    }

    // 2. Constructor con nombre y edad
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Curso no asignado"; // Valor genérico
    }

    // 3. Constructor con todos los parámetros, usando this()
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); // Llama al constructor de dos parámetros
        this.curso = curso; // Asigna el curso específico
    }

    // Método para mostrar los detalles del estudiante
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
    }
}
