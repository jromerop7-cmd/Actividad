package Ejercicio3;
public class Persona {
    private String nombre;
}

//Asi seria la otra clase externa que quiera acceder a clase Persona
public class MainPersona {
    public static void main(String[] args) {
        Persona p = new Persona();
        // p.nombre = "Luis"; // nombre tiene acceso privado
    }
}

