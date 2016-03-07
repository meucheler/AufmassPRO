package mikekevinsebitobi.aufmasspro;



import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.LinkedList;

import Kunde.Kunde;
import Logik.Logik;


/**
 * Created by Seby on 01.02.16.
 */
public class ActListeKunden extends AppCompatActivity {
    LinkedList<String> spinnerItems;
    Logik logik;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
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

        final EditText editTextPat = (EditText )findViewById(R.id.editTextKunden);
        editTextPat.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filterListe((ListView) findViewById(R.id.listViewKunden),editTextPat.getText().toString(),((Spinner)findViewById(R.id.spinnerKunden)).getSelectedItem().toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        //list
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               //**
                startIntentKunde((Kunde)((ListView)findViewById(R.id.listViewKunden)).getAdapter().getItem(position));
            }
        });

        //menu new Kunde
        //MenuItem newKunde =(MenuItem) findViewById(R.id.menu_newKunde);
        //newKunde.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
        //    @Override
        //    public boolean onMenuItemClick(MenuItem item) {
        //        startIntentKunde();
        //        return true;
        //    }
        //});


    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_liste_kunden, menu);
        return true;
    }

    public void filterListe(ListView lv, String filtTextVal, String filtSpinnVal){

        LinkedList<Kunde> kundeLinkedList = logik.getKunden();

        //ID
        if(filtSpinnVal.equals(spinnerItems.get(0)) ){
            try {
                int id = Integer.parseInt(filtTextVal);
                kundeLinkedList=logik.getKundeSuche(id, null, null);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        //Vorname
        if(filtSpinnVal.equals(spinnerItems.get(1)) ){
            kundeLinkedList=logik.getKundeSuche(0, filtTextVal,null);
        }
        //Nachname
        if(filtSpinnVal.equals(spinnerItems.get(2)) ){
            kundeLinkedList=logik.getKundeSuche(0,null, filtTextVal);
        }

        ArrayAdapter<Kunde> kundeArrayAdapter = new ArrayAdapter<Kunde>(this,android.R.layout.simple_list_item_1,kundeLinkedList);

        lv.setAdapter(kundeArrayAdapter);
    }
    public void startIntentKunde(Kunde k){
        Intent intent = new Intent(this, ActKunde.class);
        intent.putExtra("Kunde",k);
        startActivity(intent);
    }

    public void startIntentKunde(){
        Intent intent = new Intent(this, ActKunde.class);
        startActivity(intent);
    }
}
