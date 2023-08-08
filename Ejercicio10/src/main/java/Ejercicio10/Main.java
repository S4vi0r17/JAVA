package Ejercicio10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Persona> personas = new ArrayList<>();
    static Persona futbolista1 = new Futbolista("Gonzalo", "Higuain",29,9,"Delantero");
    static Persona futbolista2 = new Futbolista("Paulo", "Divala",23,21,"Delantero");
    static Persona entrenador = new Entrenador("Maximilano", "Alegre",49,"Defensiva");
    static Persona medico = new Doctor("Jesus","Lujan",27,"No titulado", 0);


    public static void main(String[] args) {
        personas.addAll(Arrays.asList(futbolista1, futbolista2, entrenador, medico));

        /*
            personas.add(futbolista1);
            personas.add(futbolista2);
            personas.add(entrenador);
            personas.add(medico)
        */

        menu();
    }

    public static void menu(){
        int opc;
        do {
            System.out.println("\n        __MENU__");
            System.out.println("Viaje de equipo          [1]");
            System.out.println("Entrenamiento            [2]");
            System.out.println("Partido de futbol        [3]");
            System.out.println("Planificar entrenamiento [4]");
            System.out.println("Entrevista               [5]");
            System.out.println("Curar lesion             [6]");
            System.out.println("Salir                    [7]");
            System.out.print("Digite una opcion       : ");
            opc = scanner.nextInt();
            switch (opc){
                case 1 -> viajarEquipo();
                case 2 -> entrenamientoEquipo();
                case 3 -> partidoFutbol();
                case 4 -> planificarEntrenamiento();
                case 5 -> darEntrevista();
                case 6 -> curarLesion();
                case 7 -> System.out.println("Saliendo...");
                default -> System.out.println("Error");
            }
        }while (opc != 7);
    }
    public static void viajarEquipo(){
        System.out.println("\n");
        for (Persona persona : personas) {
            System.out.print("- Soy " + persona.getNombre() + " " + persona.getApellido() + " y ");
            persona.viajar();
        }
    }
    public static void entrenamientoEquipo(){
        for (Persona persona : personas) {
            System.out.print("\n- Soy " + persona.getNombre() + " " + persona.getApellido() + " y ");
            persona.entrenamiento();
        }
    }
    public static void partidoFutbol(){
        for (Persona persona : personas) {
            System.out.print("\n- Soy " + persona.getNombre() + " " + persona.getApellido() + " y ");
            persona.partido();
        }
    }
    public static void planificarEntrenamiento(){
        System.out.print("\n- Soy " + entrenador.getNombre() + " " + entrenador.getApellido() + " y ");
        ((Entrenador)entrenador).planificarEntrenamiento();
    }
    public static void darEntrevista(){
        System.out.print("\n");
        System.out.print("- Soy " + futbolista1.getNombre() + " " + futbolista1.getApellido() + " y ");
        ((Futbolista)futbolista1).entrevista();
        System.out.print("- Soy " + futbolista2.getNombre() + " " + futbolista2.getApellido() + " y ");
        ((Futbolista)futbolista2).entrevista();
    }
    public static void curarLesion(){
        System.out.print("\n- Soy " + medico.getNombre() + " " + medico.getApellido() + " y ");
        ((Doctor)medico).curar();
    }
}