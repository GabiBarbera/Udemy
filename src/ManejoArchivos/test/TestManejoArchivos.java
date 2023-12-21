package ManejoArchivos.test;

import static ManejoArchivos.manejoArchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "Prueba.txt";
//        crearArchivo(nombreArchivo);
//        anexarArchivo(nombreArchivo, "Hola desde Java");
//        anexarArchivo(nombreArchivo, "Adios desde Java");
        leerArchivo(nombreArchivo);
    }
}
