package mikekevinsebitobi.aufmasspro;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Action Bar
        ActionBar actBar = getSupportActionBar();
        actBar.setTitle("Home");
        actBar.show();

        final Button btnVerwalt = (Button) findViewById(R.id.btnVerwaltung);
        final Button btnAufma= (Button) findViewById(R.id.btnAufmass);
        final Button btnBuchh= (Button) findViewById(R.id.btnBuchhaltung);

        //Verwaltung CLICKEVENT
        btnVerwalt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                startIntentActVerwalt();

            }
        });

        //Aufmass CLICKEVENT
        btnAufma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

            }
        });

        //Buchhaltung CLICKEVENT
        btnBuchh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

            }
        });





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

    public void startIntentActVerwalt(){
        Intent intent = new Intent(this, ActVerwaltung.class);
        startActivity(intent);
    }
}
