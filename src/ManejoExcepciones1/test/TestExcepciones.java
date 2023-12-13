package ManejoExcepciones1.test;

import ManejoExcepciones1.aritmetica.Aritmetica;
import ManejoExcepciones1.excepciones.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = Aritmetica.division(10, 0);
        }catch (OperacionExcepcion e){
            System.out.println("Ocurrio un error de tipo OperacionExcepcion: ");
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Ocurrio un error de tipo Excepcion: ");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());;
        }
        finally {
            System.out.println("Se realizo la division entre cero");
        }
        System.out.println("resultado = " + resultado);
    }
}
