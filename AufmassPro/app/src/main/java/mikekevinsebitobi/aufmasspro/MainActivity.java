package mikekevinsebitobi.aufmasspro;

import android.app.ActionBar;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import DB.DBHandler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.btnVerwaltung);
        final Button button1 = (Button) findViewById(R.id.btnAufmass);
        final Button button2 = (Button) findViewById(R.id.btnBuchhaltung);

        //Verwaltung CLICKEVENT
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                setContentView(R.layout.activity_act_verwaltung);
            }
        });

        //Aufmass CLICKEVENT
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

            }
        });

        //Buchhaltung CLICKEVENT
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

            }
        });

        //Action Bar

        //ActionBar actBar = getActionBar();
        //actBar.setTitle("Home");
        //actBar.show();

        DBHandler dbHandler = new DBHandler(this);
        SQLiteDatabase db = dbHandler.getWritableDatabase();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void btnVerClicked(View view) {

    }
    public void btnAufClick(View view) {

    }
    public void btnBucClick(View view) {

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
