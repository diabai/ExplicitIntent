package com.yiriba.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // Receive the data passed from intent 1;
        Intent i = getIntent();
        String k = i.getStringExtra("id_key");

        Toast.makeText(this, "We passed "+ k, Toast.LENGTH_LONG).show();
    }
}