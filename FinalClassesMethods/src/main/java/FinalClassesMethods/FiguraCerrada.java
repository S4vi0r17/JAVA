package FinalClassesMethods;

public class FiguraCerrada extends Figura { //public class FiguraCerrada extends Figura -> Si se pone final no puede tener subclases.
    private int nLados;

    public FiguraCerrada(double tamanio, int nLados) {
        super(tamanio);
        this.nLados = nLados;
    }

    public void dibujar(){ //public final void dibujar() -> si pongo final, ya no pueen existir metodos en subclases con el mismo nombre.
        System.out.println("Dibujando una figura cerrada");
    }
}
