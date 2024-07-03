package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static int indiceBarato(Coche[] coches){ //Se usa directamente como una funcion

        float Barato = coches[0].getPrecio();
        int indiceBarato = 0;

        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < Barato){
                Barato = coches[i].getPrecio();
                indiceBarato = i;
            }
        }
        return indiceBarato;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float precio;
        String marca, modelo;
        System.out.print("Ingrese el número de vehiculos: ");
        int nV = scanner.nextInt();

        Coche[] coches = new Coche[nV];

        // No se puede usar el foreach porque esta solo copia el valor y no modifica.
        for (int i = 0; i < coches.length; i++) {
            System.out.println("\nIngrese los datos del coche " + (i+1) + ": ");
            System.out.print("Ingrese la marca: ");
            marca = scanner.next(); //scanner.nextLine(); acepta como input a una oracion, next solo a una palabra.
            System.out.print("Ingrese el modelo: ");
            modelo = scanner.next();
            System.out.print("Ingrese el precio: ");
            precio = scanner.nextFloat();
            coches[i] = new Coche(marca, modelo, precio);
        }
        //Si el buffer se llena se pone ´scanner.nextLine();´

        coches[indiceBarato(coches)].mostrarDatos();

    }
}

//La sintaxis recomendara en arreglos es Coche[] coches