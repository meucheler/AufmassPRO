package Kunde;

import Utils.Addresse;
import Utils.Bankdaten;
import Utils.Kontaktdaten;

/**
 * Created by htl-ds-win7profNx64 on 14.12.2015.
 */
public class Kunde {
    Ansprechperson ansprechperson;
    String zusatzDaten;
    Addresse addresse;
    Kontaktdaten kontaktdaten;
    int kundenNr;
    String ustID;
    Bankdaten bankdaten;

    @Override
    public String toString() {
        return  "" + kundenNr + ansprechperson.toString() ;

    }

    public Kunde() {
    }

    public Kunde(Ansprechperson ansprechperson, String zusatzDaten, Addresse addresse, Kontaktdaten kontaktdaten, int kundenNr, String ustID, Bankdaten bankdaten) {
        this.ansprechperson = ansprechperson;
        this.zusatzDaten = zusatzDaten;
        this.addresse = addresse;
        this.kontaktdaten = kontaktdaten;
        this.kundenNr = kundenNr;
        this.ustID = ustID;
        this.bankdaten = bankdaten;
    }

    public Ansprechperson getAnsprechperson() {
        return ansprechperson;
    }

    public void setAnsprechperson(Ansprechperson ansprechperson) {
        this.ansprechperson = ansprechperson;
    }

    public String getZusatzDaten() {
        return zusatzDaten;
    }

    public void setZusatzDaten(String zusatzDaten) {
        this.zusatzDaten = zusatzDaten;
    }

    public Addresse getAddresse() {
        return addresse;
    }

    public void setAddresse(Addresse addresse) {
        this.addresse = addresse;
    }

    public Kontaktdaten getKontaktdaten() {
        return kontaktdaten;
    }

    public void setKontaktdaten(Kontaktdaten kontaktdaten) {
        this.kontaktdaten = kontaktdaten;
    }

    public int getKundenNr() {
        return kundenNr;
    }

    public void setKundenNr(int kundenNr) {
        this.kundenNr = kundenNr;
    }

    public String getUstID() {
        return ustID;
    }

    public void setUstID(String ustID) {
        this.ustID = ustID;
    }

    public Bankdaten getBankdaten() {
        return bankdaten;
    }

    public void setBankdaten(Bankdaten bankdaten) {
        this.bankdaten = bankdaten;
    }
}
