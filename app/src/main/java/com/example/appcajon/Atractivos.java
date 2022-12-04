package com.example.appcajon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Atractivos extends AppCompatActivity {
    Button btcondores, btanimas, btlagunapatos, btazules, btglaciar, btembalseyeso, btelmorado, bttermas,
    btmiradoring, btroan, btcristo, btlmanyos, btjose, btbmorales, bttermaspl, btriom, bttinoco, bttrenpat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atractivos);

        btcondores = findViewById(R.id.btcondor);
        btanimas = findViewById(R.id.btanima);
        btlagunapatos = findViewById(R.id.btlaguna);
        btazules = findViewById(R.id.btbaños);
        btglaciar = findViewById(R.id.btglaciar);
        btembalseyeso = findViewById(R.id.btembalse);
        btelmorado = findViewById(R.id.btmorado);
        bttrenpat = findViewById(R.id.bttren);
        bttermas = findViewById(R.id.btermascolina);
        bttinoco = findViewById(R.id.bttunel);
        btriom = findViewById(R.id.btrio);
        bttermaspl = findViewById(R.id.bttermasplomo);
        btbmorales = findViewById(R.id.btmorales);
        btjose = findViewById(R.id.btsanjose);
        btlmanyos = findViewById(R.id.btmanyos);
        btcristo = findViewById(R.id.btpuente);
        btroan = findViewById(R.id.btobserv);
        btmiradoring = findViewById(R.id.btingenio);

        btcondores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Trekking_Condores.class);
                startActivity(intent);
            }
        });

        btanimas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Animas.class);
                startActivity(intent);
            }
        });

        btlagunapatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), LagunaPatos.class);
                startActivity(intent);
            }
        });

        btazules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), BanosAzules.class);
                startActivity(intent);
            }
        });

        btglaciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Glaciar.class);
                startActivity(intent);
            }
        });

        btembalseyeso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), EmbalseYeso.class);
                startActivity(intent);
            }
        });

        btelmorado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), ElMorado.class);
                startActivity(intent);
            }
        });

        bttrenpat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), TrenPatrimonial.class);
                startActivity(intent);
            }
        });

        bttermas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), TermasColina.class);
                startActivity(intent);
            }
        });

        bttinoco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), TunelTinoco.class);
                startActivity(intent);
            }
        });

        btriom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), RioMaipo.class);
                startActivity(intent);
            }
        });

        bttermaspl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), TermasPlomo.class);
                startActivity(intent);
            }
        });

        btbmorales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), BanosMorales.class);
                startActivity(intent);
            }
        });

        btjose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), SanJose.class);
                startActivity(intent);
            }
        });

        btlmanyos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), LosManyos.class);
                startActivity(intent);
            }
        });

        btcristo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), PuenteCristo.class);
                startActivity(intent);
            }
        });

        btroan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Observatorio.class);
                startActivity(intent);
            }
        });

        btmiradoring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MiradorIngenio.class);
                startActivity(intent);
            }
        });
    }
}