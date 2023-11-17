package HolaMundoJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        // Definimos la variable
//
//        int miVariableEntera = 10;
//        System.out.println(miVariableEntera);
//
//        // Modificamos el valor de la variable
//
//        miVariableEntera = 5;
//        System.out.println(miVariableEntera);
//
//        String miVariableCadena = "Saludos";
//        System.out.println(miVariableCadena);
//
//        miVariableCadena = "Adios";
//        System.out.println(miVariableCadena);
//
//        // var inferencia de tipos en java
//
//        var miVariableEntera2 = 15;
//        System.out.println(miVariableEntera2);
//
//        var miVariableCadena2 = "Nueva cadena";
//        System.out.println("miVariableCadena2 = " + miVariableCadena2);
//
//        // Valores permitidos en el nombre de variables
//
//        var miVariable = 1;
//        var _miVariable = 2;
//        var $miVariable = 3;
//
//        // Concatenacion de variables
//
//        var usuario = "Juan";
//        var titulo = "Ingeniero";
//        var union = titulo + " " + usuario;
//        System.out.println("union = " + union);
//
//        var i = 3;
//        var j = 4;
//
//        System.out.println(i + j);// Se realiza la suma de numeros
//        System.out.println(i + j + " " + usuario);// Evaluacion de izq a der, realiza suma
//        System.out.println(usuario + " " + i + j);// Contexto cadena, todito es una cadena
//        System.out.println(usuario + " " + (i + j));// Uso de parentesis modifican la prioridad en la evaluacion
//
//        var nombre = "Carla";
//
//        System.out.println("Nueva linea: \n" + nombre);
//        System.out.println("Tabulador: \t" + nombre);
//        System.out.println("Retroceso: \b" + nombre);
//        System.out.println("Comilla simple: \'" + nombre + "'");
//        System.out.println("Comilla doble: \"" + nombre + "\"");

//        System.out.println("Escribe tu nombre");
//        Scanner consola = new Scanner(System.in);
//
//        var usuario1 = consola.nextLine();
//        System.out.println("usuario1 = " + usuario1);
//
//        System.out.println("Escribe tu titulo:");
//        var titulo1 = consola.nextLine();
//        System.out.println("Resultado = " + titulo1 + " " + usuario1);

//        Scanner consola = new Scanner(System.in);
//
//        System.out.println("Proporciona el titulo:");
//        var titulo2 = consola.nextLine();
//        System.out.println("Proporciona el autor:");
//        var autor = consola.nextLine();
//        System.out.println(titulo2 + " fue escrito por " + autor);

        /*
        Tipod primitivos enteros: byte, short, int, long
         */

//        byte numeroByte = (byte)129;
//        System.out.println("numeroByte = " + numeroByte);
//        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
//        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);

//        short numeroShort = 10;
//        System.out.println("numeroShort = " + numeroShort);
//        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
//        System.out.println("Valor maximo short: " + Short.MAX_VALUE);

//        short numeroInt = 10;
//        System.out.println("numeroShort = " + numeroInt);
//        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
//        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);

//        long numeroLong = 9223372036854775807L;
//        System.out.println("numeroShort = " + numeroLong);
//        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
//        System.out.println("Valor maximo long: " + Long.MAX_VALUE);

        /*
        Tipos primitivos de tipo flotante: float y double
         */

//        float numeroFloat = 3.4028235E38F;
//        System.out.println("numeroFloat = " + numeroFloat);
//        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
//        System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);

//        double numeroDouble = 1.7976931348623157E308;
//        System.out.println("numeroFloat = " + numeroDouble);
//        System.out.println("Valor minimo tipo double: " + Double.MIN_VALUE);
//        System.out.println("Valor maximo tipo double: " + Double.MAX_VALUE);

//        var numeroEntero = 10;
//        System.out.println("numeroEntero = " + numeroEntero);
//
//        var numeroDouble = 10.0;
//        System.out.println("numeroDouble = " + numeroDouble);
//
//        var numeroFloat = 10.0F;
//        System.out.println("numeroFloat = " + numeroFloat);
//
//        char miCaracter = 'A';
//        System.out.println("miCaracter = " + miCaracter);
//
//        char varChar = '\u0021';
//        System.out.println("varChar = " + varChar);
//
//        char varCharDecimas = 33;
//        System.out.println("varCharDecimas = " + varCharDecimas);
//
//        char varCharSimbolo = '!';
//        System.out.println("varCharSimbolo = " + varCharSimbolo);
//
//        var varChar1 = '\u0021';
//        System.out.println("varChar = " + varChar1);
//
//        var varCharDecimas2 = 33; //  Si usamos var en este caso, va a detectar el numero
//        System.out.println("varCharDecimas = " + varCharDecimas2);
//
//        var varCharSimbolo3 = '!';
//        System.out.println("varCharSimbolo = " + varCharSimbolo3);
//
//        int variableEnteraSimbolo = '!';
//        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
//
//        int letra = 'A';
//        System.out.println("letra = " + letra);

//        boolean varBoolean = false;
//        System.out.println("varBoolean = " + varBoolean);
//
//        if (varBoolean){
//            System.out.println("La bandera esta en verde");
//        }else {
//            System.out.println("La bandera esta en rojo");
//        }

//        int edad = 30;
//       // boolean esAdulto = edad >= 18;
//
//        if (edad >= 18){
//            System.out.println("Es mayor de edad");
//        }else{
//            System.out.println("Es menor de edad");
//        }

        // Convertir tipo String a un tipo int

//        var edad = Integer.parseInt("20");
//
//        //var edad = "20";
//
//        System.out.println("edad = " + (edad + 1));
//
//        var valorPi = Double.parseDouble("3.1416");
//        System.out.println("valorPi = " + valorPi);
//
//        // Pedir un valor
//
//        var consola = new Scanner(System.in);
//        System.out.println("Ingresa tu edad:");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese su edad: ");
//        int edad = scanner.nextInt();
//        System.out.println("Su edad es = " + edad);

//        var edadTexto = String.valueOf(10);
//        System.out.println("edadTexto = " + edadTexto);
//
//        var caracter = "hola".charAt(3);
//        System.out.println("caracter = " + caracter);

//        System.out.println("Ingresa un caracter:");
//       Character caracter = scanner.nextLine().charAt(0);
//        System.out.println("caracter = " + caracter);
//
//        System.out.println("Proporciona el nombre: ");
//        String nombre = scanner.nextLine();
//        System.out.println("Poprociona el id: ");
//        int id = scanner.nextInt();
//        System.out.println("Proporciona el precio: ");
//        double precio = scanner.nextInt();
//        System.out.println("Proporciona el envio gratuito: ");
//        boolean envio = scanner.nextBoolean();
//        System.out.println(nombre + " " + "#" + id);
//        System.out.println("Precio: $" + precio);
//        System.out.println("Envio gratuito: " + envio);

//        int a=3,b=2;
//        var resultado = a + b;
//        System.out.println("resultado suma = " + resultado);
//
//        resultado = a - b;
//        System.out.println("resultado resta = " + resultado);
//
//        resultado = a * b;
//        System.out.println("resultado de la multiplicacion = " + resultado);
//
//        var resultado2 = 3D / b;
//        System.out.println("resultado de la division = " + resultado2);
//
//        resultado = a % b;
//        System.out.println("resultado = " + resultado);
//
//        if (a % 2 == 0){
//            System.out.println("El numero es par");
//        }else {
//            System.out.println("El numero es impar");
//        }
//
//        int a = 3 , b = 2;
//        int c = a + 5 - b;
//        System.out.println("c = " + c);
//
//        a += 1; // a = a + 1
//        System.out.println("a = " + a);
//
//        a += 3; // a = a + 3
//        System.out.println("a = " + a);
//
//        a -= 2; // a = a - 2
//        System.out.println("a = " + a);

//        int a = 3;
//        int b = -a;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//
//        boolean c = true;
//        boolean d = !c;
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);
//
//        // Incremento
//        // 1. Preincremento (simbolo antes de la variable)
//
//        int e = 3;
//        int f = ++e; // Primero incrementa la variable y despues usa su valor
//        System.out.println("e = " + e);
//        System.out.println("f = " + f);
//
//        // 2.Postincremento (simbolo despues de la variable)
//        int g = 5;
//        int h = g++; // Primero se utiliza el valor y despues incrementa
//        System.out.println("g = " + g); // Teniamos pendiente un incremento
//        System.out.println("h = " + h);
//
//        // Decremento
//        // Predecremento
//
//        int i = 2;
//        int j = --i;
//        System.out.println("i = " + i); // Ya esta decrementada
//        System.out.println("j = " + j);
//
//        // Postdecremento
//
//        int k = 4;
//        int l = k--; // Primero se usa el valor de la variable y queda pendiente decremento
//        System.out.println("k = " + k); // Tenia pendiente un decremento
//        System.out.println("l = " + l);
//
//        int a = 3;
//        int b = 2;
//
//        boolean c = (a == b);
//        System.out.println("c = " + c);
//
//        boolean d = a != b;
//        System.out.println("d = " + d);
//
//        String cadena = "Hola";
//        String cadena2 = "Adios";
//        boolean e = cadena == cadena2; // Compara referencias de objetos
//        System.out.println("e = " + e);
//        boolean f = cadena.equals(cadena2); // Comparamos contenodo de cadenas
//        System.out.println("f = " + f);
//
//        boolean g = a >= b; // Mayor que > o el mayor igual >=
//        System.out.println("g = " + g);
//
//        if (a % 2 == 0) {
//            System.out.println("Es numero par");
//        } else {
//            System.out.println("Es numero impar");
//        }
//
//        int edad = 10;
//        int adulto = 18;
//
//        if (edad >= adulto){
//            System.out.println("Es mayor de edad");
//        }else {
//            System.out.println("Es menor de edad");
//        }
//
//        int a = 8;
//        int valorMinimo = 0;
//        int valorMaximo = 10;
//        boolean resultado = a >= valorMinimo && a <= valorMaximo;
//        System.out.println("resultado = " + resultado);
//        if (resultado){
//            System.out.println("Dentro del rango");
//        }else {
//            System.out.println("Fuera del rango");
//        }
//
//        boolean vacaciones = false;
//        boolean diaDescanso = false;
//
//        if (vacaciones || diaDescanso){
//            System.out.println("El padre puede asistir al juego del hijo");
//        }else {
//            System.out.println("El padre esta ocupado");
//        }
//
//        String resultado = (1 > 2) ? "Verdadero" : "Falso";
//        System.out.println("resultado = " + resultado);
//
//        int numero = 9 ;
//        resultado = (numero % 2 == 0) ? "Numero par" : "Numero impar";
//        System.out.println("resultado = " + resultado);
//
//        int x = 5;
//        int y = 10;
//        int z = ++x + y--;
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//        System.out.println("z = " + z);
//
//        int resultado = 4 + 5 * 6 / 3; // 4 + ((5 * 6) / 3)
//        System.out.println("resultado = " + resultado); // 14
//
//        resultado = (4 + 5) * 6 / 3;
//        System.out.println("resultado = " + resultado); // 18

//        System.out.println("Proporciona el alto: ");
//        int alto = scanner.nextInt();
//        System.out.println("Proporciona el ancho ");
//        int ancho = scanner.nextInt();
//        int area = alto * ancho;
//        System.out.println("area = " + area);
//        int perimetro = (alto + ancho) * 2;
//        System.out.println("perimetro = " + perimetro);
//
//        System.out.println("Proporciona el numer1: ");
//        int numero1 = scanner.nextInt();
//        System.out.println("Proporciona el numero2: ");
//        int numero2 = scanner.nextInt();
//
//        String comprobacion = numero1 > numero2 ? "El numero1 es mayor" : "El numero2 es el mayor";
//        System.out.println("Comprobacion = " + comprobacion);
//
//        boolean condicion = true;
//
//        if (condicion) {
//            System.out.println("La condicion es verdadera");
//            System.out.println("Nueva linea dentro de la condicion verdadera");
//        } else {
//            System.out.println("La condicion es falsa");
//            System.out.println("Nueva linea en la condicion falsa");
//        }
//
//        int numero = 1;
//        String numeroTexto = "Numero Desconocido";
//
//        if (numero == 1){
//            numeroTexto = "Numero uno";
//        } else if (numero == 2) {
//            numeroTexto = "Numero dos";
//        } else if (numero == 3) {
//            numeroTexto = "Numero tres";
//        } else if (numero == 4){
//            numeroTexto = "Numero cuatro";
//        }else{
//            numeroTexto = "Numero no encontrado";
//        }
//        System.out.println("numero Texto = " + numeroTexto);
//
//        System.out.println("Ingrese numero del mes: ");
//        int mes = scanner.nextInt();
//        String estacion = "Estacion desconocida";
//
//        if (mes == 1 || mes == 2 || mes == 12) {
//            estacion = "Estacion verano";
//        } else if (mes == 9 || mes == 10 || mes == 11) {
//            estacion = "Estacion primavera";
//        } else if (mes == 3 || mes == 4 || mes == 5) {
//            estacion = "Estacion otoño";
//        } else if (mes == 6 || mes == 7 || mes == 8) {
//            estacion = "Estacion es invierno";
//        }
//        System.out.println(estacion);
//
//        System.out.println("Ingrese un numero del 1 al 4: ");
//        int numero = scanner.nextInt();
//        String numeroTexto = "Valor desconocido";
//
//        switch (numero){
//            case 1 :
//                numeroTexto = "Numero uno";
//                break;
//            case 2 :
//                numeroTexto = "Numero dos";
//                break;
//            case 3 :
//                numeroTexto = "Numero tres";
//                break;
//            case 4 :
//                numeroTexto = "Numero cuatro";
//                break;
//            default:
//                numeroTexto = "Caso no encontrado";
//        }
//        System.out.println("numeroTexto = " + numeroTexto);
//
//        System.out.println("Ingrese un mes en numero: ");
//        int mes = scanner.nextInt();
//        String estacion = "Estacion desconocida";
//
//        switch (mes){
//            case 1: case 2: case 12:
//                estacion = "Es verano";
//            break;
//            case 9: case 10: case 11:
//                estacion = "Es primavera";
//                break;
//            case 3: case 4: case 5:
//                estacion = "Es otoño";
//                break;
//            case 6: case 7: case 8:
//                estacion = "Es invierno";
//                break;
//        }
//        System.out.println("estacion = " + estacion);
//
//        System.out.println("Ingrese una calificacion del 0 al 10");
//        int calificacionNumero = scanner.nextInt();
//        String calificacion = "Valor desconocido";
//
//        if (calificacionNumero == 10 || calificacionNumero == 9){
//            calificacion = "A";
//        } else if (calificacionNumero == 8) {
//            calificacion = "B";
//        } else if (calificacionNumero == 7) {
//            calificacion = "D";
//        } else if (calificacionNumero <= 6) {
//            calificacion = "F";
//        }
//        System.out.println("calificacion = " + calificacion);
//
//        int contador = 0;
//
//        while (contador <= 3){
//            System.out.println("contador = " + contador);
//            contador++;
//        }
//
//        int contador = 0;
//
//        do {
//            System.out.println("contador = " + contador);
//            contador++;
//        } while ( contador < 3 );
//
//        for ( int i = 0 ; i < 3 ; i++ ){
//            if (i % 2 == 0){
//                System.out.println("i = " + i);
//                break;// Rompe el ciclo con el primer resultado true // no se usa
//            }
//        }
//
//        for (int i = 0; i < 3; i++) {
//            if (i % 2 != 0) {
//                continue; // Va a la siguiente iteracion // no se usa
//            }
//            System.out.println("i = " + i);
//        }


    }
}