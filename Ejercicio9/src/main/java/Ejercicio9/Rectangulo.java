package Ejercicio9;

public class Rectangulo extends Poligono {
    private double l1, l2;


    /*
    public Rectangulo(int nLados, ... ) {
        super(nLados);
        ...
        # El parametro ya no es necesario porque se conoce el número de lados.
    */
    public Rectangulo(double l1, double l2) {
        super(2);
        this.l1 = l1;
        this.l2 = l2;
    }

    public double getL1() {
        return l1;
    }

    public double getL2() {
        return l2;
    }
    @Override
    public String toString() {
        return "\n\t__Rectangulo__" + super.toString() + "\nLado 1: " + l1 + "\nLado 2: " + l2;
    }
    @Override
    public double area() {
        return l1 * l2;
    }
}
