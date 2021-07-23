package com.project.matias.comanda;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Garzon extends AppCompatActivity {

    EditText GarId;
    EditText GarNom;
    EditText GarAp;
    Button GarGuardar;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.garzon);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);

            GarId = findViewById(R.id.GarTxtId);
            GarNom = findViewById(R.id.GarTxtNom);
            GarAp = findViewById(R.id.GarTxtAp);
            GarGuardar = findViewById(R.id.BtnGarGuardar);

            String IdGar = GarId.getText().toString();
            String NomGar = GarNom.getText().toString();
            String ApGar = GarAp.getText().toString();
        }
    }
}