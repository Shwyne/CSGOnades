package com.example.csgonades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class overpass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ovp);

        Button home = (Button) findViewById(R.id.home);
        home.setOnClickListener(v ->  {

            Intent intHome = new Intent(this, Home.class);
            startActivity(intHome);

        });

        Button butct = (Button) findViewById(R.id.butct);
        butct.setOnClickListener(v ->  {

            Intent intct = new Intent(this, ovpct.class);
            startActivity(intct);

        });

        Button butte = (Button) findViewById(R.id.butte);
        butte.setOnClickListener(v ->  {

            Intent intte = new Intent(this, ovpt.class);
            startActivity(intte);

        });
    }
    }

