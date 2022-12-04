package com.example.appcajon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Animas extends AppCompatActivity {
    Button btAnima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animas);

        btAnima = findViewById(R.id.btllegaranima);
        btAnima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),  "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MapsActivityAnimas.class);
                startActivity(intent);
            }
        });
    }
}