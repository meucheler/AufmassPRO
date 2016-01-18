package Utils;

/**
 * Created by htl-ds-win7profNx64 on 14.12.2015.
 */
public class Addresse {
    int plz;
    String ort;
    String laenderPraefix;
    String straße;
    int nr;

    @Override
    public String toString() {
        return straße+" "+nr+" "+plz+" "+ ort+" "+ laenderPraefix;
    }

    public Addresse(int plz, String ort, String laenderPraefix, String straße, int nr) {
        this.plz = plz;
        this.ort = ort;
        this.laenderPraefix = laenderPraefix;
        this.straße = straße;
        this.nr = nr;
    }

    public Addresse(int plz, String ort, String straße, int nr) {
        this.plz = plz;
        this.ort = ort;
        this.straße = straße;
        this.nr = nr;
    }

    public Addresse() {
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

    public String getLaenderPraefix() {
        return laenderPraefix;
    }

    public void setLaenderPraefix(String länderPräfix) {
        this.laenderPraefix = länderPräfix;
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
