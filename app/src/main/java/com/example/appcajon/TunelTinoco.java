package com.example.appcajon;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TunelTinoco extends AppCompatActivity {
    Button btTunelTinoco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tunel_tinoco);

        btTunelTinoco = findViewById(R.id.btllegartinoco);
        btTunelTinoco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),  "Button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MapsActivityTunelTinoco.class);
                startActivity(intent);
            }
        });
    }
}