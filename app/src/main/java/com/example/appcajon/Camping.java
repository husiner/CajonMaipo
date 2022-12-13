package com.example.appcajon;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Camping extends AppCompatActivity {
    Button parquealmendro, nogalesroan;
    ImageButton whatsappal, facebookal, instagramal, llamaral, whatsapproan,
    facebookroan, instagramroan, twitterroan, youtuberoan, llamarroan, mailalmendro, mailnogales;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camping);

        parquealmendro = findViewById(R.id.btwebalmendro);
        whatsappal = findViewById(R.id.btwhatsappalmendro2);
        facebookal = findViewById(R.id.btfacebookalmendro);
        instagramal = findViewById(R.id.btinstagramalmendro);
        llamaral = findViewById(R.id.btllamaralmendro);
        nogalesroan = findViewById(R.id.btwebroan);
        whatsapproan = findViewById(R.id.btwhatsapproan);
        facebookroan = findViewById(R.id.btfacebookroan);
        instagramroan = findViewById(R.id.btinstagramroan);
        twitterroan = findViewById(R.id.twitterroan);
        youtuberoan = findViewById(R.id.youtuberoan);
        llamarroan = findViewById(R.id.btllamarroan);
        mailalmendro = findViewById(R.id.mailalmendro);
        mailnogales = findViewById(R.id.mailnogales);

        mailnogales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "mailto:roanjase@hotmail.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        mailalmendro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "mailto:info@parquealmendro.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        parquealmendro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.parquealmendro.com/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        whatsappal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://api.whatsapp.com/send?phone="+"+56931073812";
                Intent alm = new Intent(Intent.ACTION_VIEW);
                alm.setData(Uri.parse(url));
                startActivity(alm);
            }
        });

        facebookal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.facebook.com/profile.php?id=100069989730843";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        instagramal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.instagram.com/parquealmendro/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        llamaral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:228612301"));
                startActivity(i);
            }
        });

        nogalesroan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://roanjase.cl/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        whatsapproan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://api.whatsapp.com/send?phone="+"+56977092798";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        facebookroan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.facebook.com/Observatorioroanjase";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        instagramroan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.instagram.com/observatorio.roanjase/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        twitterroan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://twitter.com/roanjase";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        youtuberoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/channel/UCxJsm879uB38wod44kRDmHQ";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        llamarroan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:228611281"));
                startActivity(i);
            }
        });
    }
}