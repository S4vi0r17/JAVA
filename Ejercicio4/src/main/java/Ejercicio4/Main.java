package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static int indiceGanador(Atleta[] atletas){
        int indice = 0;
        float menorTiempo = atletas[indice].getTiempo();
        for (int i = 1 ; i < atletas.length; i++){
            if (menorTiempo > atletas[i].getTiempo()) {
                menorTiempo = atletas[i].getTiempo();
                indice = i;
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float tiempo;
        String nombre;
        int nAtleta;
        System.out.print("Ingrese el numero de atletas: ");
        int n = scanner.nextInt();

        Atleta[] atletas = new Atleta[n];

        for (int i = 0; i< atletas.length; ++i){
            System.out.println("\nIngrese datos del atleta " + (i+1));
            scanner.nextLine();
            System.out.print("Nombre: ");
            nombre = scanner.nextLine();
            System.out.print("Numero de atleta: ");
            nAtleta = scanner.nextInt();
            System.out.print("Tiempo(s): ");
            tiempo = scanner.nextFloat();
            atletas[i] = new Atleta(nAtleta,nombre,tiempo);
        }

        atletas[indiceGanador(atletas)].mosrarDatos();
    }
}
