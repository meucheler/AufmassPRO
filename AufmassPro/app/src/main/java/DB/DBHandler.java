package DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by tobia_000 on 11.01.2016.
 */
public class DBHandler extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "aufmasspro.db";
    private static final int DATABASE_VERSION = 2;

    //OnUpgrade sollte nochmal angesehen werden!!!!
    //Table Names
    static final String TABLE_BENUTZERINFO = "Benutzerinfo";
    static final String TABLE_KUNDE = "Kunde";
    static final String TABLE_ADRESSE = "Adresse";
    static final String TABLE_BANKDATEN = "Bankdaten";
    static final String TABLE_KONTAKTDATEN = "Kontaktdaten";
    static final String TABLE_BAUVORHABEN = "Bauvorhaben";
    static final String TABLE_IMMOBILIE = "Immobilie";
    static final String TABLE_RAUM = "Raum";
    static final String TABLE_FLAECHE = "Flaeche";

    //"Normalisierte" Tables
    static final String NORM_TABLE_KUNDEN_BAUVORHABEN = "Kunden_Bauvorhaben";
    static final String NORM_TABLE_IMMOBILIE_RAUM = "Immobilie_Raum";
    static final String NORM_TABLE_RAUM_FLAECHE = "Raum_Flaeche";
    static final String NORM_TABLE_BAUVORHABEN_IMMOBILIE = "Bauvorhaben_Immoblilien";

    //Columns Benutzerinfo
    static final String BI_COLUMN_FIRMENNAME = "Firmenname";
    static final String BI_COLUMN_VORNAME = "Vorname";
    static final String BI_COLUMN_NACHNAME = "Nachname";
    static final String BI_COLUMN_FIRMENBUCHGERICHT = "Firmenbuchgericht";
    static final String BI_COLUMN_UIDNR = "UIDNr";
    static final String BI_COLUMN_FIRMENBUCHNR = "Firmenbuchnr";
    static final String BI_COLUMN_DVNR = "DVRNr";
    static final String BI_COLUMN_GERICHTSSTAND = "Gerichtsstand";
    static final String BI_COLUMN_FESTNETZNR = "Festnetznr";
    static final String BI_FK_COLUMN_ADRESSE = "Adresse_ID";
    static final String BI_FK_COLUMN_KONTAKTDATEN = "Kontakt_ID";
    static final String BI_FK_COLUMN_BANKDATEN = "Bankdaten_ID";

    //Columns Kunde
    static final String KU_COLUMN_KUNDEN_NR = "KdNr";
    static final String KU_COLUMN_VORNAME = "Vorname";
    static final String KU_COLUMN_NACHNAME = "Nachname";
    static final String KU_COLUMN_TITEL = "Titel";
    static final String KU_COLUMN_USTID = "UstID";
    static final String KU_COLUMN_ZUSATZDATEN = "Zusatzdaten";
    static final String KU_FK_COLUMN_ADRESSE = "Adresse_ID";
    static final String KU_FK_COLUMN_KONTAKTDATEN = "Kontakt_ID";
    static final String KU_FK_COLUMN_BANKDATEN = "Bankdaten_ID";

    //Columns Bauvorhaben
    static final String BV_COLUMN_ID = "ID";
    static final String BV_COLUMN_KDNR = "KdNr";
    static final String BV_COLUMN_BESCHREIBUNG = "Beschreibung";
    static final String BV_COLUMN_NAME = "Name";
    static final String BV_COLUMN_ART = "Art";
    static final String BV_FK_COLUMN_IMMOBILIE = "BauvorhabnID_ImmobilienID";

    //Columns Immobilie
    static final String IM_COLUMN_ID = "ID";
    static final String IM_FK_COLUMN_RAUM = "ImmoID_RaumID";

    //Columns Raum
    static final String RA_COLUMN_ID = "ID";
    static final String RA_COLUMN_NAME = "Name";
    static final String RA_COLUMN_BEMERKUNG = "Bemerkung";

    //Columns Flaeche
    static final String FA_COLUMND_ID = "ID";
    static final String FA_COLUMN_A = "A";
    static final String FA_COLUMN_B = "B";
    static final String FA_COLUMN_TYP = "Typ";

    //Columns Adresse
    static final String AD_COLUMN_ID = "ID";
    static final String AD_COLUMN_PLZ = "PLZ";
    static final String AD_COLUMN_ORT = "Ort";
    static final String AD_COLUMN_LAND = "Land";
    static final String AD_COLUMN_STRASSE = "Strasse";
    static final String AD_COLUMN_NR = "Nr";

    //Columns Bankdaten
    static final String BA_COLUMN_IBAN = "IBAN";
    static final String BA_COLUMN_BIC = "BIC";
    static final String BA_COLUMN_KTO = "KTO";
    static final String BA_COLUMN_BLZ = "BLZ";
    static final String BA_COLUMN_BANKNAME = "Bankname";

    //Columns Kontakdaten
    static final String KA_COLUMN_ID = "ID";
    static final String KA_COLUMN_EMAIL = "E_Mail";
    static final String KA_COLUMN_TELNR = "Tel_Nr";
    static final String KA_COLUMN_FAX = "Fax";

    //Columns Kunden Bauvorhaben
    static final String NORM_KI_COLUMN_KD_BV = "KdNr_BVID";
    static final String NORM_KI_COLUMN_KDNR = "KdNr";
    static final String NORM_KI_COLUMN_BVID = "BV_ID";

    //Columns Immobilie Raum
    static final String NORM_IR_COLUMN_IMMO_RAUM = "ImmoID_RaumID";
    static final String NORM_IR_COLUMN_IMMOID = "Immobilien_ID";
    static final String NORM_IR_COLUMN_RAUMID = "Raum_ID";

    //Columns Raum Flaeche
    static final String NORM_RF_COLUMN_RAUM_FLAECHE_FA = "RaumID_FlaecheID";
    static final String NORM_RF_COLUMN_RA_ID = "RaumID";
    static final String NORM_RF_COLUMN_FA_ID = "FlaecheID";

    //Columns Bauvorhaben Immobilie
    static final String NORM_BVIM_COLUMN_BAU_IMMO = "BauvorhabenID_ImmobilienID";
    static final String NORM_BVIM_COLUMN_BVID = "BauvorhabenID";
    static final String NORM_BVIM_COLUMN_IMMOID = "ImmobilienID";

    /**
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
    */

    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Die Datenbank wird mit den oben angelegten Tables erzeugt
        db.execSQL(SQLAdresse.SQL_CREATE);
        db.execSQL(SQLKontaktdaten.SQL_CREATE);
        db.execSQL(SQLBankdaten.SQL_CREATE);
        db.execSQL(SQLKunde.SQL_CREATE);
        db.execSQL(SQLImmobilie.SQL_CREATE);
        db.execSQL(SQLRaum.SQL_CREATE);
        db.execSQL(SQLFlaeche.SQL_CREATE);
        db.execSQL(SQLRaumFlaeche.SQL_CREATE);
        db.execSQL(SQLBauvorhaben.SQL_CREATE);
        db.execSQL(SQLBauvorhabenImmobilien.SQL_CREATE);
        db.execSQL(SQLKundenBauvorhaben.SQL_CREATE);
        db.execSQL(SQLImmobilieRaum.SQL_CREATE);
        db.execSQL(SQLBenutzerinfo.SQL_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Die Tables werden gedroped
        db.execSQL(SQLBenutzerinfo.SQL_DROP);
        db.execSQL(SQLImmobilieRaum.SQL_DROP);
        db.execSQL(SQLKundenBauvorhaben.SQL_DROP);
        db.execSQL(SQLBauvorhabenImmobilien.SQL_DROP);
        db.execSQL(SQLBauvorhaben.SQL_DROP);
        db.execSQL(SQLRaumFlaeche.SQL_DROP);
        db.execSQL(SQLFlaeche.SQL_DROP);
        db.execSQL(SQLRaum.SQL_DROP);
        db.execSQL(SQLImmobilie.SQL_DROP);
        db.execSQL(SQLKunde.SQL_DROP);
        db.execSQL(SQLBankdaten.SQL_DROP);
        db.execSQL(SQLKontaktdaten.SQL_DROP);
        db.execSQL(SQLAdresse.SQL_DROP);

        //Die Tables werden wieder angelegt
        onCreate(db);
    }
}
