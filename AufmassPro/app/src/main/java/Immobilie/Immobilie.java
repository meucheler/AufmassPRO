package Immobilie;

import java.util.LinkedList;

import Raum.Raum;

/**
 * Created by tobia_000 on 21.12.2015.
 */
public class Immobilie {
    LinkedList<Raum> listRaum;

    public Immobilie(LinkedList<Raum> listRaum) {
        this.listRaum = listRaum;
    }

    public Immobilie() {
    }

    public LinkedList<Raum> getListRaum() {
        return listRaum;
    }

    public void setListRaum(LinkedList<Raum> listRaum) {
        this.listRaum = listRaum;
    }
}
