package ejercicio3;

public class Prueba {
    public static void main(String[] args) {

        Persona persona = new Persona("juan", 11); //No se puede acceder debibo a que su modificador de acceso esta privado

        persona.edad = 12; // si se accede y se realizan cambios debido a que su modificador esta publico
        System.out.println(persona.edad);

    }
}
