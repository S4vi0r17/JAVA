package Ejercicio1;

public class Cuadrilatero {
    private int lado1, lado2;

    //Metodos

    public Cuadrilatero(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrilatero(int lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    public float getArea(){
        float area = (lado1 * lado2);
        return area;
    }

    public float getPerimetro(){
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }
}
