package DB;


/**
 * Created by tobia_000 on 01.02.2016.
 */
public class SQLImmobilieRaum {

    public static final String SQL_DROP = "DROP TABLE I EXISTS " + DBHandler.NORM_TABLE_IMMOBILIE_RAUM;
    public static final String SQL_CREATE = "create table " + DBHandler.NORM_TABLE_IMMOBILIE_RAUM
            + "(" + DBHandler.NORM_IR_COLUMN_IMMO_RAUM + " varchar(50), "
            + " FOREIGN KEY (" + DBHandler.NORM_IR_COLUMN_IMMOID + ") REFERENCES " + DBHandler.TABLE_IMMOBILIE + "(" + DBHandler.IM_COLUMN_ID + "), "
            + " FOREIGN KEY (" + DBHandler.NORM_IR_COLUMN_RAUMID + ") REFERENCES " + DBHandler.TABLE_RAUM + "(" + DBHandler.RA_COLUMN_ID + "));";

    public static final String SMT_DELETE = "DELETE FROM " + DBHandler.NORM_TABLE_IMMOBILIE_RAUM;
    public static final String SMT_INSERT =
            "INSERT INTO " + DBHandler.NORM_TABLE_IMMOBILIE_RAUM + "(" + DBHandler.NORM_IR_COLUMN_IMMO_RAUM + ", "
            + DBHandler.NORM_IR_COLUMN_IMMOID + ", " + DBHandler.NORM_IR_COLUMN_RAUMID + ")"
            + "VALUES (?,?,?)";
}
