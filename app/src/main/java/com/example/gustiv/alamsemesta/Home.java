package com.example.gustiv.alamsemesta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("HOME");
    }

    public void planets (View view)
    {
        Intent move = new Intent(Home.this, Planets.class);
        move.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(move);
    }
}
