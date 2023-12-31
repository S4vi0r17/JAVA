package Ejercicio10;

public abstract class Persona {
    protected String nombre, apellido;
    protected int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void viajar(){
        System.out.println("estoy viajando.");
    }
    public abstract void partido();
    public abstract void entrenamiento();



}
