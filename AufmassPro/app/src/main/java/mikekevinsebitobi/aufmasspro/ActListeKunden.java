package mikekevinsebitobi.aufmasspro;

import android.os.Bundle;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

/**
 * Created by Seby on 01.02.16.
 */
public class ActListeKunden extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_kunden);

        //Action Bar

        ActionBar actBar = getSupportActionBar();
        actBar.setTitle("Liste aller Kunden");


    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_liste_kunden, menu);
        return true;
    }
}
