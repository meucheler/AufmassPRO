package FirmaInfos;

/**
 * Created by tobia_000 on 21.12.2015.
 */
public class Firmendaten {
    String Firmenname;
    Geschaeftsfuehrer gefuehrer;
    String firmenbuchgericht;
    String uidNr;
    String firmenbuchnummer;
    int dvrNr;
    String gerichtsstand;
    int festnetzNr;

    static int rechnungsNr;

    public Firmendaten() {
    }

    public Firmendaten(String firmenname, Geschaeftsfuehrer gefuehrer, String firmenbuchgericht, String uidNr, String firmenbuchnummer, int dvrNr, String gerichtsstand) {
        Firmenname = firmenname;
        this.gefuehrer = gefuehrer;
        this.firmenbuchgericht = firmenbuchgericht;
        this.uidNr = uidNr;
        this.firmenbuchnummer = firmenbuchnummer;
        this.dvrNr = dvrNr;
        this.gerichtsstand = gerichtsstand;
    }

    public String getFirmenname() {
        return Firmenname;
    }

    public void setFirmenname(String firmenname) {
        Firmenname = firmenname;
    }

    public Geschaeftsfuehrer getGefuehrer() {
        return gefuehrer;
    }

    public void setGefuehrer(Geschaeftsfuehrer gefuehrer) {
        this.gefuehrer = gefuehrer;
    }

    public String getFirmenbuchgericht() {
        return firmenbuchgericht;
    }

    public void setFirmenbuchgericht(String firmenbuchgericht) {
        this.firmenbuchgericht = firmenbuchgericht;
    }

    public String getUidNr() {
        return uidNr;
    }

    public void setUidNr(String uidNr) {
        this.uidNr = uidNr;
    }

    public String getFirmenbuchnummer() {
        return firmenbuchnummer;
    }

    public void setFirmenbuchnummer(String firmenbuchnummer) {
        this.firmenbuchnummer = firmenbuchnummer;
    }

    public int getDvrNr() {
        return dvrNr;
    }

    public void setDvrNr(int dvrNr) {
        this.dvrNr = dvrNr;
    }

    public String getGerichtsstand() {
        return gerichtsstand;
    }

    public void setGerichtsstand(String gerichtsstand) {
        this.gerichtsstand = gerichtsstand;
    }

    public int getFestnetzNr() {
        return festnetzNr;
    }

    public void setFestnetzNr(int festnetzNr) {
        this.festnetzNr = festnetzNr;
    }
}
