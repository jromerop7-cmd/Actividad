public class Producto {
    //Propiedades o atributos
    String nombre;
    double precio;
    int stock;


    Producto(String nombre, double precio, int stock) { //contructor
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;

    }
    void mostrarInformacion(){ //metodo
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Precio: "+this.precio);
        System.out.println("Stock: "+this.stock);
    }

    public static void main(String[] args) { // metodo

        Producto ejercicio1 = new Producto("juan",12,3);
        ejercicio1.mostrarInformacion();
    }
}