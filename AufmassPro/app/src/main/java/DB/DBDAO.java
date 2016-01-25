package DB;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import android.database.SQLException;

import Kunde.Kunde;

/**
 * Created by tobia_000 on 25.01.2016.
 */
public class DBDAO {

    protected SQLiteDatabase database;
    private DBHandler dbHandler;

    public DBDAO(Context context){
        dbHandler = new DBHandler(context);
    }

    public void open() throws SQLException {
        database = dbHandler.getWritableDatabase();
    }

    public void close() {
        dbHandler.close();
    }

}
