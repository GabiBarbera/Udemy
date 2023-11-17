package Aritmetica.operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {

        int a = 10;
        int b = 2;
        miMetodo();

        // Constructor vacio
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();

        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("Resultado desde la clase de prueba = " + resultado);

        resultado = aritmetica1.sumarConArgumentos(4,9);
        System.out.println("Resultado usando argumentos = " + resultado);

        System.out.println("Aritmetica1 a:" + aritmetica1.a);
        System.out.println("Aritmetica1 b:" + aritmetica1.b);

        // Constructor con argumentos
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("Aritmerica2 a: " + aritmetica2.a);
        System.out.println("Aritmerica2 b: " + aritmetica2.b);
    }
    public static void miMetodo(){
        // La variable a esta fuera del alcance donde fue definida
        // a = 10;
        System.out.println("Otro metodo");
    }
}
