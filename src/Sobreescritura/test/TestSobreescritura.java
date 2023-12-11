package Sobreescritura.test;

import Sobreescritura.domain.Empleado;
import Sobreescritura.domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gabriel", 3000, "Sistemas");
//        System.out.println("gerente = " + gerente.obtenerDetalles());
        Empleado empleado = new Empleado("Juan", 5000);
//        System.out.println("Empleado = " + empleado.obtenerDetalles());
        imprimir(empleado); // polimorfismo

        empleado = new Gerente("Karla", 10000, "Contabilidad"); // Se reutiliza la variable empleado
//        Gerente gerente1 = new Gerente("Karla", 10000, "Contabilidad");
//        System.out.println("Gerente = " + gerente1.obtenerDetalles());
        imprimir(empleado); // polimorfismo
    }

    public static void imprimir(Empleado empleado) { // polimorfismo
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
