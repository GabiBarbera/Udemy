package ConversionObjetos.test;

import ConversionObjetos.domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;

        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
//        System.out.println("empleado = " + empleado);
//        System.out.println(empleado.obtenerDetalles());

        // Downcasting (Estanos convirtiendo de la clase padre empleado hacia un tipo escritor)

//        ((Escritor) empleado).getTipoEscritura();
        Escritor escritor = (Escritor) empleado; // Misma sintaxis que arriba
        escritor.getTipoEscritura();

        // Upcasting (Estamos convirtiendo un tipo de la clase hija hacia un tipo de la clase padre)

        Empleado empleado1 = escritor;
        empleado1.obtenerDetalles();
        System.out.println("empleado1 = " + empleado1.obtenerDetalles());
    }
}
