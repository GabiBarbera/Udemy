package Herencia.domain;

public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(int idEmpleado, double sueldo) {
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }
}
