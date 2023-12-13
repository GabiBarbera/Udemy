package Interfaces.test;

import Interfaces.accesoDatos.AccesoDatos;
import Interfaces.accesoDatos.ImplementacionMySql;
import Interfaces.accesoDatos.ImplementacionOracle;

public class TestInterfaces {
    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionMySql();
//        datos.listar();
        imprimir(datos);

        datos = new ImplementacionOracle();
//        datos.listar();
        imprimir(datos);

    }

    public static void imprimir(AccesoDatos datos) {
        datos.listar();
    }
}
