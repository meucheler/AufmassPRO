package DB;

/**
 * Created by tobia_000 on 25.01.2016.
 */
public class SQLBenutzerinfo {

    public static final String SQL_DROP = "DROP TABLE IF EXISTS " + DBHandler.TABLE_BENUTZERINFO;
    public static final String SQL_CREATE = "create table " + DBHandler.TABLE_BENUTZERINFO
            + "(" + DBHandler.BI_COLUMN_FIRMENNAME + " varchar(25) primary key, " + DBHandler.BI_COLUMN_VORNAME + " varchar(25), "
            + DBHandler.BI_COLUMN_NACHNAME + " varchar(25), " + DBHandler.BI_COLUMN_FIRMENBUCHGERICHT + " varchar(25), "
            + DBHandler.BI_COLUMN_UIDNR + " varchar(25), " + DBHandler.BI_COLUMN_FIRMENBUCHNR + " varchar(25), "
            + DBHandler.BI_COLUMN_DVNR + " number(10), " + DBHandler.BI_COLUMN_GERICHTSSTAND + " varchar(25), "
            + DBHandler.BI_COLUMN_FESTNETZNR + " number(12), "
            + DBHandler.BI_FK_COLUMN_ADRESSE + " number(10), "
            + DBHandler.BI_FK_COLUMN_KONTAKTDATEN + " number(10), "
            + DBHandler.BI_FK_COLUMN_BANKDATEN + " varchar(24), "
            + " FOREIGN KEY (" + DBHandler.BI_FK_COLUMN_ADRESSE + ") REFERENCES " + DBHandler.TABLE_ADRESSE + "(" + DBHandler.AD_COLUMN_ID +  "), "
            + " FOREIGN KEY (" + DBHandler.BI_FK_COLUMN_KONTAKTDATEN + ") REFERENCES " + DBHandler.TABLE_KONTAKTDATEN + "(" + DBHandler.KA_COLUMN_ID + "), "
            + " FOREIGN KEY (" + DBHandler.BI_FK_COLUMN_BANKDATEN  + ") REFERENCES " + DBHandler.TABLE_BANKDATEN + "(" + DBHandler.BA_COLUMN_IBAN + "));";

    public static final String SMT_DELETE = "DELETE FROM " + DBHandler.TABLE_BENUTZERINFO;
    public static final String SMT_INSERT =
            "INSERT INTO " + DBHandler.TABLE_BENUTZERINFO + "(" + DBHandler.BI_COLUMN_FIRMENNAME + ", " + DBHandler.BI_COLUMN_VORNAME + ", "
            + DBHandler.BI_COLUMN_NACHNAME + ", " + DBHandler.BI_COLUMN_FIRMENBUCHGERICHT + ", " + DBHandler.BI_COLUMN_UIDNR + ", "
            + DBHandler.BI_COLUMN_FIRMENBUCHNR + ", " + DBHandler.BI_COLUMN_DVNR + ", " + DBHandler.BI_COLUMN_GERICHTSSTAND + ", "
            + DBHandler.BI_COLUMN_FESTNETZNR + ", " + DBHandler.BI_FK_COLUMN_ADRESSE + ", " + DBHandler.BI_FK_COLUMN_KONTAKTDATEN + ", "
            + DBHandler.BI_FK_COLUMN_BANKDATEN + ")"
            + "Values(?,?,?,?,?,?,?,?,?,?,?,?)";
}
