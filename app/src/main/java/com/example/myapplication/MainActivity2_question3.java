package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2_question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_question3);
        //bouton d'arret de l'activité
        Button stop = (Button) findViewById(R.id.button7);
        stop.setOnClickListener(view -> {
            this.finish();
        });
    }
}