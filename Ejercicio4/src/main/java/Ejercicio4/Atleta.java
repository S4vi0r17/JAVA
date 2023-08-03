package Ejercicio4;

import com.sun.security.jgss.GSSUtil;

public class Atleta {
    private int nAtleta;

    private String nombre;
    private float tiempo;

    // Metodos

    public Atleta(int nAtleta, String nombre, float tiempo) {
        this.nAtleta = nAtleta;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void mosrarDatos(){
        System.out.println("\nDatos del atleta ganador: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("# de atleta: " + nAtleta);
        System.out.println("Tiempo de carrera: " + tiempo);
    }
}
