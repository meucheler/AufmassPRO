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
import Utils.Addresse;
import Utils.Bankdaten;
import Utils.Kontaktdaten;

/**
 * Created by miken on 01.02.2016.
 */
public class Logik {


    public Logik() {
        /*a1 = new Ansprechperson();
        a2 = new Ansprechperson();
        a3 = new Ansprechperson();
        a4 = new Ansprechperson();
        a5 = new Ansprechperson();
        adress1 = new Addresse();
        b1 = new Bankdaten();
        kon1 = new Kontaktdaten();
        k1 = new Kunde();
        k2 = new Kunde();
        k3 = new Kunde();
        k4 = new Kunde();
        bvh = new Bauvorhaben();*/
    }

    /**
     * Created by miken on 18.01.2016.
     * a1 = new Ansprechperson("Kevin", "Indinger" , "Dr.");
     a2 = new Ansprechperson("Sebastian", "Bernhart" , "DDr.");
     a3 = new Ansprechperson("Tobias", "Doppler" , "Pädagoge");
     a4 = new Ansprechperson("Michael", "Nimmervoll" , "Meister");
     a5 = new Ansprechperson("Andreas", "Burgstaller", "Tierarzt");
     adress1 = new Addresse(4710,"Grieskirchen", "Lagestrasse", "12");
     b1 = new Bankdaten("Raiffeisen Bank", 34736, "7923742398", "0012 2812 9213 1293", "");
     kon1 = new Kontaktdaten(1, "kejahi@gmail.com","0680 323 21212","Fax -lol");
     k1 = new Kunde(a1, "Zusatzdaten", adress1, kon1, 1, "20%", b1);
     k2 = new Kunde(a2, "Zusatzdaten", adress1, kon1, 2, "20%", b1);
     k3 = new Kunde(a3, "Zusatzdaten", adress1, kon1, 3, "20%", b1);
     k4 = new Kunde(a4, "Zusatzdaten", adress1, kon1, 4, "20%", b1);
     bvh = new Bauvorhaben();
     */
//1, adress1, k1.getKundenNr(), " Beschreibung (hier)","Bauvorhaben 1","Schwierig", llImmbo

    public void erzeugeKunde(Kunde kunde){
        //ContentValues values = new ContentValues();

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

    public LinkedList<Kunde> getKundeSuche(int id, String anVorname, String anNachname){
        LinkedList<Kunde> Kundenliste = getKunden();
        LinkedList<Kunde> KuResultate = new LinkedList<>();
        if(id != 0){
            for (Kunde kAct : Kundenliste){
                if(kAct.getKundenNr() == id){
                    KuResultate.add(kAct);
                }
            }
        }
        if(anVorname != null){
            for (Kunde kAct : Kundenliste) {
                if(kAct.getAnsprechperson().getVorname().toLowerCase().contains(anVorname.toLowerCase())){
                    KuResultate.add(kAct);
                }
            }
        }
        if (anNachname != null) {
            for (Kunde kAct : Kundenliste) {
                if(kAct.getAnsprechperson().getNachname().toLowerCase().contains(anNachname.toLowerCase())){
                    KuResultate.add(kAct);
                }
            }
        }

        return KuResultate;
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
    LinkedList<Kunde> llKunde = new LinkedList<Kunde>();

    Ansprechperson a1;
    Ansprechperson a2;
    Ansprechperson a3;
    Ansprechperson a4;
    Ansprechperson a5;

    /*
    Bauvorhaben wird von sebastian erstellt,
    inder Logik gespeichert,
    von der Logik in die Datenbank hochgeschossen

HAlllo

      */

    Addresse adress1;
    Bankdaten b1;
    Kontaktdaten kon1;
    Kunde k1;
    Kunde k2;
    Kunde k3;
    Kunde k4;
    public LinkedList<Kunde> getKunden(){
        llKunde.add(k1);
        llKunde.add(k2);
        llKunde.add(k3);
        llKunde.add(k4);
        return llKunde;
    }

    LinkedList<Immobilie> llImmbo = new LinkedList<Immobilie>();
    Immobilie im1 = new Immobilie();
    Bauvorhaben bvh;
    LinkedList<Bauvorhaben> llBauvo = new LinkedList<Bauvorhaben>();

    public LinkedList<Bauvorhaben> getBauvorhaben(){
        llBauvo.add(bvh);
        llBauvo.add(bvh);
        llBauvo.add(bvh);
        return llBauvo;
    }
    LinkedList<Immobilie> llImmo12 = new LinkedList<Immobilie>();
    LinkedList<Raum> llRau = new LinkedList<Raum>();
    Immobilie ba1 = new Immobilie(llRau, 2);
    public LinkedList<Immobilie> getImmobilie(){
        llImmo12.add(ba1);
        return llImmo12;
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
    //     KKK
    //}
    public void bearbeiteAufmass(int aufID){

    }
    public void entferneAufmass(int aufID){

    }
}


