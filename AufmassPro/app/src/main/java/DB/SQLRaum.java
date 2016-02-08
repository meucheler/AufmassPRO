package DB;

/**
 * Created by tobia_000 on 01.02.2016.
 */
public class SQLRaum {

    public static final String SQL_DROP = "DROP TABLE IF EXISTS " + DBHandler.TABLE_RAUM;
    public static final String SQL_CREATE = "create table " + DBHandler.TABLE_RAUM
            + "(" + DBHandler.RA_COLUMN_ID + " number(10) primary key, " + DBHandler.RA_COLUMN_NAME + " varchar(25), "
            + DBHandler.RA_COLUMN_BEMERKUNG + " varchar(25) " + ");";

    public static final String SMT_DELETE = "DELETE FROM " + DBHandler.TABLE_RAUM;
    public static final String SMT_INSERT =
            "INSERT INTO " + DBHandler.TABLE_RAUM + "(" + DBHandler.RA_COLUMN_ID + ", " + DBHandler.RA_COLUMN_NAME + ", "
            + DBHandler.RA_COLUMN_BEMERKUNG +  ")"
            + "VALUES (?,?,?,?)";
}
