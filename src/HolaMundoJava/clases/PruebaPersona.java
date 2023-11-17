package HolaMundoJava.clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); // Instancia
        System.out.println("persona1 = " + persona1); // Espacio en memoria
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();

        Persona persona2 = new Persona(); // Instancia
        System.out.println("persona2 = " + persona2); // Espacio en memoria
        persona2.nombre = "karla";
        persona2.apellido = "Lara";
        persona2.desplegarInformacion();
    }
}
