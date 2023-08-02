package Ejercicio1;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cuadrilatero cuadrilatero;
        //Scanner scanner = new Scanner(System.in);
        int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer lado: "));
        int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo lado: "));

        if (lado1 == lado2){
            cuadrilatero = new Cuadrilatero(lado1);
        }else {
            cuadrilatero = new Cuadrilatero(lado1 ,lado2);
        }

        JOptionPane.showMessageDialog(null, "El area es: " + cuadrilatero.getArea());
        JOptionPane.showMessageDialog(null, "El perimetro es: " + cuadrilatero.getPerimetro());

    }
}