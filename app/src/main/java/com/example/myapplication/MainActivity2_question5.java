package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2_question5 extends AppCompatActivity {

    //la listeview
    ListView listViewRegion;
    //la liste string
    ArrayList<String> listeRegion=new ArrayList<String>();
    //l'adaptateur de la listeview
    ArrayAdapter<String> listViewRegionAdapter ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_question5);
        //
        this.chargerList("suffixe");
        //
        listViewRegion=(ListView) findViewById(R.id.listview);
        listViewRegionAdapter = new ArrayAdapter<String>(this, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,listeRegion);
        listViewRegion.setAdapter(listViewRegionAdapter);
        //
        //bouton d'arret de l'activité
        Button stop = (Button) findViewById(R.id.button7);
        stop.setOnClickListener(view -> {
            this.finish();
        });
    }
    //Methode qui remplie la liste des regions avec le nom des cinq regions bretonne
    private void chargerList(String suffixe){
        //
        String[] liste = {"Rennes","Saint Malo","saint gregore"};
        //
        for(String item:liste){listeRegion.add(suffixe+item);}
    }
}