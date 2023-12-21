package ApiColeccionesGenericas.test;

import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {

        System.out.println("Tipo List: ");
        List<String> miLista = new ArrayList<>(); // Guarda el orden
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Domingo"); // Se duplica

        String elemento = miLista.get(4);
        System.out.println("elemento dia de la semana = " + elemento);

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
        Set<String> miSet = new HashSet<>(); // No guarda el orden
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
        Map<String, String> miMapa = new HashMap<>(); // No permite valores duplicados
        miMapa.put("Valor 1", "Juan");
        miMapa.put("Valor 2", "Karla");
        miMapa.put("Valor 3", "Carlos");
        miMapa.put("Valor 4", "Pablo");
        miMapa.put("Valor 5", "Diego"); // Se elimina y se sustituye por el ultimo
        miMapa.put("Valor 5", "Pepe");

//        String elementoMapa = (String) miMapa.get("Valor 1");
        String elementoMapa = miMapa.get("Valor 1");
        System.out.println("elemento Mapa = " + elementoMapa);
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection<String> coleccion) {
        for (Object elemento : coleccion) {
            System.out.println("Elemento: " + elemento);
        }
    }
}
