package DB;

/**
 * Created by tobia_000 on 01.02.2016.
 */
public class SQLKontaktdaten {

    public static final String SQL_DROP = "DROP TABLE IF EXISTS " + DBHandler.TABLE_KONTAKTDATEN;
    public static final String SQL_CREATE = "create table " + DBHandler.TABLE_KONTAKTDATEN
            + "(" + DBHandler.KA_COLUMN_ID + " number(10) primary key, " + DBHandler.KA_COLUMN_TELNR + " number(12), "
            + DBHandler.KA_COLUMN_EMAIL + " varchar(30), " + DBHandler.KA_COLUMN_FAX + " varchar(30)" + ");";

    public static final String SMT_DELETE = "DELETE FROM " + DBHandler.TABLE_KONTAKTDATEN;
    public static final String SMT_INSERT =
            "INSERT TO " + "(" + DBHandler.KA_COLUMN_ID + ", " + DBHandler.KA_COLUMN_EMAIL + ", "
            + DBHandler.KA_COLUMN_TELNR + ", " + DBHandler.KA_COLUMN_FAX + ")"
            + "VALUES (?,?,?,?)";
}
