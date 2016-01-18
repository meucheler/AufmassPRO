package Immobilie;

import java.util.LinkedList;

import Raum.Raum;

/**
 * Created by tobia_000 on 21.12.2015.
 */
public class Immobilie {
    LinkedList<Raum> listRaum;
    int immoId;

    public Immobilie(LinkedList<Raum> listRaum, int immoId) {
        this.listRaum = listRaum;
        this.immoId = immoId;
    }

    public Immobilie() {
    }

    public LinkedList<Raum> getListRaum() {
        return listRaum;
    }

    public void setListRaum(LinkedList<Raum> listRaum) {
        this.listRaum = listRaum;
    }

    public int getImmoId() {
        return immoId;
    }

    public void setImmoId(int immoId) {
        this.immoId = immoId;
    }
}
