package Kunde;

/**
 * Created by htl-ds-win7profNx64 on 14.12.2015.
 */
public class Addresse {
    int plz;
    String ort;
    String länderPräfix;
    String straße;
    int nr;

    public Addresse(int plz, String ort, String länderPräfix, String straße, int nr) {
        this.plz = plz;
        this.ort = ort;
        this.länderPräfix = länderPräfix;
        this.straße = straße;
        this.nr = nr;
    }

    public Addresse() {
    }

    @Override
    public String toString() {
        return straße+" "+nr+" "+plz+" "+ort+" "+länderPräfix;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getLänderPräfix() {
        return länderPräfix;
    }

    public void setLänderPräfix(String länderPräfix) {
        this.länderPräfix = länderPräfix;
    }

    public String getStraße() {
        return straße;
    }

    public void setStraße(String straße) {
        this.straße = straße;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }
}
