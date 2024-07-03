package SobrecargadeMetodos;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Nacho", 22);

        persona1.correr();

        Persona persona2 = new Persona("98746327");
        persona2.correr(10);
    }
}
