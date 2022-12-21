package com.ricardo_rivera_beltran.sprintdos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAdelante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdelante = (Button)findViewById(R.id.btnAdelante);

        btnAdelante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adelante = new Intent(getApplicationContext(), Catalogo.class);
                startActivity(adelante);
            }
        });
    }
}