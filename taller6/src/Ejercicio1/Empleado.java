package Ejercicio1;

public class Empleado {

    protected String nombre;
    protected int salario;

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }
}

class Gerente extends Empleado {
    private String apartamento;

    public  Gerente(String nombre, int salario, String apartamento) {
        super(nombre, salario);
        this.apartamento = apartamento;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Apartamento: " + apartamento);
    }
}
class Main{

    public static void main(String[] args) {
        Empleado empleado = new Empleado("juan", 12);
        empleado.mostrar();

        Gerente gerente = new Gerente("carlos", 11232, "t012");
        gerente.mostrar();
    }
}
