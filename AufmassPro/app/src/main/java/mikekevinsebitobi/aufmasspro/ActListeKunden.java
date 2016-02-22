package mikekevinsebitobi.aufmasspro;

import android.os.Bundle;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.LinkedList;

import Kunde.Kunde;
import Logik.Logik;


/**
 * Created by Seby on 01.02.16.
 */
public class ActListeKunden extends AppCompatActivity{
    LinkedList<String> spinnerItems;
    Logik logik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_kunden);

        //Logik
        logik = new Logik();


        //Action Bar

        ActionBar actBar = getSupportActionBar();
        actBar.setTitle("Liste aller Kunden");

        //Spinner
        spinnerItems = new LinkedList<>();
        spinnerItems.add("ID");
        spinnerItems.add("Vorname");
        spinnerItems.add("Nachname");

        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,spinnerItems);
        Spinner sp =(Spinner) findViewById(R.id.spinnerKunden);
        sp.setAdapter(spinnerArrayAdapter);

        // ListView
        LinkedList<Kunde> kundeLinkedList= logik.getKunden();
        ListView lv  = (ListView) findViewById(R.id.listViewKunden);

        ArrayAdapter<Kunde> kundeArrayAdapter = new ArrayAdapter<Kunde>(this,android.R.layout.simple_list_item_1,kundeLinkedList);

        lv.setAdapter(kundeArrayAdapter);



    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_liste_kunden, menu);
        return true;
    }

    public void filterListe(ListView lv, String filtTextVal, String filtSpinnVal){

        LinkedList<Kunde> kundeLinkedList= logik.getKunden();
        for (Kunde k:kundeLinkedList) {
            if(filtSpinnVal.equals(spinnerItems.get(1)) && k.getAnsprechperson().getVorname().contains(filtTextVal)){
                kundeLinkedList.remove(k);
            }
            if(filtSpinnVal.equals(spinnerItems.get(2)) && k.getAnsprechperson().getNachname().contains(filtTextVal)){
                kundeLinkedList.remove(k);
            }



        }

        ArrayAdapter<Kunde> kundeArrayAdapter = new ArrayAdapter<Kunde>(this,android.R.layout.simple_list_item_1,kundeLinkedList);

        lv.setAdapter(kundeArrayAdapter);
    }

}
