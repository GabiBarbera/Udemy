package ModificadoresAcceso.paquete1;

public class Clase1 {
    public String atributoPublico = "Valor atributo publico";

//    public Clase1(){
//        System.out.println("Constructor Publico");
//    }

    public void metodoPublico(){
        System.out.println("Metodo publico");
    }

    protected String atributoProtected = "Valor atributo protected";

    protected Clase1(){
        System.out.println("Constructor protected");
    }

    public Clase1(String arg){
        System.out.println("Contructor publico");
    }

    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }
}
