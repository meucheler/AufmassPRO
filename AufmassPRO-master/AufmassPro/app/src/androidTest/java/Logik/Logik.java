package Logik;

import java.util.LinkedHashMap;
import java.util.LinkedList;

import Bauvorhaben.Bauvorhaben;
import FirmaInfos.Firmendaten;
import Immobilie.Immobilie;
import Kunde.Ansprechperson;
import Kunde.Kunde;
import Raum.Raum;

/**
 * Created by miken on 18.01.2016.
 */



public class Logik {

    public void erzeugeKunde(Kunde k){

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

    }
    public LinkedList<Bauvorhaben> getBauvorhaben(){

    }
    public LinkedList<Immobilie> getImmobilie(){

    }
    public LinkedList<Raum> getRaeume(int immoId){

    }
    public void bearbeiteRaumAufmaß(int immoID, Raum r){

    }

//-------------Buchhaltung---------------//

    public LinkedList<Rechnung> getRechnungen(){

    }
    public void bearbeiteRechnung(int reID){

    }
    public void entferneRechnung(int reID){

    }
    public LinkedList<Angebot> getAngebot(){

    }
    public void bearbeiteAngebot(int angID){

    }
    void entferneAngebot(int angID){

    }
    public LinkedList<Aufmass> getAufmass(){
        return null;
    }
    public void bearbeiteAufmass(int aufID){

    }
    public void entferneAufmass(int aufID){

    }
}
