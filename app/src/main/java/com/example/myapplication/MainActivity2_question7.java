package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Map;
import java.util.Hashtable;


public class MainActivity2_question7 extends AppCompatActivity {

    //la liste des region
    ArrayList<String> listeRegion = new ArrayList<String>();
    //la listeview
    ListView listViewRegion;
    //la map liste string pour les departements et leurs populations
    Map<String, String> diction = new Hashtable<String,String>();
    //l'adaptateur de la listeview
    ArrayAdapter<String> listViewRegionAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_question7);
        //
        this.chargerList("suffixe");
        //
        listViewRegion=(ListView) findViewById(R.id.listview);
        listViewRegionAdapter = new ArrayAdapter<String>(this, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,listeRegion);
        listViewRegion.setAdapter(listViewRegionAdapter);
        //rendre les items clickable
        listViewRegion.setOnItemClickListener((parent,view,position,id) -> {
            //
            String nomRegion = parent.getItemAtPosition(position).toString();
            String population = diction.get(nomRegion);
            //
            Toast.makeText(getApplicationContext(),nomRegion,Toast.LENGTH_LONG).show();
        });
        //bouton d'arret de l'activité
        Button stop = (Button) findViewById(R.id.button7);
        stop.setOnClickListener(view -> {
            this.finish();
        });
    }
    //Methode qui remplie la liste des regions avec le nom des cinq regions bretonne
    private void chargerList(String suffix){
        //
        diction.put("Rennes","25022");
        diction.put("Saint Malo","12300");
        diction.put("Bangui","15000");
        diction.put("Kant","44755");
        diction.put("Allymant","51000");
        //
        for(String item: diction.keySet()){listeRegion.add(suffix+" "+item);}
    }
}