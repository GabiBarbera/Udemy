package BloquesInicializacion.Test;

import BloquesInicializacion.Domain.Persona;

public class TestBloquesInicializacion {
    public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.println("persona = " + persona);
        System.out.println(" ");
        Persona persona1 = new Persona();
        System.out.println("persona1 = " + persona1);
    }
}
