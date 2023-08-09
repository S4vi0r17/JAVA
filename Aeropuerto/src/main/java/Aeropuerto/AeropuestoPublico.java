package Aeropuerto;

public class AeropuestoPublico extends Aeropuerto{
    private double subvension;

    public AeropuestoPublico(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuestoPublico(String nombre, String ciudad, String pais, Compania[] c, double subvension) {
        super(nombre, ciudad, pais, c);
        this.subvension = subvension;
    }

    public AeropuestoPublico(String nombre, String ciudad, String pais, double subvension) {
        super(nombre, ciudad, pais);
        this.subvension = subvension;
    }

    public double getSubvension() {
        return subvension;
    }
}
