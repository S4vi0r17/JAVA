package Aeropuerto;

public class Compania {
    private String nombre;
    private Vuelo[] listaVuelos = new Vuelo[10];
    private int nVuelo = 0;

    public Compania(String nombre) {
        this.nombre = nombre;
    }

    public Compania(String nombre, Vuelo[] v) {
        this.nombre = nombre;
        listaVuelos = v;
        nVuelo = v.length;
    }
    public void isertarVuelo(Vuelo vuelo){
        listaVuelos[nVuelo] = vuelo;
        nVuelo++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getnVuelo() {
        return nVuelo;
    }
    public Vuelo getVuelo(int i){
        return listaVuelos[i];
    }
    public Vuelo getVuelo(String id){
        boolean encontrado = false;
        int i = 0;
        Vuelo v = null;
        while (!encontrado && i < listaVuelos.length){
            if (id.equals(listaVuelos[i].getIdentificadorVuelo())){
                encontrado = true;
                v = listaVuelos[i];
            }
            i++;
        }
        return v;
    }
}
