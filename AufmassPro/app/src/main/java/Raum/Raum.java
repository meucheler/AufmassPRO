package Raum;

import java.util.LinkedList;

/**
 * Created by tobia_000 on 21.12.2015.
 */
public class Raum {
    int raumId;
    String name;
    String bemerkung;
    LinkedList<Flaeche> listFlaeche;

    public Raum() {
    }

    public Raum(int raumId, String name, String bemerkung, LinkedList<Flaeche> listFlaeche) {
        this.raumId = raumId;
        this.name = name;
        this.bemerkung = bemerkung;
        this.listFlaeche = listFlaeche;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBemerkung() {
        return bemerkung;
    }

    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public LinkedList<Flaeche> getListFlaeche() {
        return listFlaeche;
    }

    public void setListFlaeche(LinkedList<Flaeche> listFlaeche) {
        this.listFlaeche = listFlaeche;
    }

    public int getRaumId() {
        return raumId;
    }

    public void setRaumId(int raumId) {
        this.raumId = raumId;
    }
}
