package SobreCargaMetodos.test;

import SobreCargaMetodos.operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        int resultado = Operaciones.sumar(5,3);
        System.out.println("resultado entero = " + resultado);

        double resultado2 = Operaciones.sumar(2D,3);
        System.out.println("resultado double = " + resultado2);

        var resultado3 = Operaciones.sumar(3,5L);
        System.out.println("resultado long = " + resultado3);
    }
}
