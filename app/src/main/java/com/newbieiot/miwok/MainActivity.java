package com.newbieiot.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbers = findViewById(R.id.numbers);
        TextView family_members = findViewById(R.id.family);
        TextView colors = findViewById(R.id.colors);
        TextView phrases = findViewById(R.id.phrases);

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent number = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(number);
            }
        });

        family_members.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent family = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(family);
            }
        });

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent color = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(color);
            }
        });

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrase = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrase);
            }
        });
    }
}
