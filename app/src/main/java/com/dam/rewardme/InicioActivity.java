package com.dam.rewardme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class InicioActivity extends AppCompatActivity {

    private Intent pasarPantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                pasarPantalla=new Intent(MainActivity.this, InicioActivity.class);
                finish();
                startActivity(pasarPantalla);

            }
        };

        Timer t = new Timer();
        t.schedule(tt, 2000);
    }
}