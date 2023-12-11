package ModificadoresAcceso.paquete3;

public class ClaseHija extends Clase1 {
    public ClaseHija() {
        super();
        this.atributoDefault = "Modificacion atributo default";
        System.out.println("AtributoDefault = " + this.atributoDefault);
        this.metodoDefault();
    }
}
