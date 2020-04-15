package com.example.csgonades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ovp = (Button) findViewById(R.id.ovp);
        ovp.setOnClickListener(v ->  {

            Intent intOvp = new Intent(this, overpass.class);
            startActivity(intOvp);

        });
    }
}
