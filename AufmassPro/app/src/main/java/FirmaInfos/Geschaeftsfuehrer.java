package FirmaInfos;

/**
 * Created by tobia_000 on 21.12.2015.
 */
public class Geschaeftsfuehrer {
    String vorname;
    String nachname;

    public Geschaeftsfuehrer() {
    }

    public Geschaeftsfuehrer(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
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
}
