package Ejercicio5;

import java.util.Scanner;

public class Main {
    public static double mayorArea(Triangulo[] triangulos){

        double mayorArea = triangulos[0].area();

        for (int i = 1; i < triangulos.length; i++){
            if (mayorArea < triangulos[i].area()){
                mayorArea = triangulos[i].area();
            }
        }
        return mayorArea;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ladoRepetido, base;
        System.out.print("Ingrese el numero de triangulos: ");
        int nTriangulos = scanner.nextInt();

        Triangulo[] triangulos = new Triangulo[nTriangulos];

        for (int i = 0 ; i < triangulos.length ; i++){
            System.out.println("\nIngrese los datos para el triangulo #" + (i + 1) + ": ");
            System.out.print("Ingrese el lado repetido: ");
            ladoRepetido = scanner.nextDouble();
            System.out.print("Ingrese la base: ");
            base = scanner.nextDouble();

            triangulos[i] = new Triangulo(ladoRepetido,base);

            System.out.println("\nEl area del triangulo #" + (i + 1) + " es: " + triangulos[i].area());
            System.out.println("El perimetro del triangulo #" + (i + 1) + " es: " + triangulos[i].perimetro());
        }

        System.out.println("\nLa mayor superficie de los triangulos es: " + mayorArea(triangulos));
    }
}