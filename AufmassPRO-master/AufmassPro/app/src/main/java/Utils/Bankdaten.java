package Utils;

/**
 * Created by htl-ds-win7profNx64 on 14.12.2015.
 */
public class Bankdaten {
    String bankname;
    int blz;
    String bic;
    String iban;
    String kto;

    @Override
    public String toString() {
        return "Bankdaten{" +
                "bankname='" + bankname + '\'' +
                ", blz=" + blz +
                ", bic='" + bic + '\'' +
                ", iban='" + iban + '\'' +
                ", kto='" + kto + '\'' +
                '}';
    }

    public Bankdaten() {
    }

    public Bankdaten(String bankname, int blz, String bic, String iban, String kto) {
        this.bankname = bankname;
        this.blz = blz;
        this.bic = bic;
        this.iban = iban;
        this.kto = kto;
    }



    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public int getBlz() {
        return blz;
    }

    public void setBlz(int blz) {
        this.blz = blz;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getKto() {
        return kto;
    }

    public void setKto(String kto) {
        this.kto = kto;
    }
}
