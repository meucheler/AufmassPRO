package Raum;

/**
 * Created by tobia_000 on 21.12.2015.
 */
public class Flaeche {
    int laenge;
    int breite;

    public Flaeche() {
    }

    public Flaeche(int laenge, int breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }
}
