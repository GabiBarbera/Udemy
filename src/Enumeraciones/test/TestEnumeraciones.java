package Enumeraciones.test;

import Enumeraciones.enumeracion.Continentes;
import Enumeraciones.enumeracion.Dias;

import static Enumeraciones.enumeracion.Dias.LUNES;
import static Enumeraciones.enumeracion.Dias.MARTES;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia 1: " + LUNES);
        indicarDiaDeLaSemana(MARTES);
        System.out.println(" ");
        System.out.println("Continente numero 4: " + Continentes.AMERICA);
        System.out.println("Numero de paises en el 4 continente: " + Continentes.AMERICA.getPaises());
        System.out.println("Numero de habitantes en el 4 continente: " + Continentes.AMERICA.getHabitantes());
    }

    private static void indicarDiaDeLaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            default:
                System.out.println("No es un dia!");
        }
    }

}
