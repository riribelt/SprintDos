package com.ricardo_rivera_beltran.sprintdos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    private Button btnInfo;
    private TextView textNameInfo, textDescriptionInfo, textPriceInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        btnInfo = (Button) findViewById(R.id.btnInfo);
        textNameInfo = (TextView) findViewById(R.id.textNameInfo);
        textDescriptionInfo = (TextView) findViewById(R.id.textDescriptionInfo);
        textPriceInfo = (TextView) findViewById(R.id.textPriceInfo);

        Intent intentIN = getIntent();
        textNameInfo.setText(intentIN.getStringExtra("name"));
        textDescriptionInfo.setText(intentIN.getStringExtra("description"));
        textPriceInfo.setText(intentIN.getStringExtra("precio"));

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adelante = new Intent(getApplicationContext(), Catalogo.class);
                startActivity(adelante);
            }
        });

    }
}