package Ejercicio2;

public class Coche {
    private String marca, modelo;
    private float precio;

    public Coche(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }


    public float getPrecio() {
        return precio;
    }

    public void mostrarDatos (){
        System.out.println("\nEl coche mas barato es: ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
    }
}
