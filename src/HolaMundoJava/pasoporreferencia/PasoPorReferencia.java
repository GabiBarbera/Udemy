package HolaMundoJava.pasoporreferencia;


import HolaMundoJava.clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Gonzales";
        System.out.println("persona1 nombre = " + persona1.nombre);
        System.out.println("persona1 = " + persona1);
        persona1 = cambiarValor(persona1);
        System.out.println("persona1 cambio de nombre = " + persona1.nombre);
        System.out.println("persona1 = " + persona1);
    }

    public static Persona cambiarValor (Persona persona){
        persona.nombre = "Karla";
        return persona;
    }
}
