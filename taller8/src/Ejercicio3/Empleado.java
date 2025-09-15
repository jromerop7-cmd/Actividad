package Ejercicio3;
public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre + " | Salario: $" + salario);
    }
}
class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Gerente: " + nombre + " | Salario: $" + salario + " | Departamento: " + departamento);
    }
}


