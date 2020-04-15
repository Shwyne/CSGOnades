package com.example.csgonades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ovptalong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ovptalong);

        Button home = (Button) findViewById(R.id.home);
        home.setOnClickListener(v ->  {

            Intent intHome = new Intent(this, Home.class);
            startActivity(intHome);



        });

        Button fb = (Button) findViewById(R.id.fb);
        fb.setOnClickListener(v ->  {

            Intent intFb = new Intent(this, ovptalongflash1.class);
            startActivity(intFb);



        });

    }
}
