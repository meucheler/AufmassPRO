package mikekevinsebitobi.aufmasspro;

import android.os.Bundle;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.LinkedList;

import Kunde.Kunde;
import Logik.Logik;


/**
 * Created by Seby on 01.02.16.
 */
public class ActListeKunden extends AppCompatActivity{

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



}
