package ClasesAbstractas.test;

import ClasesAbstractas.domain.FiguraGeometrica;
import ClasesAbstractas.domain.Rectangulo;

public class TestClasesAbstractas {
    public static void main(String[] args) {
//        FiguraGeometrica figura = new FiguraGeometrica(); No se puede

        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }
}
