package com.example.kyky.rizki_1202150379_modul4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button a,b ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = (Button) findViewById(R.id.list);
        b = (Button) findViewById(R.id.gbr);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ac = new Intent(MainActivity.this,ListNamaMahasiswa.class);
                startActivity(ac); //intent pindah ke ListNamaMahasiswa class
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ab = new Intent(MainActivity.this,CariGambar.class);
                startActivity(ab); //Intent pindah ke CariGambar.class
            }
        });
    }
}
