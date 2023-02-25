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
    ArrayList<String> listeRegion ;
    //la listeview
    ListView listViewRegion;
    //la map liste string pour les departements et leurs populations
    Map<String, String> diction = new Hashtable<String, String>();
    //l'adaptateur de la listeview
    ArrayAdapter<String> listViewRegionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_question7);
        //
        this.chargerList("- Bretagne");
        //
        listViewRegion = (ListView) findViewById(R.id.listview);
        listViewRegionAdapter = new ArrayAdapter<String>(this, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item, listeRegion);
        listViewRegion.setAdapter(listViewRegionAdapter);
        //rendre les items clickable
        listViewRegion.setOnItemClickListener((parent, view, position, id) -> {
            //
            String nomRegion = parent.getItemAtPosition(position).toString();
            String population = "";
            population = diction.get(nomRegion);
            //
            Toast.makeText(this,population+" habitants en 2022", Toast.LENGTH_LONG).show();
        });
        //bouton d'arret de l'activité
        Button stop = (Button) findViewById(R.id.button7);
        stop.setOnClickListener(view -> {
            this.finish();
        });
    }

    //Methode qui remplie la liste des regions avec le nom des cinq regions bretonne
    private void chargerList(String suffix) {
        listeRegion = new ArrayList<String>();
        //
        String[] region_bretone = {"Côtes-d'Armor", "Finistère", "Ille-et-Vilaine", "Morbihan"};
        String[] nombre_habitant = {"603 640", "603 640", "922 800", "1 107 900", "770 900"};
        for(int i=0;i<region_bretone.length;i++){
            diction.put(region_bretone[i]+suffix,nombre_habitant[i]);
            listeRegion.add(region_bretone[i]+suffix);
        }
    }
}