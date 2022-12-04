package com.example.appcajon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Hospedaje extends AppCompatActivity {
    Button camping, domos, cabañas, hostal, hosteria, hotel, lodge, albergue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospedaje);

        camping = findViewById(R.id.btcamping);
        domos = findViewById(R.id.btdomos);
        cabañas = findViewById(R.id.btcabanas);
        hostal = findViewById(R.id.bthostal);
        hosteria = findViewById(R.id.bthosteria);
        hotel = findViewById(R.id.bthotel);
        lodge = findViewById(R.id.btlodge);
        albergue = findViewById(R.id.btalbergue);

        camping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Camping.class);
                startActivity(intent);
            }
        });

        domos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Domos.class);
                startActivity(intent);
            }
        });

        cabañas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Cabanas.class);
                startActivity(intent);
            }
        });

        hostal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Hostal.class);
                startActivity(intent);
            }
        });

        hosteria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Hosteria.class);
                startActivity(intent);
            }
        });

        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Hotel.class);
                startActivity(intent);
            }
        });

        lodge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Lodge.class);
                startActivity(intent);
            }
        });

        albergue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Albergue.class);
                startActivity(intent);
            }
        });

    }
}