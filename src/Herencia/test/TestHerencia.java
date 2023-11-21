package Herencia.test;

import Herencia.domain.Cliente;
import Herencia.domain.Empleado;
import Herencia.domain.Persona;

import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan",5000.0);
        System.out.println("empleado = " + empleado);
//        Date fecha = new Date();
//
//        Cliente cliente = new Cliente(fecha,true,"Karla",'F',28,"Saturno 15");
//        System.out.println("cliente = " + cliente);
//
//        Persona persona = new Persona();
    }
}
