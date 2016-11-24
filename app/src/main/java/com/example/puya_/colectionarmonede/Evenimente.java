package com.example.puya_.colectionarmonede;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Evenimente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evenimente);

        Button adaugaEv = (Button) findViewById(R.id.adaugaEvenimente_evenimente_button);
        adaugaEv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),AdaugaEvenimente.class);
                startActivity(i);
            }
        });
    }
}
