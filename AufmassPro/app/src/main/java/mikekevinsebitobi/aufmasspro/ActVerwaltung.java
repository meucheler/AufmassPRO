package mikekevinsebitobi.aufmasspro;


import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ActVerwaltung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_verwaltung);

        //Action Bar

        ActionBar actBar = getSupportActionBar();
        actBar.setTitle("ActVerwaltung");
        actBar.setDisplayHomeAsUpEnabled(true);

        //Buttons
        final Button btnKunden = (Button) findViewById(R.id.btnKunden);
        final Button btnBauvorhaben = (Button) findViewById(R.id.btnProjekte);


        //ClickListener
        btnKunden.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                startIntentListeKunden();

            }
        });

        btnBauvorhaben.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_act_verwalt, menu);
        return true;
    }


    public void startIntentListeKunden(){
        Intent intent = new Intent(this, ActListeKunden.class);
        startActivity(intent);
    }
}
