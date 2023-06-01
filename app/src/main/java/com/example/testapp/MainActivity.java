package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnANote;
    private Button btnASharp;
    private Button btnBNote;
    private Button btnCNote;
    private Button btnCSharp;
    private Button btnDNote;
    private Button btnDSharp;
    private Button btnENote;
    private Button btnFNote;
    private Button btnFSharp;
    private Button btnGNote;
    private Button btnGSharp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnANote = findViewById(R.id.aNote);
        btnASharp = findViewById(R.id.aSharp);
        btnBNote = findViewById(R.id.bNote);
        btnCNote = findViewById(R.id.cNote);
        btnCSharp = findViewById(R.id.cSharp);
        btnDNote = findViewById(R.id.dNote);
        btnDSharp = findViewById(R.id.dSharp);
        btnENote = findViewById(R.id.button8);
        btnFNote = findViewById(R.id.button9);
        btnFSharp = findViewById(R.id.button10);
        btnGNote = findViewById(R.id.button11);
        btnGSharp = findViewById(R.id.button12);

        btnANote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playANote();
            }
        });
    }
}