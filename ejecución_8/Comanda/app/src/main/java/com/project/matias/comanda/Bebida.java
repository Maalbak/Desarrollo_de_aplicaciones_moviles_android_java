package com.project.matias.comanda;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Bebida extends AppCompatActivity {

    EditText BeId;
    EditText BeTipo;
    EditText BeNom;
    EditText BePre;
    Button BeGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bebida);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);

            BeId = findViewById(R.id.BeTxtId);
            BeTipo = findViewById(R.id.BeTxtTipo);
            BeNom = findViewById(R.id.BeTxtNom);
            BePre = findViewById(R.id.BeTxtPre);
            BeGuardar = findViewById(R.id.BtnBeGuardar);

            String IdBe = BeId.getText().toString();
            String TipoBe = BeTipo.getText().toString();
            String NomBe = BeNom.getText().toString();
            String PreBe = BePre.getText().toString();

            //BeGuardar.setOnClickListener(new View.OnClickListener() {
            //   @Override
            //   public void onClick(View v) {

                }
        }
    }

