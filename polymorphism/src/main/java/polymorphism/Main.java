package polymorphism;

public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[4];
        vehiculos[0] = new Vehiculo("3211", "Toyota","B43");
        vehiculos[1] = new VehiculoTurismo("432","Movil Bus","Tanque",4);
        vehiculos[2] = new VehiculoDeportivo("32DR","Lamborghini","murcielago",500);
        vehiculos[3] = new VehiculoFurgoneta("FNWO", "TOYOTA", "J7", 3000);

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.mostrarDatos());
            System.out.println("");
        }
    }
}