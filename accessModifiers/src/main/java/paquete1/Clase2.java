package paquete1;

public class Clase2 {
    public static void main(String[] args) {
        Clase1 object = new Clase1();
        object.atributo1 = 10;

        Clase1 object2 = new Clase1();
        // object2.atributo2 = 20; error, ya que es privado
    }
}
