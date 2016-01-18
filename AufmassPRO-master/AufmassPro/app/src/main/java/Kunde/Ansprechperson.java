package Kunde;

/**
 * Created by htl-ds-win7profNx64 on 14.12.2015.
 */
public class Ansprechperson {
    String vorname;
    String nachname;
    String titel;

    @Override
    public String toString() {
        return titel +" "+ vorname +" "+ nachname;
    }

    public Ansprechperson(String vorname, String nachname, String titel) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.titel = titel;
    }

    public Ansprechperson() {
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}
