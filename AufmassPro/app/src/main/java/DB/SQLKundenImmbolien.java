package DB;

/**
 * Created by tobia_000 on 01.02.2016.
 */
public class SQLKundenImmbolien {

    public static final String SQL_DROP = "DROP TABLE IF EXISTS " + DBHandler.NORM_TABLE_KUNDEN_IMMOBILIE;
    public static final String SQL_CREATE = "create table " + DBHandler.NORM_TABLE_KUNDEN_IMMOBILIE
            + "(" + DBHandler.NORM_KI_COLUMN_KD_IMMO + " varchar(50), "
            + " FOREIGN KEY (" + DBHandler.NORM_KI_COLUMN_KDNR + ") REFERNCES " + DBHandler.TABLE_KUNDE + "(" + DBHandler.KA_COLUMN_ID + "), "
            + " FOREIGN KEY (" + DBHandler.NORM_KI_COLUMN_IMMOID + ") REFERNCES " + DBHandler.TABLE_IMMOBILIE + "(" + DBHandler.IM_COLUMN_ID + "));";

    public static final String SMT_DELETE = "DELETE FROM " + DBHandler.NORM_TABLE_KUNDEN_IMMOBILIE;
    public static final String SMT_INSERT =
            "INSERT INTO " + DBHandler.NORM_TABLE_KUNDEN_IMMOBILIE + "(" + DBHandler.NORM_KI_COLUMN_KD_IMMO + ", "
            + DBHandler.NORM_KI_COLUMN_KDNR + ", " + DBHandler.NORM_KI_COLUMN_IMMOID + ")"
            + "VALUES (?,?,?)";
}
