package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnBass1;

    private Button btnBass2;

    private Button btnKicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnBass1 = findViewById(R.id.btn_Bass1);
        btnBass2 = findViewById(R.id.btn_Bass2);
        btnKicker = findViewById(R.id.btn_Kicker;


        btnBass1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBass1;
            }
        });
    }


}