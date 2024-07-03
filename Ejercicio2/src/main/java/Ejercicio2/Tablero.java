package Ejercicio2;

public class Tablero {
    private int x, y;

    //Metodos

    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void izquierda(int n){
        x -= n;
    }
    public void derecha(int n){
        x += n;
    }
    public void arriba(int n){
        y += n;
    }
    public void abajo(int n){
        y -= n;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
