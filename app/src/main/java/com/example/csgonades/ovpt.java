package com.example.csgonades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ovpt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button home = (Button) findViewById(R.id.home);
        home.setOnClickListener(v ->  {

            Intent intHom = new Intent(this, Home.class);
            startActivity(intHom);

        });

        Button swapte = (Button) findViewById(R.id.swapte);
        swapte.setOnClickListener(v ->  {

            Intent intsw = new Intent(this, ovpct.class);
            startActivity(intsw);

        });

    }
}
