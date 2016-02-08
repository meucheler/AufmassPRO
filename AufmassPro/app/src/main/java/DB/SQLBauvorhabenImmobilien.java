package DB;

/**
 * Created by tobia_000 on 08.02.2016.
 */
public class SQLBauvorhabenImmobilien {

    public static final String SQL_DROP = "DROP TABLE IF EXISTS " + DBHandler.NORM_TABLE_BAUVORHABEN_IMMOBILIE;
    public static final String SQL_CREATE = "create table " + DBHandler.NORM_TABLE_BAUVORHABEN_IMMOBILIE
            + "(" + DBHandler.NORM_BVIM_COLUMN_BAU_IMMO + " number(10) primary key, " + DBHandler.NORM_BVIM_COLUMN_BVID + " number(10), "
            + DBHandler.NORM_BVIM_COLUMN_IMMOID + " number(10), "
            + "FOREIGN KEY (" + DBHandler.NORM_BVIM_COLUMN_BVID + ") REFERENCES " + DBHandler.TABLE_BAUVORHABEN + "(" + DBHandler.BV_COLUMN_ID+ "), "
            + "FOREIGN KEY (" + DBHandler.NORM_BVIM_COLUMN_IMMOID + ") REFERENCES " + DBHandler.TABLE_IMMOBILIE + "(" + DBHandler.IM_COLUMN_ID + "));";

    public static final String SMT_DELETE = "DELETE FROM " + DBHandler.NORM_TABLE_BAUVORHABEN_IMMOBILIE;
    public static final String SMT_INSERT =
            "INSERT INTO " + DBHandler.NORM_TABLE_BAUVORHABEN_IMMOBILIE + "(" + DBHandler.NORM_BVIM_COLUMN_BAU_IMMO + ", "
            + DBHandler.NORM_BVIM_COLUMN_BVID +", " + DBHandler.NORM_BVIM_COLUMN_IMMOID + ")"
            + "VALUES(?,?,?)";
}
