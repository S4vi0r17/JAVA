package Inheritance;

public class Estudiante extends Persona{
    private int codigoEstudiante;
    private float notaFinal;

    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos(){
        System.out.println("\nNombre: " + getNombre() +
                "\nApellido: " + getApellido() +
                "\nEdad: " + getEdad() +
                "\nCodigo: " + codigoEstudiante +
                "\nNota final: " + notaFinal);
    }
}
