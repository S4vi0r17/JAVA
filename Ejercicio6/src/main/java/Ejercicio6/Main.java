package Ejercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Complejo n1, n2, suma, producto;
        double a,b,c,d;
        int opc, z;

        do {
            System.out.println("\n\tOperaciones con complejos");
            System.out.println("1. Sumar 2 numeros complejos");
            System.out.println("2. Multiplicar 2 numeros complejos");
            System.out.println("3. Compara 2 numeros complejos");
            System.out.println("4. Multiplicar un numero complejo por un entero");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            opc = scanner.nextInt();

            switch (opc){
                case 1 -> {
                    System.out.print("\nIngrese el primer complejo [a + bi]: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    System.out.print("Ingrese el segundo complejo [c + di]: ");
                    c = scanner.nextDouble();
                    d = scanner.nextDouble();

                    n1 = new Complejo(a,b);
                    n2 = new Complejo(c,d);

                    // System.out.println("La suma es: " + n1.suma(n2)); Esto no se puede porque devuelve un objeto;

                    suma = n1.suma(n2);
                    System.out.println("\nLa suma es: " + suma.getA() + " + " + suma.getB() + "i");
                }
                case 2 -> {
                    System.out.print("\nIngrese el primer complejo [a + bi]: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    System.out.print("Ingrese el segundo complejo [c + di]: ");
                    c = scanner.nextDouble();
                    d = scanner.nextDouble();

                    n1 = new Complejo(a,b);
                    n2 = new Complejo(c,d);

                    producto = n1.producto(n2);
                    System.out.println("\nLa producto es: " + producto.getA() + " + " + producto.getB() + "i");
                }
                case 3 -> {
                    System.out.print("\nIngrese el primer complejo [a + bi]: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    System.out.print("Ingrese el segundo complejo [c + di]: ");
                    c = scanner.nextDouble();
                    d = scanner.nextDouble();

                    n1 = new Complejo(a,b);
                    n2 = new Complejo(c,d);

                    if (n1.igualdad(n2)){
                        System.out.println("\nLos numeros complejos son iguales");
                    }else {
                        System.out.println("\nLos numeros complejos no son iguales");
                    }
                }
                case 4 -> {
                    System.out.print("\nIngrese un numero complejo [a + bi]: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    System.out.print("Ingrese un numero entero: ");
                    z = scanner.nextInt();

                    n1 = new Complejo(a,b);

                    producto = n1.xEntero(z);

                    System.out.println("\nLa producto es: " + producto.getA() + " + " + producto.getB() + "i");
                }
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion incorrecta");
            }

        }while (opc != 5);
    }
}