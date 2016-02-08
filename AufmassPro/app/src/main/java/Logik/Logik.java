package Logik;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.LinkedHashMap;
import java.util.LinkedList;

import Bauvorhaben.Bauvorhaben;
import DB.DBHandler;
import FirmaInfos.Firmendaten;
import Immobilie.Immobilie;
import Kunde.Ansprechperson;
import Kunde.Kunde;
import Raum.Raum;
import DB.DBDAO;
import DB.KundeDAO;
import DB.SQLKunde;

/**
 * Created by miken on 01.02.2016.
 */
public class Logik {


    /**
     * Created by miken on 18.01.2016.
     */


    public void erzeugeKunde(Kunde kunde){
        ContentValues values = new ContentValues();

     //   values.put(DBHandler.KU_COLUMN_VORNAME, kunde.getAnsprechperson().getVorname());
      //  values.put(DBHandler.KU_COLUMN_NACHNAME, kunde.getAnsprechperson().getNachname());
      //  values.put(DBHandler.KU_COLUMN_TITEL, kunde.getAnsprechperson().getTitel());
    //    values.put(DBHandler.KU_COLUMN_ZUSATZDATEN, kunde.getZusatzDaten());


       // db.insert(DBHandler.TABLE_KUNDE, null, values);
       // db.close();

    }
    public void bearbeiteKunde(Kunde k){

    }
    public void entferneKunde(int kundenNr){

    }
    //--------------------------------------------------//
    public void erzeugeBauvorhaben(int kundenNr, Bauvorhaben b){

    }
    public void bearbeiteBauvorhaben(Bauvorhaben b){

    }
    public void entferneBauvorhaben(int immoID){

    }
    //--------------------------------------------------//
    public void erzeugeImmobilie(int bauID, Immobilie imm){

    }
    public void bearbeiteImmoblilie(Immobilie imm){

    }
    public void entferneImmoblilie(int immoID){

    }
    //--------------------------------------------------//
    public void erzeugeRaum(int immoID, Raum r){

    }
    public void bearbeiteRaum(Raum r){

    }
    public void entferneRaumAufmass(int raumID){

    }
    public void bearbeiteBenutzerinfoAufmass(Firmendaten f){

    }
    //--------------------------------------------------//
    public LinkedList<Kunde> getKunde(){
        return null;
    }
    public LinkedList<Bauvorhaben> getBauvorhabenBuchhaltung(){
        return null;
    }
    public LinkedList<Immobilie> getImmobilien(){
        return null;
    }
    public LinkedList<Raum> getRäume(int immoID){
        return null;
    }
    public void bearbeiteRaum(int immoID, Raum r){

    }
    public void entferneRaum (int RaumID){

    }
    public void bearbeiteBenutzerinfo(Firmendaten f){

    }

    //--------------------------Aufmaß------------------------//
    public LinkedList<Kunde> getKunden(){
        return null;
    }
    public LinkedList<Bauvorhaben> getBauvorhaben(){
        return null;
    }
    public LinkedList<Immobilie> getImmobilie(){
        return null;
    }
    public LinkedList<Raum> getRaeume(int immoId){
        return null;
    }
    public void bearbeiteRaumAufmaß(int immoID, Raum r){
        //supa kevin!
    }

//-------------Buchhaltung---------------//

    //public LinkedList<Rechnung> getRechnungen(){
    //return null;
    //}
    public void bearbeiteRechnung(int reID){

    }
    public void entferneRechnung(int reID){

    }
    //public LinkedList<Angebot> getAngebot(){
    //return null;
    //}
    public void bearbeiteAngebot(int angID){

    }
    void entferneAngebot(int angID){

    }
    // public LinkedList<Aufmass> getAufmass(){
    //     return null;
    //}
    public void bearbeiteAufmass(int aufID){

    }
    public void entferneAufmass(int aufID){

    }
}


