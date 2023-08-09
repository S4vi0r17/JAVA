package Aeropuerto;

public class AeropuertoPrivado extends Aeropuerto{
    private String[] listaEmpresas = new String[10];
    private int nEmpresas;

    public AeropuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPrivado(String nombre, String ciudad, String pais, Compania[] c, String[] e) {
        super(nombre, ciudad, pais, c);
        this.listaEmpresas = e;
        nEmpresas = e.length;
    }
    public void insertarEmpresas(String[] e){
        this.listaEmpresas = e;
        this.nEmpresas = e.length;
    }
    public void insertarEmpresa(String e){
        listaEmpresas[nEmpresas] = e;
        nEmpresas++;
    }

    public String[] getListaEmpresas() {
        return listaEmpresas;
    }

    public int getnEmpresas() {
        return nEmpresas;
    }
}

