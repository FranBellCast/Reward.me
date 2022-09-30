package com.dam.rewardme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class RegistroActivity extends AppCompatActivity {

    protected TextView texto1;
    protected EditText caja1;
    protected EditText caja2;
    protected EditText caja3;
    protected Spinner spinner1;
    protected Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        // Instancio cada objeto de la pantalla

        texto1= (TextView) findViewById(R.id.texto1_registro);
        caja1=(EditText) findViewById(R.id.nombre_registro);
        caja2=(EditText) findViewById(R.id.email_registro);
        caja3=(EditText) findViewById(R.id.pass_registro);
        spinner1=(Spinner) findViewById(R.id.perfil_registro);
        boton1=(Button) findViewById(R.id.boton1_registro);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.perfiles, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);


    }
}