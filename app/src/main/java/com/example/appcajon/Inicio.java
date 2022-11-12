package com.example.appcajon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {
    Button btAtractivos, btHospedaje,btActividades,btGastronomia,btCerveza,btRelax,
    btEventos,btTiendas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Database db = new Database();

        btAtractivos = findViewById(R.id.btatract);
        btHospedaje = findViewById(R.id.bthosp);
        btActividades = findViewById(R.id.btactiv);
        btGastronomia = findViewById(R.id.btgastrono);
        btCerveza = findViewById(R.id.btcerve);
        btRelax = findViewById(R.id.btrel);
        btEventos = findViewById(R.id.bteven);
        btTiendas = findViewById(R.id.bttiend);

        btAtractivos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),  "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Atractivos.class);
                startActivity(intent);
            }
        });

        btHospedaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),  "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Hospedaje.class);
                startActivity(intent);
            }
        });

        btActividades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),  "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Actividades.class);
                startActivity(intent);
            }
        });

        btGastronomia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),  "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Gastronomia.class);
                startActivity(intent);
            }
        });

        btCerveza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),  "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Cerveza.class);
                startActivity(intent);
            }
        });
        btRelax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),  "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Relax.class);
                startActivity(intent);
            }
        });

        btEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),  "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Eventos.class);
                startActivity(intent);
            }
        });

        btTiendas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),  "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Tiendas.class);
                startActivity(intent);
            }
        });
    }



}