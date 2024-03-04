package FinalClassesMethods;

public class Cuadrado extends FiguraCerrada{
    private double area;

    public Cuadrado(double tamanio, int nLados, double area) {
        super(tamanio, nLados);
        this.area = area;
    }

    public void dibujar(){
        System.out.println("Dibujamos un cuadrado");
    }
}
