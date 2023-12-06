package ventas.test;


import ventas.Orden;
import ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto = new Producto("Camisa", 50.00);
        Producto producto1 = new Producto("Pantalon", 100.00);

        Orden orden = new Orden();
        orden.agregarProducto(producto);
        orden.agregarProducto(producto1);
        orden.mostrarOrden();
    }
}
