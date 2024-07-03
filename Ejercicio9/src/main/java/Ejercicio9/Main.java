package Ejercicio9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Poligono> poligonos = new ArrayList<Poligono>(); //Arreglo dinamico.
    static Scanner scanner = new Scanner(System.in); //Estatico para toda la clase
    public static void main(String[] args) {

        // Una clase abstracta solo puede instanciarse con sus subclases.
        llenarPoligono();

        mostrarResultados();
    }
    public static void llenarPoligono(){
        int opc;
        do {
            System.out.print("\nQue poligono desea[Triangulo(1)/Rectangulo(2)/Salir(3)]: ");
            opc = scanner.nextInt();
            switch (opc){
                case 1 -> llenarTriangulo();
                case 2 -> llenarRectangulo();
                case 3 -> System.out.println("Saliendo...");
                default -> System.out.println("Error DX");
            }
        }while (opc != 3);
    }
    public static void llenarTriangulo(){
        double l1, l2, l3;
        System.out.print("\nIngrese los lados del triangulo[l1 l2 l3]: ");
        l1 = scanner.nextDouble();
        l2 = scanner.nextDouble();
        l3 = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(l1,l2,l3);

        poligonos.add(triangulo); // Se guarda el triangulo en la lista.
    }
    public static void llenarRectangulo(){
        double l1, l2;
        System.out.print("\nIngrese los lados del rectangulo[l1 l2]: ");
        l1 = scanner.nextDouble();
        l2 = scanner.nextDouble();

        Rectangulo rectangulo = new Rectangulo(l1,l2);

        poligonos.add(rectangulo); // Se guarda el rectangulo en la lista.
    }

    public static void mostrarResultados(){
        for (Poligono poligono : poligonos) {
            System.out.println(poligono.toString());
            System.out.println("Area: " + poligono.area() + "\n ");
        }
    }
}