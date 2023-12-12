package ClaseObject.test;

import ClaseObject.domain.Empleado;
import ClaseObject.domain.Escritor;

public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("juan", 5000);
        Empleado empleado1 = new Empleado("Juan", 5000);

        if (empleado == empleado1) {
            System.out.println("Tienen la misma referencia en memoria");
        } else {
            System.out.println("Tienen distinta referencia en memoria");
        }
        if (empleado.equals(empleado1)) {
            System.out.println("Los objetos son iguales en contenido");
        } else {
            System.out.println("Los objetos son distintos en contenido");
        }

        if (empleado.hashCode() == empleado1.hashCode()
        ) {
            System.out.println("El valor HashCode es igual");
        } else {
            System.out.println("El valor HashCode es distinto");
        }
    }
}
