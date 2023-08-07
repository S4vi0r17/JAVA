package polymorphism;

public class VehiculoTurismo extends Vehiculo{
    private int nPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int nPuerta) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuerta;
    }

    public int getnPuerta() {
        return nPuertas;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "\n#Puertas: " + nPuertas;
    }
}
