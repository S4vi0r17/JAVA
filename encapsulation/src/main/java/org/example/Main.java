package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona = new Persona("Iwo", 35);

        // Obtener y mostrar los datos utilizando los métodos getter
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

        // Cambiar el nombre y la edad utilizando los métodos setter
        persona.setNombre("Anfiperra");
        persona.setEdad(25);

        // Mostrar los nuevos datos
        System.out.println("Nuevo nombre: " + persona.getNombre());
        System.out.println("Nueva edad: " + persona.getEdad());
    }
}
