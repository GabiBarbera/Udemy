package Encapsulamiento.test;


import Encapsulamiento.dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 5000, false);
        System.out.println("persona = " + persona);
        // System.out.println("persona = " + persona.getNombre());
        persona.setNombre("Juan Carlos");
        // System.out.println("persona nombre con cambio = " + persona.getNombre());
        // System.out.println("persona sueldo = " + persona.getSueldo());
        // System.out.println("persona eliminado = " + persona.isEliminado());
        System.out.println("persona con cambio = " + persona); // No hace falta entrar al metodo .toString
    }
}
