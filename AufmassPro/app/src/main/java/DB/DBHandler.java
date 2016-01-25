package DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by tobia_000 on 11.01.2016.
 */
public class DBHandler extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "aufmasspro.db";
    private static final int DATABASE_VERSION = 1;

    //FOREIGN KEYS SIND NOCH NICHT VORHANDEN!!!!!!!!!!
    //Table Names
    private static final String TABLE_BENUTZERINFO = "Benutzerinfo";
    private static final String TABLE_KUNDE = "Kunde";
    private static final String TABLE_ADRESSE = "Adresse";
    private static final String TABLE_BANKDATEN = "Bankdaten";
    private static final String TABLE_KONTAKTDATEN = "Kontaktdaten";
    private static final String TABLE_BAUVORHABEN = "Bauvorhaben";
    private static final String TABLE_IMMOBILIE = "Immobilie";
    private static final String TABLE_RAUM = "Raum";

    //"Normalisierte" Tables
    private static final String NORM_TABLE_KUNDEN_IMMOBILIE = "Kunden Immobilie";
    private static final String NORM_TABLE_IMMOBILIE_RAUM = "Immobilie Raum";

    //Columns Benutzerinfo
    private static final String BI_COLUMN_FIRMENNAME = "Firmenname";
    private static final String BI_COLUMN_VORNAME = "Vorname";
    private static final String BI_COLUMN_NACHNAME = "Nachname";
    private static final String BI_COLUMN_FIRMENBUCHGERICHT = "Firmenbuchgericht";
    private static final String BI_COLUMN_UIDNR = "UIDNr";
    private static final String BI_COLUMN_FIRMENBUCHNR = "Firmenbuchnr.";
    private static final String BI_COLUMN_DVNR = "DVRNr";
    private static final String BI_COLUMN_GERICHTSSTAND = "Gerichtsstand";
    private static final String BI_COLUMN_FESTNETZNR = "Festnetznr.";
    private static final String BI_FK_COLUMN_ADRESSE = "Adresse ID";
    private static final String BI_FK_COLUMN_KONTAKTDATEN = "Kontakt ID";
    private static final String BI_FK_COLUMN_BANKDATEN = "Bankdaten ID";

    //Columns Kunde
    private static final String KU_COLUMN_KUNDEN_NR = "KdNr";
    private static final String KU_COLUMN_VORNAME = "Vorname";
    private static final String KU_COLUMN_NACHNAME = "Nachname";
    private static final String KU_COLUMN_TITEL = "Titel";
    private static final String KU_COLUMN_USTID = "UstID";
    private static final String KU_COLUMN_ZUSATZDATEN = "Zusatzdaten";
    private static final String KU_FK_COLUMN_ADRESSE = "Adresse";
    private static final String KU_FK_COLUMN_KONTAKTDATEN = "Kontakt ID";
    private static final String KU_FK_COLUMN_BANKDATEN = "Bankdaten ID";

    //Columns Bauvorhaben
    private static final String BV_COLUMN_ID = "ID";
    private static final String BV_COLUMN_KDNR = "KdNr";
    private static final String BV_COLUMN_BESCHREIBUNG = "Beschreibung";
    private static final String BV_COLUMN_NAME = "Name";
    private static final String BV_COLUMN_ART = "Art";
    private static final String BV_FK_COLUMN_IMMOBILIE = "KdNr + ImmoID";

    //Columns Immobilie
    private static final String IM_COLUMN_ID = "ID";
    private static final String IM_FK_COLUMN_RAUM = "ImmoID + RaumID";

    //Columns Raum
    private static final String RA_COLUMN_ID = "ID";
    private static final String RA_COLUMN_NAME = "Name";
    private static final String RA_COLUMN_BEMERKUNG = "Bemerkung";
    private static final String RA_COLUMN_FLAECHE = "Gesamt Flaeche";

    //Columns Adresse
    private static final String AD_COLUMN_ID = "ID";
    private static final String AD_COLUMN_PLZ = "PLZ";
    private static final String AD_COLUMN_ORT = "Ort";
    private static final String AD_COLUMN_LAND = "Land";
    private static final String AD_COLUMN_STRASSE = "Strasse";
    private static final String AD_COLUMN_NR = "Nr";

    //Columns Bankdaten
    private static final String BA_COLUMN_IBAN = "IBAN";
    private static final String BA_COLUMN_BIC = "BIC";
    private static final String BA_COLUMN_KTO = "KTO";
    private static final String BA_COLUMN_BLZ = "BLZ";
    private static final String BA_COLUMN_BANKNAME = "Bankname";

    //Columns Kontakdaten
    private static final String KA_COLUMN_ID = "ID";
    private static final String KA_COLUMN_EMAIL = "E-Mail";
    private static final String KA_COLUMN_TELNR = "Tel.-Nr.";
    private static final String KA_COLUMN_FAX = "Fax";

    //Columns Kunden Immobilie
    private static final String NORM_KI_COLUMN_KD_IMMO = "KdNr + ImmoID";
    private static final String NORM_KI_COLUMN_KDNR = "KdNr";
    private static final String NORM_KI_COLUMN_IMMOID = "Immobilien ID";

    //Columns Immobilie Raum
    private static final String NORM_IR_COLUMN_IMMO_RAUM = "ImmoID + RaumID";
    private static final String NORM_IR_COLUMN_IMMOID = "Immobilien ID";
    private static final String NORM_IR_COLUMN_RAUMID = "Raum ID";


    //Create Statement Benutzerinfo
    private static final String CREATE_TABLE_BENUTZERINFO = "create table " + TABLE_BENUTZERINFO
            + "(" + BI_COLUMN_FIRMENNAME + " varchar(25) primary key, " + BI_COLUMN_VORNAME + " varchar(25), "
            + BI_COLUMN_NACHNAME + " varchar(25), " + BI_COLUMN_FIRMENBUCHGERICHT + " varchar(25), "
            + BI_COLUMN_UIDNR + " varchar(25), " + BI_COLUMN_FIRMENBUCHNR + " varchar(25), "
            + BI_COLUMN_DVNR + " number(10), " + BI_COLUMN_GERICHTSSTAND + " varchar(25), "
            + BI_COLUMN_FESTNETZNR + " number(12), "
            + " FOREIGN KEY ("+ BI_FK_COLUMN_ADRESSE + ") REFERENCES " + TABLE_ADRESSE + "(" + AD_COLUMN_ID +  "), "
            + " FOREIGN KEY (" + BI_FK_COLUMN_KONTAKTDATEN + ") REFERENCES " + TABLE_KONTAKTDATEN + "(" + KA_COLUMN_ID + "), "
            + " FOREIGN KEY (" + BI_FK_COLUMN_BANKDATEN  + ") REFERNCES " + TABLE_BANKDATEN + "(" + BA_COLUMN_IBAN + "));";

    //Create Kunde
    private static final String CREATE_TABLE_KUNDE = "create table " + TABLE_KUNDE
            + "(" + KU_COLUMN_KUNDEN_NR + " number(10) primary key, " + KU_COLUMN_TITEL + " varchar(10), "
            + KU_COLUMN_VORNAME + " varchar(25), " + KU_COLUMN_NACHNAME + " varchar(25), "
            + KU_COLUMN_USTID + " number(10), " + KU_COLUMN_ZUSATZDATEN + " varchar(100), "
            + " FOREIGN KEY (" + KU_FK_COLUMN_ADRESSE + ") REFERENCES " + TABLE_ADRESSE + "(" + AD_COLUMN_ID + "), "
            + " FOREIGN KEY (" + KU_FK_COLUMN_KONTAKTDATEN + ") REFERENCES " + TABLE_KONTAKTDATEN + "(" + KA_COLUMN_ID + "), "
            + " FOREIGN KEY (" + KU_FK_COLUMN_BANKDATEN + ") REFERENCES " + TABLE_BANKDATEN + "(" +BA_COLUMN_IBAN + "));";


    //Create Statement Bauvorhaben
    private static String CREATE_TABLE_BAUVORHABEN = "create table " + TABLE_BAUVORHABEN
            + "(" + BV_COLUMN_ID + " number(10) primary key, " + BV_COLUMN_NAME + " varchar(25), "
            + BV_COLUMN_BESCHREIBUNG + " varchar(25), " + BV_COLUMN_ART + " varchr(25), "
            + BV_COLUMN_KDNR + " number(10), "
            + " FOREIGN KEY (" + BV_FK_COLUMN_IMMOBILIE + ") REFERENCES " + NORM_TABLE_KUNDEN_IMMOBILIE + "(" + NORM_KI_COLUMN_KD_IMMO + "));";

    //Create Statement Immobilie
    private static String CREATE_TABLE_IMMOBILIE = "create table " + TABLE_IMMOBILIE
            + "(" + IM_COLUMN_ID + " number(10) primary key, "
            + " FOREIGN KEY (" + IM_FK_COLUMN_RAUM + ") REFERNCES " + NORM_TABLE_IMMOBILIE_RAUM + "(" + NORM_IR_COLUMN_IMMO_RAUM + "));" ;

    //Create Statement Raum
    private static String CREATE_TABLE_RAUM = "create table " +TABLE_RAUM
            + "(" + RA_COLUMN_ID + " number(10) primary key, " + RA_COLUMN_NAME + " varchar(25), "
            + RA_COLUMN_BEMERKUNG + " varchar(25), " + RA_COLUMN_FLAECHE + " number(10)" + ");";

    //Create Statement Adresse
    private static String CREATE_TABLE_ADRESSE = "create table " + TABLE_ADRESSE
            + "(" + AD_COLUMN_ID + " number(10) primary key, " + AD_COLUMN_PLZ + " number(25), "
            + AD_COLUMN_ORT + " varchar(25), " + AD_COLUMN_LAND + " varchar(2), "
            + AD_COLUMN_STRASSE + " varchar(25), " + AD_COLUMN_NR + " varchar(5)" + ");";

    //Create Statement Bankdaten
    private static final String CREATE_TABLE_BANKDATEN = "create table " + TABLE_BANKDATEN
            + "(" + BA_COLUMN_IBAN + " varchar(24) primary key, " + BA_COLUMN_BIC + " varchar(15), "
            + BA_COLUMN_KTO + " varchar(20), " + BA_COLUMN_BLZ + " number(5), "
            + BA_COLUMN_BANKNAME + " varchar(30)" + ");";

    //Create Statement Kontakdaten
    private static String CREATE_TABLE_KONTAKDATEN = "create table " + TABLE_KONTAKTDATEN
            + "(" + KA_COLUMN_ID + " number(10) primary key, " + KA_COLUMN_TELNR + " number(12), "
            + KA_COLUMN_EMAIL + " varchar(30), " + KA_COLUMN_FAX + " varchar(30)" + ");";


    //Create Statement für normalisierte Kunden Immobilie
    private static final String CREATE_TABLE_KUNDE_IMMOBILIE = "create table " + NORM_TABLE_KUNDEN_IMMOBILIE
            + "(" + NORM_KI_COLUMN_KD_IMMO + " varchar(50), "
            + " FOREIGN KEY (" + NORM_KI_COLUMN_KDNR + ") REFERNCES " + TABLE_KUNDE + "(" + KA_COLUMN_ID + "), "
            + " FOREIGN KEY (" + NORM_KI_COLUMN_IMMOID + ") REFERNCES " + TABLE_IMMOBILIE + "(" + IM_COLUMN_ID + "));";

    //Create Statement für normalisierte Immobilie Raum
    private static String CREATE_TABLE_IMMOBILIE_RAUM = "create table " + NORM_TABLE_IMMOBILIE_RAUM
            + "(" + NORM_IR_COLUMN_IMMO_RAUM + " varchar(50), "
            + " FOREIGN KEY (" + NORM_IR_COLUMN_IMMOID + ") REFERENCES " + TABLE_IMMOBILIE + "(" + IM_COLUMN_ID + "), "
            + " FOREIGN KEY (" + NORM_IR_COLUMN_RAUMID + ") REFERENCES " + TABLE_RAUM + "(" + RA_COLUMN_ID + "));";

    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Die Datenbank wird mit den oben angelegten Tables erzeugt
        db.execSQL(CREATE_TABLE_BENUTZERINFO);
        db.execSQL(CREATE_TABLE_KUNDE);
        db.execSQL(CREATE_TABLE_BAUVORHABEN);
        db.execSQL(CREATE_TABLE_IMMOBILIE);
        db.execSQL(CREATE_TABLE_RAUM);
        db.execSQL(CREATE_TABLE_ADRESSE);
        db.execSQL(CREATE_TABLE_KONTAKDATEN);
        db.execSQL(CREATE_TABLE_BANKDATEN);
        db.execSQL(CREATE_TABLE_KUNDE_IMMOBILIE);
        db.execSQL(CREATE_TABLE_IMMOBILIE_RAUM);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Die Tables werden gedroped
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_BANKDATEN);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_RAUM);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_IMMOBILIE);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_KONTAKTDATEN);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ADRESSE);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_KUNDE);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_BAUVORHABEN);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_BENUTZERINFO);
        db.execSQL("DROP TABLE IF EXISTS " + NORM_TABLE_KUNDEN_IMMOBILIE);
        db.execSQL("DROP TABLE IF EXISTS " + NORM_TABLE_IMMOBILIE_RAUM);

        //Die Tables werden wieder angelegt
        onCreate(db);
    }
}
