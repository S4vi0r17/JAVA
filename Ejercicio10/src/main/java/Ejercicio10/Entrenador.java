package Ejercicio10;

public class Entrenador extends Persona{
    private String estrategia;

    public Entrenador(String nombre, String apellido, int edad, String estrategia) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    @Override
    public void partido() {
        System.out.println("dirijo el partido.");
    }
    @Override
    public void entrenamiento() {
        System.out.println("dirijo el entrenamiento.");
    }
    public void planificarEntrenamiento(){
        System.out.println("planifico el entrenamiento.");
    }
}
