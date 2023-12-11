package ModificadoresAcceso.paquete4;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
    Clase1 clase1 = new Clase1("Publico");
    clase1.setAtributoPrivado("Cambio valor atributo");
        System.out.println("clase1  = " + clase1.getAtributoPrivado());
    }
}
