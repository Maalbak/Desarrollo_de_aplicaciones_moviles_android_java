package com.project.matias.comanda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button AddMesa;
    Button AddGarzon;
    Button AddBebida;
    Button AddPlato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddMesa = findViewById(R.id.BtnMesa);
        AddGarzon = findViewById(R.id.BtnGarzon);
        AddBebida = findViewById(R.id.BtnBebida);
        AddPlato = findViewById(R.id.BtnPlato);

        AddMesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Mesa.class));
            }
        });

        AddGarzon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Garzon.class));
            }
        });

        AddBebida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Bebida.class));
            }
        });

        AddPlato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Plato.class));
            }
        });
    }
}