package com.example.csgonades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ovptalongflash1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ovptalongflash1);

        Button home = (Button) findViewById(R.id.home);
        home.setOnClickListener(v ->  {

            Intent intHom = new Intent(this, Home.class);
            startActivity(intHom);

        });

    }
}
