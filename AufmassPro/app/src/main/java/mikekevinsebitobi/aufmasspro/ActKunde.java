package mikekevinsebitobi.aufmasspro;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import Kunde.Kunde;
import Kunde.Ansprechperson;

/**
 * Created by Seby on 01.02.16.
 */
public class ActKunde extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kunde);
        Bundle bundle = getIntent().getExtras();

        if(bundle.getSerializable("Kunde")!=null){
            Kunde kunde = (Kunde) bundle.getSerializable("Kunde");
            Ansprechperson ansprechperson = kunde.getAnsprechperson();
            ((TextView) findViewById(R.id.tvwActKundNr)).setText(kunde.getKundenNr());
            ((EditText) findViewById(R.id.edtTitel)).setText(ansprechperson.getTitel());
            ((EditText) findViewById(R.id.edtVname)).setText(ansprechperson.getVorname());
            ((EditText) findViewById(R.id.edtNname)).setText(ansprechperson.getNachname());
        }



        //Action Bar
        ActionBar actBar = getActionBar();
        actBar.setTitle("ActVerwaltung");
        actBar.show();
    }



}
