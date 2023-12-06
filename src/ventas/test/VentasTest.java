package ventas.test;


import ventas.Orden;
import ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto = new Producto("Camisa", 50.00);
        Producto producto1 = new Producto("Pantalon", 250.00);
        Producto producto2 = new Producto("Zapatillas", 190.00);
        Producto producto3 = new Producto("Campera", 350.00);
        Producto producto4 = new Producto("Moño", 20.00);
        Producto producto5 = new Producto("Cinturon", 80.00);
        Producto producto6 = new Producto("Corbata", 60.00);
        Producto producto7 = new Producto("Medias", 25.00);
        Producto producto8 = new Producto("Saco", 500.00);
        Producto producto9 = new Producto("Zapatos", 230.00);
        Producto producto10 = new Producto("Cartera", 10.00);

        Orden orden = new Orden();
        orden.agregarProducto(producto);
        orden.agregarProducto(producto1);
        orden.agregarProducto(producto10);
        orden.mostrarOrden();

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto);
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto9);
        orden1.agregarProducto(producto8);
        orden1.agregarProducto(producto6);
        orden1.agregarProducto(producto5);
        orden1.agregarProducto(producto7);
        orden1.agregarProducto(producto10);
        orden1.mostrarOrden();
    }
}
