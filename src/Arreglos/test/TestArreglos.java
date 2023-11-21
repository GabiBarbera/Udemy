package Arreglos.test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades [] = new int[3];
        System.out.println("edades = " + edades);

        edades[0] = 10;
        edades[1] = 5;
        edades[2] = 2;
        System.out.println("edades 0 = " + edades[0]);
        // edades[5] = 2; Error en compilacion

        for (int i = 0; i < edades.length; i++){
            System.out.println("Edades elemento " + i + ": " + edades[i]);
        }
    }
}
