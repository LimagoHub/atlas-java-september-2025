package com.atlas.tiere;

public class Schwein {

    // Instanzvariablen
    private String name;
    private int gewicht;

    // Klassenvariablen
    private static int counter;


    // KLassenmethode wegen static
    public static int getCounter() {

        return counter;
    }

    // Klassenkonstruktor
    static {
        counter = 0;
    }

    // Instanz-Konstruktor
    public Schwein() {
        this("Nobody");
    }

    // Instanz-Konstruktor
    public Schwein(String name) {
        this.name = name;
        gewicht = 10;
        counter++;
    }

    // Destruktor
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Quuuiiiiieeeekkk!");
        counter--;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {

        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(final int gewicht) {
        this.gewicht = gewicht;
    }

    // Instanzmethode
    public void fuettern() {
        gewicht ++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }
}
