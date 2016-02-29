package DB;

/**
 * Created by tobia_000 on 25.01.2016.
 */
public class SQLKunde {

    public static final String SQL_DROP = "DROP TABLE IF EXISTS " + DBHandler.TABLE_KUNDE;
    public static final String SQL_CREATE = "create table " + DBHandler.TABLE_KUNDE
            + "(" + DBHandler.KU_COLUMN_KUNDEN_NR + " number(10) primary key, " + DBHandler.KU_COLUMN_TITEL + " varchar(10), "
            + DBHandler.KU_COLUMN_VORNAME + " varchar(25), " + DBHandler.KU_COLUMN_NACHNAME + " varchar(25), "
            + DBHandler.KU_COLUMN_USTID + " number(10), " + DBHandler.KU_COLUMN_ZUSATZDATEN + " varchar(100), "
            + DBHandler.KU_FK_COLUMN_ADRESSE + " number(10), "
            + DBHandler.KU_FK_COLUMN_KONTAKTDATEN + " number(10), "
            + DBHandler.KU_FK_COLUMN_BANKDATEN + " varchar(24), "
            + " FOREIGN KEY (" + DBHandler.KU_FK_COLUMN_ADRESSE + ") REFERENCES " + DBHandler.TABLE_ADRESSE + "(" + DBHandler.AD_COLUMN_ID + "), "
            + " FOREIGN KEY (" + DBHandler.KU_FK_COLUMN_KONTAKTDATEN + ") REFERENCES " + DBHandler.TABLE_KONTAKTDATEN + "(" + DBHandler.KA_COLUMN_ID + "), "
            + " FOREIGN KEY (" + DBHandler.KU_FK_COLUMN_BANKDATEN + ") REFERENCES " + DBHandler.TABLE_BANKDATEN + "(" + DBHandler.BA_COLUMN_IBAN + "));";

    public static final String SMT_DELETE = "DELETE FROM " + DBHandler.TABLE_KUNDE;
    public static final String SMT_INSERT =
            "INSERT INTO " + DBHandler.TABLE_KUNDE + "(" + DBHandler.KU_COLUMN_KUNDEN_NR +", " + DBHandler.KU_COLUMN_NACHNAME + ", "
                    + DBHandler.KU_COLUMN_VORNAME + ", " + DBHandler.KU_COLUMN_TITEL + ", " + DBHandler.KU_COLUMN_USTID + ", "
                    + DBHandler.KU_FK_COLUMN_ADRESSE + ", " + DBHandler.KU_FK_COLUMN_BANKDATEN + ", " + DBHandler.KU_FK_COLUMN_KONTAKTDATEN + ", "
                    + DBHandler.KU_COLUMN_ZUSATZDATEN + ")" +
                    "Values (?,?,?,?,?,?,?,?,?)";
}
