package ModificadoresAcceso.paquete4;

public class Clase1 {
    private String atributoPrivado = "Atributo privado";

    private Clase1() {
        System.out.println("Constructor privado");
    }

    public Clase1(String argumento) {
        this();
        System.out.println("Constructor publico");
    }

    private void meotodoPrivado() {
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
}
