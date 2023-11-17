package ContextoEstatico.test;

import ContextoEstatico.domain.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
//        System.out.println("persona = " + persona);
        Persona persona1 = new Persona("Pedro");
//        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona("Gabriel");
//        System.out.println("persona2 = " + persona2);

        imprimir(persona);
        imprimir(persona1);
        imprimir(persona2);
    }

    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
}
