package Aritmetica.operaciones;

public class Aritmetica {
    // Atributos de la clase
    public int a;
    public int b;

    // Constructor vacio

    public Aritmetica() {
        System.out.println("Ejecutando constructor");
    }

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos");
    }

    // Metodo

    public void sumar() {
        int resultado = this.a + this.b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        //  int resultado = a+b;
        // return resultado;
        return this.a + this.b;
    }

    public int sumarConArgumentos(int arg1, int arg2) {
        this.a = arg1; // El arg arg1 se asigna al atributo this.a
        this.b = arg2;
        // return a + b;
        return this.sumarConRetorno();
    }
}
