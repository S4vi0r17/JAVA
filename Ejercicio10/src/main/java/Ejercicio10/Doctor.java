package Ejercicio10;

public class Doctor extends Persona{
    private String titulacion;
    private int experiencia;

    public Doctor(String nombre, String apellido, int edad, String titulacion, int experiencia) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.experiencia = experiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getExperiencia() {
        return experiencia;
    }

    @Override
    public void partido() {
        System.out.println("actuo si alguien se lesiona.");
    }

    @Override
    public void entrenamiento() {
        System.out.println("doy asistencia en el entrenamiento.");
    }

    public void curar(){
        System.out.println("curo lesiones.");
    }
}
