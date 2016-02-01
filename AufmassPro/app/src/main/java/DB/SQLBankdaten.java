package DB;

/**
 * Created by tobia_000 on 01.02.2016.
 */
public class SQLBankdaten {

    public static final String SQL_DROP = "DROP TABLE IF EXISTS " + DBHandler.TABLE_BANKDATEN;
    public static final String SQL_CREATE = "create table " + DBHandler.TABLE_BANKDATEN
            + "(" + DBHandler.BA_COLUMN_IBAN + " varchar(24) primary key, " + DBHandler.BA_COLUMN_BIC + " varchar(15), "
            + DBHandler.BA_COLUMN_KTO + " varchar(20), " + DBHandler.BA_COLUMN_BLZ + " number(5), "
            + DBHandler.BA_COLUMN_BANKNAME + " varchar(30)" + ");";

    public static final String SMT_DELETE = "DELETE FROM " + DBHandler.TABLE_BANKDATEN;
    public static final String SMT_INSERT =
            "INSERT INTO " + DBHandler.TABLE_BANKDATEN + "(" + DBHandler.BA_COLUMN_IBAN + ", " + DBHandler.BA_COLUMN_BIC + ", "
            + DBHandler.BA_COLUMN_KTO + ", " + DBHandler.BA_COLUMN_BLZ + ", " + DBHandler.BA_COLUMN_BANKNAME + ")"
            + "VALUES (?,?,?,?,?)";
}
