package DB;

/**
 * Created by tobia_000 on 01.02.2016.
 */
public class SQLAdresse {

    public static final String SQL_DROP = "DROP TABLE IF EXISTS " + DBHandler.TABLE_ADRESSE;
    public static final String SQL_CREATE = "create table " + DBHandler.TABLE_ADRESSE
            + "(" + DBHandler.AD_COLUMN_ID + " number(10) primary key, " + DBHandler.AD_COLUMN_PLZ + " number(25), "
            + DBHandler.AD_COLUMN_ORT + " varchar(25), " + DBHandler.AD_COLUMN_LAND + " varchar(2), "
            + DBHandler.AD_COLUMN_STRASSE + " varchar(25), " + DBHandler.AD_COLUMN_NR + " varchar(5)" + ");";

    public static final String SMT_DELETE = "DELETE FROM " + DBHandler.TABLE_ADRESSE;
    public static final String SMT_INSERT =
            "INSERT INTO " + DBHandler.TABLE_ADRESSE  + "(" + DBHandler.AD_COLUMN_ID + ", " + DBHandler.AD_COLUMN_PLZ + ", "
            + DBHandler.AD_COLUMN_ORT + ", " + DBHandler.AD_COLUMN_LAND + "," + DBHandler.AD_COLUMN_STRASSE + ", " + DBHandler.AD_COLUMN_NR + ")"
            + "VALUES (?,?,?,?,?,?)";

}
