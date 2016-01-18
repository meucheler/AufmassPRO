package Utils;

/**
 * Created by htl-ds-win7profNx64 on 14.12.2015.
 */
public class Addresse {
    int id;
    int plz;
    String ort;
    String laenderPraefix;
    String straße;
    String nr;

    @Override
    public String toString() {
        return straße+" "+nr+" "+plz+" "+ ort+" "+ laenderPraefix;
    }

    public Addresse(int id, int plz, String ort, String laenderPraefix, String straße, String nr) {
        this.id = id;
        this.plz = plz;
        this.ort = ort;
        this.laenderPraefix = laenderPraefix;
        this.straße = straße;
        this.nr = nr;
    }

    public Addresse(int plz, String ort, String straße, String nr) {
        this.plz = plz;
        this.ort = ort;
        this.straße = straße;
        this.nr = nr;
    }

    public Addresse() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }
}
