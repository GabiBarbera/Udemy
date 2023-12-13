package ManejoExcepciones1.excepciones;

public class OperacionExcepcion extends RuntimeException {
    public OperacionExcepcion(String mensaje) {
        super(mensaje);
    }
}
