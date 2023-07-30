
package paquete2;

import paquete1.Clase1; // Se importa cuando esta en otro paquete "* == todos"
public class Clase3 {
    public static void main(String[] args) {
        Clase1 ob1 = new Clase1();
        ob1.atributo1=100;
    }
}
