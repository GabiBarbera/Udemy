package mundopcprueba;

import MundoPc.*;

public class MundoPc {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP",13);
        Teclado tecladoHP = new Teclado("Bluetooth","HP");
        Raton ratonHP = new Raton("Bluetooth","HP");
        Computadora computadoraHP = new Computadora("Computadora HP",monitorHP,tecladoHP,ratonHP);

        Monitor monitorGamer = new Monitor("Razer",34);
        Teclado tecladoGamer = new Teclado("Bluetooth","Razer");
        Raton ratonGamer = new Raton("Bluetooth","Razer");
        Computadora computadoraGamer = new Computadora("Computadora gamer",monitorGamer,tecladoGamer,ratonGamer);

        Orden orden = new Orden();
        orden.agregarComputadora(computadoraHP);
        orden.agregarComputadora(computadoraGamer);
        orden.mostrarOrden();

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();
    }
}
