package Kunde;

/**
 * Created by htl-ds-win7profNx64 on 14.12.2015.
 */
public class Kontaktdaten {
    String eMail;
    String telNr;
    String Fax;

    public Kontaktdaten(String eMail, String telNr, String fax) {
        this.eMail = eMail;
        this.telNr = telNr;
        Fax = fax;
    }

    public Kontaktdaten() {
    }

    @Override
    public String toString() {
        return "Kontaktdaten{" +
                "eMail='" + eMail + '\'' +
                ", telNr='" + telNr + '\'' +
                ", Fax='" + Fax + '\'' +
                '}';
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTelNr() {
        return telNr;
    }

    public void setTelNr(String telNr) {
        this.telNr = telNr;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }
}
