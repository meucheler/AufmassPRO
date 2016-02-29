package mikekevinsebitobi.aufmasspro;

import android.app.ActionBar;
import android.content.Intent;
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

        //ActionBar actBar = getActionBar();
        //actBar.setTitle("ActVerwaltung");
        //actBar.show();

        ((Button) findViewById(R.id.btnKunden)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startIntentListeKunden();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_act_verwalt,menu);
        return true;
    }


    public void startIntentListeKunden(){
        Intent intent = new Intent(this, ActListeKunden.class);
        startActivity(intent);
    }
}
