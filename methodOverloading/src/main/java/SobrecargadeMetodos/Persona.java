package SobrecargadeMetodos;

public class Persona {
    String nombre;
    int edad;

    String DNI;
    /*Sobrecarga de metodos constructores*/
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String DNI) {
        this.DNI = DNI;
    }

    /*Sobrecarga de metodos*/
    public void correr(){
        System.out.println("El señor "+nombre+ " de "+edad+" esta corriendo");
    }
    public void correr(int km){
        System.out.println("El lagarto ha corrido "+ km +" km");
    }
}
