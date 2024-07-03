package Ejercicio2;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc,n;
        System.out.println("Digite las coordenadas de inicio: ");
        System.out.print("X = ");
        int x = scanner.nextInt();
        System.out.print("Y = ");
        int y = scanner.nextInt();
        Tablero posicion = new Tablero(x,y);


        do {
            System.out.println("Coordenada actual: \n(X,Y) = (" + posicion.getX() + "," + posicion.getY()+")");
            System.out.println("\nHacia donde quiere mover el objeto: ");
            System.out.println("1. Arriba");
            System.out.println("2. Abajo");
            System.out.println("3. Izquierda");
            System.out.println("4. Derecha");
            System.out.println("5. Salir");
            System.out.print("Digite una opcion: ");
            opc = scanner.nextInt();
            if (opc == 5){
                System.out.println("Coordenada final: \n(X,Y) = (" + posicion.getX() + "," + posicion.getY()+")");                break;
            }
            System.out.println("Cuantas posiciones quiere moverse?");
            n = scanner.nextInt();
            switch (opc) {
                case 1 -> posicion.arriba(n);
                case 2 -> posicion.abajo(n);
                case 3 -> posicion.izquierda(n);
                case 4 -> posicion.derecha(n);
                default -> System.out.println("Opcion incorrecta DX");
            }
        }while (true);
    }
}