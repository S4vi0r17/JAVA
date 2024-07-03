package Ejercicio10;

public class Futbolista extends Persona{
    private int dorsal;
    private String posicion;

    public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public void partido() {
        System.out.println("juego el partido de futbol.");
    }

    @Override
    public void entrenamiento() {
        System.out.println("estoy entrenando.");
    }

    public void entrevista(){
        System.out.println("me estan entrevistando.");
    }
}
