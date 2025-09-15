package Ejercicio1;
public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    // Setters con validaciones
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre no válido.");
        }
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            System.out.println("Edad fuera de rango.");
        }
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0.0 && notaPromedio <= 5.0) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("Nota promedio inválida.");
        }
    }

    @Override
    public String toString() {
        return "Estudiante: " + nombre + " | Edad: " + edad + " | Nota Promedio: " + notaPromedio;
    }
}
