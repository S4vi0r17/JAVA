package Ejercicio8;

public class Sucursal {
    private String direccion, ciudad;
    private int nSucursal;

    public Sucursal(String direccion, String ciudad, int nSucursal) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.nSucursal = nSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getnSucursal() {
        return nSucursal;
    }

    public String mostrarDatosSucursal(){
        return "Datos de la Sucursal: " +
                "\n- Direccion y Ciudad: " + direccion + ", " + ciudad +
                "\n- Numero de sucursal: " + nSucursal;
    }

    public double precioPaquete(Paquete p){
        double total = p.getPeso();
        if (p.getPrioridad() == 1) {
            total += 10;
        }
        if (p.getPrioridad() == 2) {
            total += 20;
        }
        return total;
    }
}
/*
Ejercicio 8: Una empresa de envío de paquetes tiene varias
sucursales en todo el país. Cada sucursal esta definida por su
número de sucursal, dirección y ciudad. Para calcular el
precio que cuesta enviar cada paquete, las sucursales tienen
en cuenta el precio del paquete y la prioridad, sabiendo que
se cobra un dólar por kilo, 10 dólares más si la prioridad es
alta y 20 si es express. Cada paquete enviado tendrá un
número de referencia y el DNI de la persona que 10 envía.
*/