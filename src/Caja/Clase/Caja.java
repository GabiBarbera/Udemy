package Caja.Clase;

public class Caja {
    int alto;
    int profundo;
    int ancho;

    public Caja() {
    }

    public Caja(int alto, int profundo, int ancho) {
        this.alto = alto;
        this.profundo = profundo;
        this.ancho = ancho;
    }

    public int calcularVolumen(){
      int volumen = ancho * alto * profundo;
        System.out.println("volumen = " + volumen);
      return volumen;
    }
}
