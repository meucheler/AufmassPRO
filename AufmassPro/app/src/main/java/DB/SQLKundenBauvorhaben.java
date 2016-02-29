package DB;

/**
 * Created by tobia_000 on 01.02.2016.
 */
public class SQLKundenBauvorhaben {

    public static final String SQL_DROP = "DROP TABLE IF EXISTS " + DBHandler.NORM_TABLE_KUNDEN_BAUVORHABEN;
    public static final String SQL_CREATE = "create table " + DBHandler.NORM_TABLE_KUNDEN_BAUVORHABEN
            + "(" + DBHandler.NORM_KI_COLUMN_KD_BV + " varchar(50), "
            + DBHandler.NORM_KI_COLUMN_KDNR + " number(10), "
            + DBHandler.NORM_KI_COLUMN_BVID + " number(10), "
            + " FOREIGN KEY (" + DBHandler.NORM_KI_COLUMN_KDNR + ") REFERENCES " + DBHandler.TABLE_KUNDE + "(" + DBHandler.KA_COLUMN_ID + "), "
            + " FOREIGN KEY (" + DBHandler.NORM_KI_COLUMN_BVID + ") REFERENCES " + DBHandler.TABLE_BAUVORHABEN + "(" + DBHandler.BV_COLUMN_ID + "));";

    public static final String SMT_DELETE = "DELETE FROM " + DBHandler.NORM_TABLE_KUNDEN_BAUVORHABEN;
    public static final String SMT_INSERT =
            "INSERT INTO " + DBHandler.NORM_TABLE_KUNDEN_BAUVORHABEN + "(" + DBHandler.NORM_KI_COLUMN_KD_BV + ", "
            + DBHandler.NORM_KI_COLUMN_KDNR + ", " + DBHandler.NORM_KI_COLUMN_BVID + ")"
            + "VALUES (?,?,?)";
}
