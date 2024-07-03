package Ejercicio8;

import java.util.Scanner;

public class Main {

    public static int indiceSucursal(Sucursal[] s, int nScursal, int contadorSucursal){
        int indice=-1;
        boolean encontrado=false;
        for (int i=0 ; i < contadorSucursal ; i++){
            if (s[i].getnSucursal() == nScursal){
                encontrado = true;
                indice = i;
            }
        }
        return indice;
    }

    public static int indicePaquete(Paquete[] p, int nPaquete, int contadorPaquete){
        int indice=-1;
        boolean encontrado=false;
        for (int i=0 ; i < contadorPaquete ; i++){
            if (p[i].getnReferencia() == nPaquete){
                encontrado = true;
                indice = i;
            }
        }
        return indice;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nSucursal, nPaquete, prioridad, opc, contadorSucursal=0, contadorPaquete=0, indiceSucursal, indicePaquete;
        String direccion, ciudad, DNI;
        double peso, precioPaquete;

        Sucursal[] sucursal = new Sucursal[50];
        Paquete[] paquetes = new Paquete[100];

        do {
            System.out.println("\n\n\t__Menu__");
            System.out.println("1. Crear sucursal");
            System.out.println("2. Enviar paquete");
            System.out.println("3 Consultar sucursal");
            System.out.println("4. Consultar paquete");
            System.out.println("5. Mostrar todas las sucursales");
            System.out.println("6. Mostrar todos los paquetes");
            System.out.println("7. Salir");
            System.out.print("Digite una opcion: ");
            opc = scanner.nextInt();

            switch (opc){
                case 1 -> {
                    System.out.print("\nDigite el numero de sucursal: ");
                    nSucursal = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite la direccion: ");
                    direccion = scanner.nextLine();
                    System.out.print("Digite la ciudad: ");
                    ciudad = scanner.nextLine();

                    sucursal[contadorSucursal] = new Sucursal(direccion,ciudad,nSucursal);
                    contadorSucursal++;
                }
                case 2 -> {
                    System.out.print("\nDigite el numero de numero de sucursal: ");
                    nSucursal = scanner.nextInt();

                    indiceSucursal = indiceSucursal(sucursal,nSucursal,contadorSucursal);

                    if (indiceSucursal == -1){
                        System.out.println("\nLa sucursal no existe.");
                    }else {
                        System.out.print("\nDigite el numero de paquete: ");
                        nPaquete = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("\nDigite el DNI del emisor: ");
                        DNI = scanner.nextLine();
                        System.out.print("Digite el peso del paquete: ");
                        peso = scanner.nextDouble();
                        System.out.print("Digite la prioridad[0=normal, 1=alta, 2=express]: ");
                        prioridad = scanner.nextInt();

                        paquetes[contadorPaquete] = new Paquete(nPaquete,DNI,prioridad,peso);
                        precioPaquete = sucursal[indiceSucursal].precioPaquete(paquetes[contadorPaquete]);

                        System.out.println("\nEl precio del paquete es: S/. " + precioPaquete);

                        contadorPaquete++;
                    }


                }
                case 3 -> {
                    System.out.print("\nDigite el numero de sucursal: ");
                    nSucursal = scanner.nextInt();

                    indiceSucursal = indiceSucursal(sucursal,nSucursal,contadorSucursal);

                    if (indiceSucursal == -1){
                        System.out.println("\nLa sucursal no existe.");
                    }else {
                        System.out.println(sucursal[indiceSucursal].mostrarDatosSucursal());

                    }
                }
                case 4 -> {
                    System.out.print("\nDigite el numero de paquete: ");
                    nPaquete = scanner.nextInt();

                    indicePaquete = indicePaquete(paquetes,nPaquete,contadorPaquete);

                    if (indicePaquete == -1){
                        System.out.println("\nEl paquete no existe");
                    }else {
                        System.out.println(paquetes[indicePaquete].mostrarDatosPaquete());
                    }
                }
                case 5 -> {
                    for (int i = 0; i < contadorSucursal; i++){
                        System.out.println("\nDatos de la sucursal #" + (i + 1) + ":");
                        System.out.println(sucursal[i].mostrarDatosSucursal());
                    }
                }
                case 6 -> {
                    for (int i = 0; i < contadorPaquete; i++){
                        System.out.println("\nDatos del paquete #" + (i + 1) + ":");
                        System.out.println(paquetes[i].mostrarDatosPaquete());
                    }
                }
                case 7 -> System.out.println("\nSaliendo...");
                default -> System.out.println("\nOpcion incorrecta DX");
            }
        }while (opc !=7);

    }
}