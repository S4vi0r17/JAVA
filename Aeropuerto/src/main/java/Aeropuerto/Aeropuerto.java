package Aeropuerto;

public class Aeropuerto {
    private String nombre,ciudad,pais;
    private Compania[] listaCompanias = new Compania[10];
    private int nCompania;

    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.nCompania = 0;
    }
    public Aeropuerto(String nombre, String ciudad, String pais, Compania[] c) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        listaCompanias = c;
        this.nCompania = listaCompanias.length;
    }
    public void insertarCompania(Compania compania){
        listaCompanias[nCompania] = compania;
        nCompania++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public Compania[] getListaCompanias() {
        return listaCompanias;
    }

    public int getnCompania() {
        return nCompania;
    }
    public Compania getCompania(int i){
        return listaCompanias[i];
    }
    public Compania getCompania(String nombre){
        boolean encontrado = false;
        int i = 0;
        Compania c = null;
        while (!encontrado && i < listaCompanias.length){
            if (nombre.equals(listaCompanias[i].getNombre())){
                encontrado = true;
                c = listaCompanias[i];
            }
            i++;
        }
        return c;
    }
}
