package Ejercicio6;

import java.util.Scanner;

public class Main {
    public static int indiceCuenta(Cuenta[] cuentas, int numeroCuenta){
        int i = 0, indiceCuenta = 0;
        boolean encontrado = false;

        while (i < cuentas.length && encontrado == false){
            if (cuentas[i].getNumeroCuenta() == numeroCuenta){
                encontrado = true;
                indiceCuenta = i;
            }
            i++;
        }
        if (encontrado == false){
            indiceCuenta = -1;
        }
        return indiceCuenta;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nombre, apellido, DNI;
        int numeroCuenta, nCuentas, opc, indiceCuenta;
        double saldo, cantidad;
        Cuenta[] cuentas;
        Cliente cliente;

        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese su apellido: ");
        apellido = scanner.nextLine();
        System.out.print("Ingrese su DNI: ");
        DNI = scanner.nextLine();
        System.out.print("Cuantas cuentas tiene: ");
        nCuentas = scanner.nextInt();

        cuentas = new Cuenta[nCuentas];

        for (int i=0 ; i < cuentas.length; i++){
            System.out.println("\nDigite los datos de la cuenta "+ (i+1) + ":");
            System.out.print("Ingrese el numero de cuenta: ");
            numeroCuenta = scanner.nextInt();
            System.out.print("Ingrese el saldo de la cuenta: ");
            saldo = scanner.nextDouble();
            cuentas[i] = new Cuenta(numeroCuenta,saldo);
        }

        cliente = new Cliente(nombre,apellido,DNI,cuentas);

        do {
            System.out.println("\n\t.:Menu:.");
            System.out.println("1. Ingresar dinero a la cuenta");
            System.out.println("2. Retirar dinero de la cuenta");
            System.out.println("3. Consultar dinero de la cuenta");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opc = scanner.nextInt();

            switch (opc){
                case 1 -> {
                    System.out.print("\nIngrese el numero de cuenta: ");
                    numeroCuenta = scanner.nextInt();
                    indiceCuenta = indiceCuenta(cuentas, numeroCuenta);
                    if (indiceCuenta == -1){
                        System.out.println("Numero de cuenta no encontrada");
                    }else {
                        System.out.print("\nDigite la cantidad de dinero que desea ingresar: ");
                        cantidad = scanner.nextDouble();
                        cliente.ingresarDinero(indiceCuenta,cantidad);
                        System.out.println(cantidad + " aniadidos a la cuenta");
                        System.out.println("Saldo disponible: " + (cliente.consultarSaldo(indiceCuenta)));
                    }

                }
                case 2 -> {
                    System.out.print("\nIngrese el numero de cuenta: ");
                    numeroCuenta = scanner.nextInt();
                    indiceCuenta = indiceCuenta(cuentas, numeroCuenta);
                    if (indiceCuenta == -1){
                        System.out.println("Numero de cuenta no encontrada");
                    }else {
                        System.out.print("Digite la cantidad de dinero que desea retirar: ");
                        cantidad = scanner.nextDouble();
                        if (cantidad > cliente.consultarSaldo(indiceCuenta)){
                            System.out.println("La cantidad que desea retirar supera al saldo disponible");
                        }else {
                            cliente.retirarDinero(indiceCuenta,cantidad);
                            System.out.println(cantidad + " retirados de la cuenta");
                            System.out.println("Saldo disponible: " + (cliente.consultarSaldo(indiceCuenta)));
                        }


                    }
                }
                case 3 -> {
                    System.out.print("\nIngrese el numero de cuenta: ");
                    numeroCuenta = scanner.nextInt();
                    indiceCuenta = indiceCuenta(cuentas, numeroCuenta);
                    if (indiceCuenta == -1){
                        System.out.println("Numero de cuenta no encontrada");
                    }else {

                        System.out.println("El saldo actual de la cuenta #" + numeroCuenta + " es: " + cliente.consultarSaldo(indiceCuenta));
                    }

                }
                case 4 -> System.out.println("\nSaliendo...");
                default -> System.out.println("\nOpcion incorrecta");
            }
        }while (opc != 4);
    }
}