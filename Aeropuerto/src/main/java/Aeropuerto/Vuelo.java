package Aeropuerto;

public class Vuelo {
    private String identificadorVuelo, ciudadOrigen, ciudadDestino;
    private double precio;
    private int numMaxPasajeros, numActualPasajeros;
    private Pasajero[] listaPasajeros;

    public Vuelo(String identificadorVuelo, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros) {
        this.identificadorVuelo = identificadorVuelo;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActualPasajeros = 0;
        this.listaPasajeros = new Pasajero[numMaxPasajeros];
    }
    public void insertarPasajero(Pasajero pasajero){
        listaPasajeros[numActualPasajeros] = pasajero;
        numActualPasajeros++;
    }

    public String getIdentificadorVuelo() {
        return identificadorVuelo;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public int getNumActualPasajeros() {
        return numActualPasajeros;
    }
    public Pasajero getPasajero(int i){
        return listaPasajeros[i];
    }
    public Pasajero getPasajero(String pasaporte){
        boolean encontrado = false;
        int i = 0;
        Pasajero pas = null;

        while (!encontrado && i < listaPasajeros.length){
            if (pasaporte.equals(listaPasajeros[i].getPasaporte())){
                encontrado = true;
                pas = listaPasajeros[i];
            }
            i++;
        }
        return pas;
    }
}
