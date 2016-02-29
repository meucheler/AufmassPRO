package DB;

/**
 * Created by tobia_000 on 01.02.2016.
 */
public class SQLBauvorhaben {

    public static final String SQL_DROP = "DROP TABLE IF EXISTS " + DBHandler.TABLE_BAUVORHABEN;
    public static final String SQL_CREATE = "create table " + DBHandler.TABLE_BAUVORHABEN
            + "(" + DBHandler.BV_COLUMN_ID + " number(10) primary key, " + DBHandler.BV_COLUMN_NAME + " varchar(25), "
            + DBHandler.BV_COLUMN_BESCHREIBUNG + " varchar(25), " + DBHandler.BV_COLUMN_ART + " varchr(25), "
            + DBHandler.BV_COLUMN_KDNR + " number(10), "
            + DBHandler.BV_FK_COLUMN_IMMOBILIE + " number(10));";

    public static final String SMT_DELETE = "DELETE FROM " + DBHandler.TABLE_BAUVORHABEN;
    public static final String SMT_INSERT =
            "INSERT INTO " + DBHandler.TABLE_BAUVORHABEN + "(" + DBHandler.BV_COLUMN_ID + ", " + DBHandler.BV_COLUMN_KDNR + ", "
            + DBHandler.BV_COLUMN_BESCHREIBUNG + ", " + DBHandler.BV_COLUMN_NAME + ", " + DBHandler.BV_COLUMN_ART + ", "
            + DBHandler.BV_FK_COLUMN_IMMOBILIE + ")" +
            "VALUES (?,?,?,?,?,?)";

}
