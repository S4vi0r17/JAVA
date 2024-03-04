package polymorphism;

public class Vehiculo {
    protected String matricula, marca, modelo;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMetricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String mostrarDatos(){
        return "\nMatricula: " + matricula +
                "\nMarca:" + marca +
                "\nModelo: " + modelo;
    }
}
