package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2_question_4 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_question4);
        //
        //bouton d'arret de l'activité
        Button stop = (Button) findViewById(R.id.button7);
        stop.setOnClickListener(view -> {
            this.finish();
        });
    }

}