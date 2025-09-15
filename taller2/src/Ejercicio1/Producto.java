package Ejercicio1;
public class Producto {
    private String nombre;
    private double precio;

    // Constructor con parámetros
    public Producto(String nombre, double precio) {
        this.nombre = nombre;     // Uso de this para diferenciar el atributo del parámetro
        this.precio = precio;
    }

    // Método para mostrar los detalles del producto
    public void mostrarProducto() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
    }
}
