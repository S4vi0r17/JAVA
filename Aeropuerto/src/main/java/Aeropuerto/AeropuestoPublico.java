package Aeropuerto;

public class AeropuestoPublico extends Aeropuerto{
    private double subvencion;

    public AeropuestoPublico(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuestoPublico(String nombre, String ciudad, String pais, Compania[] c, double subvencion) {
        super(nombre, ciudad, pais, c);
        this.subvencion = subvencion;
    }

    public AeropuestoPublico(String nombre, String ciudad, String pais, double subvencion) {
        super(nombre, ciudad, pais);
        this.subvencion = subvencion;
    }

    public double getSubvencion() {
        return subvencion;
    }
}
