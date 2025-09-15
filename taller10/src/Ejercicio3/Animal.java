package Ejercicio3;
public class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}
class Perro extends Animal {

    public void hacerSonido(String tipo) {
        System.out.println("El perro ladra: " + tipo); //Aunque no haya error de compilacion, se ejecutará el método de la clase base, no el nuevo.
    }
}


