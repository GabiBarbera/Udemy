package ApiColecciones.test;

import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {

        System.out.println("Tipo List: ");
        List miLista = new ArrayList<>(); // Guarda el orden
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Domingo"); // Se duplica

        imprimir(miLista);

//        System.out.println("Sintaxis de ForEach 1: ");
//        miLista.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });
//        System.out.println("Sintaxis de ForEach con f.flecha: ");
//        for (Object elemento : miLista) {
//            System.out.println("elemento = " + elemento);
//        }

        System.out.println(" ");

        System.out.println("Tipo Set: ");
        Set miSet = new HashSet(); // No guarda el orden
        miSet.add("Enero");
        miSet.add("Febrero");
        miSet.add("Marzo");
        miSet.add("Abril");
        miSet.add("Mayo");
        miSet.add("Junio");
        miSet.add("Julio");
        miSet.add("Agosto");
        miSet.add("Septiembre");
        miSet.add("Octubre");
        miSet.add("Noviembre");
        miSet.add("Diciembre");
        miSet.add("Diciembre"); // No de duplica

        imprimir(miSet);

        System.out.println(" ");

        System.out.println("Tipo Map: ");
        Map miMapa = new HashMap<>();
        miMapa.put("Valor 1", "Juan");
        miMapa.put("Valor 2", "Karla");
        miMapa.put("Valor 3", "Carlos");
        miMapa.put("Valor 4", "Pablo");
        miMapa.put("Valor 5", "Diego");

        String elemento = (String) miMapa.get("Valor 1");
        System.out.println("elemento = " + elemento);
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection coleccion) {
        for (Object elemento : coleccion) {
            System.out.println("Elemento: " + elemento);
        }
    }
}
