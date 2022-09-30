package com.dam.rewardme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    protected TextView texto1;
    protected EditText caja1;
    protected EditText caja2;
    protected Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        // Instancio cada objeto de la pantalla
        texto1= (TextView) findViewById(R.id.texto1_login);
        caja1=(EditText) findViewById(R.id.email_login);
        caja2=(EditText) findViewById(R.id.pass_login);
        boton1=(Button) findViewById(R.id.boton_login);


    }
}