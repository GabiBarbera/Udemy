package InstanceOf.test;


import InstanceOf.domain.Empleado;
import InstanceOf.domain.Gerente;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        determinarTipo(empleado);
        empleado = new Gerente("Karla", 10000, "Contabilidad"); // Se reutiliza la variable empleado
//        determinarTipo(empleado);
    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente");
//            ((Gerente) empleado).getDepartamento(); // Conversion en una sola linea
            Gerente gerente = (Gerente) empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo Empleado");
//            Gerente gerente = (Gerente) empleado; // Esto nos da error
//            System.out.println("gerente = " + gerente.getDepartamento()); // Esto nos da error
            System.out.println("empleado = " + empleado);
        } else if (empleado instanceof Object) {
            System.out.println("Es del tipo Object`");
        }
    }
}
