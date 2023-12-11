package Sobreescritura.test;

import Sobreescritura.domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gabriel",3000,"Sistemas");
        System.out.println("gerente = " + gerente.obtenerDetalles());
    }
}
