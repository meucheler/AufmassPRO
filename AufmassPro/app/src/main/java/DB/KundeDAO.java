package DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;

import java.util.ArrayList;

import Kunde.Kunde;
import Kunde.Ansprechperson;
import Utils.Addresse;
import Utils.Bankdaten;
import Utils.Kontaktdaten;

/**
 * Created by tobia_000 on 25.01.2016.
 */
public class KundeDAO extends DBDAO{

    private static final String WHERE_ID_EQUALS = DBHandler.KU_COLUMN_KUNDEN_NR;

    public KundeDAO(Context context){
        super(context);
    }

    public long saveKunde(Kunde kunde){
        Ansprechperson ansprechperson = kunde.getAnsprechperson();
        Bankdaten bankdaten = kunde.getBankdaten();
        Addresse addresse = kunde.getAddresse();
        Kontaktdaten kontaktdaten = kunde.getKontaktdaten();
        ContentValues values = new ContentValues();

        values.put(DBHandler.KU_COLUMN_KUNDEN_NR, kunde.getKundenNr());
        values.put(DBHandler.KU_COLUMN_NACHNAME, ansprechperson.getNachname());
        values.put(DBHandler.KU_COLUMN_VORNAME, ansprechperson.getVorname());
        values.put(DBHandler.KU_COLUMN_TITEL, ansprechperson.getTitel());
        values.put(DBHandler.KU_COLUMN_USTID, kunde.getUstID());
        values.put(DBHandler.KU_COLUMN_ZUSATZDATEN, kunde.getZusatzDaten());
        values.put(DBHandler.KU_FK_COLUMN_BANKDATEN, bankdaten.getIban());
        values.put(DBHandler.KU_FK_COLUMN_ADRESSE, addresse.getId());
        values.put(DBHandler.KU_FK_COLUMN_KONTAKTDATEN, kontaktdaten.getId());

        return database.insert(DBHandler.TABLE_KUNDE, null, values);
    }

    public ArrayList<Kunde> getKunde() {
        ArrayList<Kunde> kunden = new ArrayList<Kunde>();

        Cursor cursor = database.query(DBHandler.TABLE_KUNDE,
                new String[] {DBHandler.KU_COLUMN_KUNDEN_NR,
                        DBHandler.KU_COLUMN_NACHNAME,
                        DBHandler.KU_COLUMN_VORNAME,
                        DBHandler.KU_COLUMN_TITEL,
                        DBHandler.KU_COLUMN_USTID,
                        DBHandler.KU_COLUMN_ZUSATZDATEN,
                        DBHandler.KU_FK_COLUMN_ADRESSE,
                        DBHandler.KU_FK_COLUMN_BANKDATEN,
                        DBHandler.KU_FK_COLUMN_KONTAKTDATEN
                }, null, null, null, null, null, null);
        while (cursor.moveToNext()) {
            Kunde kunde = new Kunde();
            Bankdaten bankdaten = new Bankdaten();
            Ansprechperson ansprechperson = new Ansprechperson();
            Addresse addresse = new Addresse();
            Kontaktdaten kontaktdaten = new Kontaktdaten();

            kunde.setKundenNr(cursor.getInt(0));
            ansprechperson.setNachname(cursor.getString(1));
            ansprechperson.setVorname(cursor.getString(2));
            ansprechperson.setTitel(cursor.getString(3));
            kunde.setUstID(cursor.getString(4));
            kunde.setZusatzDaten(cursor.getString(5));
            addresse.setId(cursor.getInt(6));
            bankdaten.setIban(cursor.getString(7));
            kontaktdaten.setId(cursor.getInt(8));

            kunde.setAddresse(addresse);
            kunde.setAnsprechperson(ansprechperson);
            kunde.setBankdaten(bankdaten);
            kunde.setKontaktdaten(kontaktdaten);

            kunden.add(kunde);
        }
        return kunden;
    }

    public long update(Kunde kunde) {
        ContentValues values = new ContentValues();
        Addresse addresse = kunde.getAddresse();
        Bankdaten bankdaten = kunde.getBankdaten();
        Kontaktdaten kontaktdaten = kunde.getKontaktdaten();
        Ansprechperson ansprechperson = kunde.getAnsprechperson();

        values.put(DBHandler.KU_COLUMN_KUNDEN_NR, kunde.getKundenNr());
        values.put(DBHandler.KU_COLUMN_USTID, kunde.getUstID());
        values.put(DBHandler.KU_COLUMN_ZUSATZDATEN, kunde.getZusatzDaten());
        values.put(DBHandler.KU_FK_COLUMN_BANKDATEN, bankdaten.getIban());
        values.put(DBHandler.KU_FK_COLUMN_KONTAKTDATEN, kontaktdaten.getId());
        values.put(DBHandler.KU_COLUMN_NACHNAME, ansprechperson.getNachname());
        values.put(DBHandler.KU_COLUMN_VORNAME, ansprechperson.getVorname());
        values.put(DBHandler.KU_COLUMN_TITEL, ansprechperson.getTitel());

        long result = database.update(DBHandler.TABLE_KUNDE, values,
                WHERE_ID_EQUALS, new String[] {String.valueOf(kunde.getKundenNr())});
        Log.d("Update Result:", "=" + result);
        return result;
    }

    public int delete(Kunde kunde) {
        return database.delete(DBHandler.TABLE_KUNDE, WHERE_ID_EQUALS, new String[] {kunde.getKundenNr() + ""});
    }
}
