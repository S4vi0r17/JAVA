package Ejercicio8;

public class Paquete {
    private int nReferencia, prioridad; //0=normal, 1=alta, 2=express
    String DNI;
    private double peso;

    public Paquete(int nReferencia, String DNI, int prioridad, double peso) {
        this.nReferencia = nReferencia;
        this.DNI = DNI;
        this.prioridad = prioridad;
        this.peso = peso;
    }

    public int getnReferencia() {
        return nReferencia;
    }

    public String getDNI() {
        return DNI;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public double getPeso() {
        return peso;
    }

    public String mostrarDatosPaquete(){
        return "Datos del paquete: " +
                "\n- Numero de referencia: " + nReferencia +
                "\n- DNI de emisor: " + DNI + "\n- Prioridad: " + prioridad +
                "\n- Peso del paquete: " + peso;
    }
}
