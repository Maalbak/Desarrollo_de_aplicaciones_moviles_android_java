package com.project.matias.comanda;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Mesa extends AppCompatActivity {

    EditText MesaNum;
    EditText MesaCap;
    Button MesaGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mesa);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);

            MesaNum = findViewById(R.id.MeTxtNum);
            MesaCap = findViewById(R.id.MeTxtCap);
            MesaGuardar = findViewById(R.id.BtnMeGuardar);

            String NumMesa = MesaNum.getText().toString();
            String CapMesa = MesaCap.getText().toString();



        }
    }
}