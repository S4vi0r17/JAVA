package Ejercicio6;

public class Complejo {
    private double a, b;

    // Metodos

    public Complejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public Complejo suma(Complejo c){
        Complejo sum = new Complejo(a + c.getA(), b + c.getB());
        return sum;
    }

    public Complejo producto(Complejo c){
        Complejo producto = new Complejo(a * c.getA() - b * c.getB() , a * c.getB() + b * c.getA());
        return producto;
    }

    public boolean igualdad(Complejo c){
        if (a == c.getA() && b == c.getB()){
            return true;
        }
        return false;
    }

    public Complejo xEntero(int z){
        Complejo xEntero = new Complejo(a * z, b * z);
        return xEntero;
    }
}
