package com.project.matias.comanda;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Plato extends AppCompatActivity {

    EditText PlaId;
    EditText PlaTipo;
    EditText PlaNom;
    EditText PlaPre;
    Button PlaGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plato);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);

            PlaId = findViewById(R.id.PlaTxtId);
            PlaTipo = findViewById(R.id.PlaTxtTipo);
            PlaNom = findViewById(R.id.PlaTxtNom);
            PlaPre = findViewById(R.id.PlaTxtPre);
            PlaGuardar = findViewById(R.id.BtnGarGuardar);

            String IdPla = PlaId.getText().toString();
            String TipoPla = PlaTipo.getText().toString();
            String NomPla = PlaNom.getText().toString();
            String PrePla = PlaPre.getText().toString();

        }
    }
}