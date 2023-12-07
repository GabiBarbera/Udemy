package ModificadoresAcceso.paquete2;

import ModificadoresAcceso.paquete1.Clase1;

public class ClaseHija extends Clase1 {
    public ClaseHija(){
        super();
        this.atributoProtected = "Modificacion atributo protected";
        System.out.println("AtributoProtegido = " + this.atributoProtected);
        this.metodoProtected();
    }
}
