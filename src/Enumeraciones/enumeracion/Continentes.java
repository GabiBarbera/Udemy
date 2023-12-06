package Enumeraciones.enumeracion;

public enum Continentes {
    AFRICA(54,"+ 1.3 mil millones de personas"),
    EUROPA(44, "Alrededor de 747 millones de personas"),
    ASIA(49, "+ 4.6 mil millones de personas"),
    AMERICA(70, "+ 2.0 mil millones"),
    OCEANIA(14, "Alrededor de 42 millones de personas");

    private final int paises;
    private final String habitantes;

    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }

    public int getPaises() {
        return paises;
    }

    public String getHabitantes() {
        return habitantes;
    }
}
