package Aeropuerto;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    final static int nA = 4;
    static Aeropuerto[] aeropuertos = new Aeropuerto[nA];
    public static void main(String[] args) {
        // Insertamos datos del aeropuerto
        insertarDatosAeropuerto(aeropuertos);
        menu();
    }
    public static void insertarDatosAeropuerto(Aeropuerto[] a){
        a[0] = new AeropuestoPublico("Jorge Chavez", "Lima", "Perú",800000);
        a[0].insertarCompania(new Compania("Aero Perú"));
        a[0].insertarCompania(new Compania("Latam"));
        a[0].getCompania("Aero Perú").insertarVuelo(new Vuelo("77LL","Lima","Mexico",150.90,150));
        a[0].getCompania("Aero Perú").insertarVuelo(new Vuelo("78LL","Lima","Buenos Aires",180.99,120));
        a[0].getCompania("Latam").insertarVuelo(new Vuelo("FC12","Lima","Londres",500.90,180));
        a[0].getCompania("Aero Perú").getVuelo("77LL").insertarPasajero(new Pasajero("Gustavo","2021FDR","Peruano"));
        a[0].getCompania("Aero Perú").getVuelo("77LL").insertarPasajero(new Pasajero("Jesus","321GDE","Mexicana"));
        a[0].getCompania("Latam").getVuelo("FC12").insertarPasajero(new Pasajero("Sebas","JF34LK","Alemana"));

        a[1] = new AeropuestoPublico("Charles de Gaulle", "París", "Francia", 900000);
        a[1].insertarCompania(new Compania("AirFrance"));
        a[1].insertarCompania(new Compania("Lufthansa"));
        a[1].getCompania("AirFrance").insertarVuelo(new Vuelo("AF123", "París", "Nueva York", 300.50, 200));
        a[1].getCompania("AirFrance").insertarVuelo(new Vuelo("AF124", "París", "Tokio", 600.75, 250));
        a[1].getCompania("Lufthansa").insertarVuelo(new Vuelo("LH456", "París", "Frankfurt", 120.30, 150));
        a[1].getCompania("AirFrance").getVuelo("AF123").insertarPasajero(new Pasajero("Sophie", "FRA567", "Francesa"));
        a[1].getCompania("AirFrance").getVuelo("AF123").insertarPasajero(new Pasajero("Michael", "USA890", "Estadounidense"));
        a[1].getCompania("Lufthansa").getVuelo("LH456").insertarPasajero(new Pasajero("Anna", "GER234", "Alemana"));

        a[2] = new AeropuestoPublico("Narita", "Tokio", "Japón", 700000);
        a[2].insertarCompania(new Compania("JapanAirlines"));
        a[2].insertarCompania(new Compania("ANA"));
        a[2].getCompania("JapanAirlines").insertarVuelo(new Vuelo("JAL567", "Tokio", "Los Ángeles", 400.20, 180));
        a[2].getCompania("ANA").insertarVuelo(new Vuelo("ANA890", "Tokio", "Pekín", 250.40, 120));
        a[2].getCompania("ANA").insertarVuelo(new Vuelo("ANA891", "Tokio", "Singapur", 320.60, 150));
        a[2].getCompania("JapanAirlines").getVuelo("JAL567").insertarPasajero(new Pasajero("Yuki", "JPN123", "Japonesa"));
        a[2].getCompania("ANA").getVuelo("ANA890").insertarPasajero(new Pasajero("Liu", "CHN456", "China"));
        a[2].getCompania("ANA").getVuelo("ANA891").insertarPasajero(new Pasajero("Amita", "IND789", "India"));


        a[3] = new AeropuertoPrivado("Central Ciudad Real", "Ciudad Real", "España");
        a[3].insertarCompania(new Compania("AirEuropa"));
        String[] empresas = {"Cobresol", "Anguila 34"};
        ((AeropuertoPrivado)a[3]).insertarEmpresas(empresas);
        a[3].getCompania("AirEuropa").insertarVuelo(new Vuelo("AE025", "Madrid", "Buenos Aires", 250.0, 180));

        a[3].getCompania("AirEuropa").getVuelo("AE025").insertarPasajero(new Pasajero("Juan", "123ABC", "Español"));
    }
    public static void menu(){
        int opc;
        do {
            System.out.println("\n\t\t\t__MENU__");
            System.out.println("[1] Ver aeropuertos(publicos/privados)");
            System.out.println("[2] Ver empresas(privadas) o subvencionadas(publicas)");
            System.out.println("[3] Lista de compañias de un aeropuerto");
            System.out.println("[4] Lista de vuelos por compañia");
            System.out.println("[5] Listar posibles vuelos Origen-Destino");
            System.out.println("[6] Salir");
            System.out.print("Digite una opcion: ");
            opc = scanner.nextInt();
            switch (opc){
                case 1 -> mostrarDatosAeropuertos(aeropuertos);
                case 2 -> mostrarPatrocinio(aeropuertos);
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {

                }
                case 6 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion incorrecta DX");

            }
        }while (opc != 6);
    }
    public static void mostrarDatosAeropuertos(Aeropuerto[] aeropuertos){
        System.out.println("");
        for (int i = 0; i < aeropuertos.length; i++){
            if (aeropuertos[i] instanceof AeropuertoPrivado){
                System.out.println("|--AEROPUERTO PRIVADO--|");
                System.out.println("Nombre: " + aeropuertos[i].getNombre() +
                        "\nCiudad: " + aeropuertos[i].getCiudad() +
                        "\nPais: " + aeropuertos[i].getPais());

            }else {
                System.out.println("|--AEROPUERTO PUBLICO--|");
                System.out.println("Nombre: " + aeropuertos[i].getNombre() +
                        "\nCiudad: " + aeropuertos[i].getCiudad() +
                        "\nPais: " + aeropuertos[i].getPais());
            }
            System.out.println("");
        }
    }
    public static void  mostrarPatrocinio(Aeropuerto[] aeropuertos){
        String[] empresas;
        System.out.println("");
        for (int i = 0; i < aeropuertos.length; i++){
            if (aeropuertos[i] instanceof AeropuertoPrivado){
                System.out.println("|--AEROPUERTO PRIVADO--|");
                System.out.println("Nombre: " + aeropuertos[i].getNombre() +
                        "\nCiudad: " + aeropuertos[i].getCiudad() +
                        "\nPais: " + aeropuertos[i].getPais());
                empresas = ((AeropuertoPrivado) aeropuertos[i]).getListaEmpresas();
                System.out.println("Empresas: ");
                for (String empresa :empresas) {
                    System.out.println(" - " + empresa);
                }
            }else {
                System.out.println("|--AEROPUERTO PUBLICO--|");
                System.out.println("Nombre: " + aeropuertos[i].getNombre() +
                        "\nCiudad: " + aeropuertos[i].getCiudad() +
                        "\nPais: " + aeropuertos[i].getPais());
                System.out.println("Subvencion: " + ((AeropuestoPublico) aeropuertos[i]).getSubvencion());
                // DX
            }
            System.out.println("");
        }
    }
}