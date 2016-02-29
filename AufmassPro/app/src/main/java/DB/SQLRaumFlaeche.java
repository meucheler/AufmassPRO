package DB;

/**
 * Created by tobia_000 on 08.02.2016.
 */
public class SQLRaumFlaeche {

    public static final String SQL_DROP = "DROP TABLE IF EXISTS " + DBHandler.NORM_TABLE_RAUM_FLAECHE;
    public static final String SQL_CREATE = "create table " + DBHandler.NORM_TABLE_RAUM_FLAECHE
            + "(" + DBHandler.NORM_RF_COLUMN_RAUM_FLAECHE_FA + " number(10) primary key, "
            + DBHandler.NORM_RF_COLUMN_RA_ID + " number(10), " + DBHandler.NORM_RF_COLUMN_FA_ID + " number(10), "
            + "FOREIGN KEY (" + DBHandler.NORM_RF_COLUMN_RA_ID + ") REFERENCES " + DBHandler.TABLE_RAUM + "(" + DBHandler.RA_COLUMN_ID + ")"
            + "FOREIGN KEY (" + DBHandler.NORM_RF_COLUMN_FA_ID + ") REFERENCES " + DBHandler.TABLE_FLAECHE + "("+ DBHandler.RA_COLUMN_ID + "));";

    public static final String SMT_DELETE = "DELETE FROM " + DBHandler.NORM_TABLE_RAUM_FLAECHE;
    public static final String SMT_INSERT =
            "INSERT INTO " + DBHandler.NORM_TABLE_RAUM_FLAECHE + "(" + DBHandler.NORM_RF_COLUMN_RAUM_FLAECHE_FA + ", " + DBHandler.NORM_RF_COLUMN_RA_ID + ", "
            + DBHandler.NORM_RF_COLUMN_FA_ID + ")"
            + "VALUES (?,?,?)";
}
