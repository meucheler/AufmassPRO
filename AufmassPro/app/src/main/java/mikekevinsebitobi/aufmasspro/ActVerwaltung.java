package mikekevinsebitobi.aufmasspro;


import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class ActVerwaltung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_verwaltung);

        //Action Bar

        ActionBar actBar = getSupportActionBar();
        actBar.setTitle("ActVerwaltung");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_act_verwalt,menu);
        return true;
    }


    //ActionBar
    //ActionBar bar = getSupportActionBar();
}
