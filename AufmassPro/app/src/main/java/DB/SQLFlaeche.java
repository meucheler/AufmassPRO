package DB;

/**
 * Created by tobia_000 on 08.02.2016.
 */
public class SQLFlaeche {

    public static final String SQL_DROP = "DROP TABLE IF EXISTS " + DBHandler.TABLE_FLAECHE;
    public static final String SQL_CREATE = "create table " + DBHandler.TABLE_FLAECHE
            + "(" + DBHandler.FA_COLUMND_ID + " number(10) primary key, "
            + DBHandler.FA_COLUMN_A + " number(10), " + DBHandler.FA_COLUMN_B + " number(10), "
            + DBHandler.FA_COLUMN_TYP + " varchar(25));";

    public static final String SMT_DELETE = "DELETE FROM" + DBHandler.TABLE_FLAECHE;
    public static final String SMT_INSERT =
            "INSERT INTO " + DBHandler.TABLE_FLAECHE + "(" + DBHandler.FA_COLUMND_ID + ", "
            + DBHandler.FA_COLUMN_A + ", " + DBHandler.FA_COLUMN_B + ", " + DBHandler.FA_COLUMN_TYP + ")"
            + "VALUES(?,?,?,?)";
}
