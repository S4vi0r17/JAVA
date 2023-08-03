package Ejercicio5;

public class Triangulo {
    private double ladoRepetido, base;


    public Triangulo(double ladoRepetido, double base) {
        this.ladoRepetido = ladoRepetido;
        this.base = base;
    }

    public double perimetro(){
        double perimetro = (2 * ladoRepetido) + base;
        return perimetro;
    }

    public double area(){
        double area = (base * Math.sqrt(Math.pow(ladoRepetido,2) - (Math.pow(base,2) / 4)))/2;
        return area;
    }
}
