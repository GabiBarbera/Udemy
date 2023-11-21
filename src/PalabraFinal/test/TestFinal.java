package PalabraFinal.test;

import PalabraFinal.domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);

        // miVariable = 5; No se puede modificar

        //   Persona.MI_CONSTANTE = 5; no se puede modificar

        System.out.println("Mi constante = " + Persona.MI_CONSTANTE);

        final Persona persona1 = new Persona();
        // persona1 = new Persona();
        System.out.println("persona1 = " + persona1.getNombre());
        persona1.setNombre("Pedro");
        System.out.println("Persona 1 nombre = " + persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println("persona1 nombre = " + persona1.getNombre());
    }
}
