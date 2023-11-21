package PalabraFinal.test;

import PalabraFinal.domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);

        // miVariable = 5; No se puede modificar

      //   Persona.MI_CONSTANTE = 5; no se puede modificar

        System.out.println("Mi constante = " + Persona.MI_CONSTANTE);
    }
}
