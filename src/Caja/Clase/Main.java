package Caja.Clase;

public class Main {
    public static void main(String[] args) {
        Caja caja = new Caja();
        caja.alto = 10;
        caja.profundo = 5;
        caja.ancho = 15;

        caja.calcularVolumen();

        Caja caja2 = new Caja(10,5,15);
         caja2.calcularVolumen();
    }
}
