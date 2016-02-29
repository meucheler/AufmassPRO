package DB;

/**
 * Created by tobia_000 on 01.02.2016.
 */
public class SQLImmobilie {

    public static final String SQL_DROP = "DROP TABLE IF EXISTS " + DBHandler.TABLE_IMMOBILIE;
    public static final String SQL_CREATE = "create table " + DBHandler.TABLE_IMMOBILIE
            + "(" + DBHandler.IM_COLUMN_ID + " number(10) primary key, "
            + DBHandler.IM_FK_COLUMN_RAUM + " varchar(40));";

    public static final String SMT_DELETE = "DELETE FROM " + DBHandler.TABLE_IMMOBILIE;
    public static final String SMT_INSERT =
            "INSERT INTO " + DBHandler.TABLE_IMMOBILIE + "(" + DBHandler.IM_COLUMN_ID + ", " + DBHandler.IM_FK_COLUMN_RAUM + ")"
            + "VALUES (?,?)";
}
