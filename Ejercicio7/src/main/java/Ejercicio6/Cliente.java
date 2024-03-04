package Ejercicio6;

public class Cliente {
    private String nombre, apellido, DNI;
    Cuenta[] cuentas;

    public Cliente(String nombre, String apellido, String DNI, Cuenta[] cuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.cuentas = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public double consultarSaldo(int n){
        return cuentas[n].getSaldo();
    }

    public void ingresarDinero(int n, double dinero){
        cuentas[n].ingresarDinero(dinero);
    }
    public void retirarDinero(int n, double dinero){
        cuentas[n].retirarDinero(dinero);
    }
}
