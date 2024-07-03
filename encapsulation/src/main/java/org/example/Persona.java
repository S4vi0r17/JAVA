package org.example;

public class Persona {
    // Variables privadas para el encapsulamiento
    private String nombre;
    private int edad;

    // Constructor de la clase Persona
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método setter para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método setter para establecer la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }


    // Método getter para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método getter para obtener la edad
    public int getEdad() {
        return edad;
    }


    // Otros métodos de la clase Persona
    // ...
}
