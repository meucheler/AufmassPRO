package Bauvorhaben;


import java.util.LinkedList;

import Immobilie.Immobilie;
import Utils.Addresse;

/**
 * Created by tobia_000 on 21.12.2015.
 * supertollefirsteReihe
 */
public class Bauvorhaben {

    int id;
    Addresse adresse;
    int kdNr;
    String beschreibung;
    String name;
    String art;
    LinkedList<Immobilie> listImmobilie = new LinkedList<>();

    public Bauvorhaben() {
    }

    public Bauvorhaben(int id, Addresse adresse, int kdNr, String beschreibung, String name, String art, LinkedList<Immobilie> listImmobilie) {
        this.id = id;
        this.adresse = adresse;
        this.kdNr = kdNr;
        this.beschreibung = beschreibung;
        this.name = name;
        this.art = art;
        this.listImmobilie = listImmobilie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Addresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Addresse adresse) {
        this.adresse = adresse;
    }

    public int getKdNr() {
        return kdNr;
    }

    public void setKdNr(int kdNr) {
        this.kdNr = kdNr;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Immobilie> getListImmobilie() {
        return listImmobilie;
    }

    public void setListImmobilie(LinkedList<Immobilie> listImmobilie) {
        this.listImmobilie = listImmobilie;
    }
}
