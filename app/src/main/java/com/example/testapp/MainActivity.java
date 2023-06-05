package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
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

    @SuppressLint("MissingInflatedId")
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
        btnENote = findViewById(R.id.eNote);
        btnFNote = findViewById(R.id.fNote);
        btnFSharp = findViewById(R.id.fSharp);
        btnGNote = findViewById(R.id.gNote);
        btnGSharp = findViewById(R.id.gSharp);

        btnANote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {playANote();}
        });

        btnASharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {playASharp();}
        });

        btnBNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {playBNote();}
        });

        btnCNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {playCNote();}
        });

        btnCSharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {playCSharp();}
        });

        btnDNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {playDNote();}
        });

        btnDSharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {playDSharp();}
        });

        btnENote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {playENote();}
        });

        btnFNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {playFNote();}
        });

        btnFSharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {playFSpharp();}
        });

        btnGNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {playGNote();}
        });

        btnGSharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {playGSharp();}
        });
    }

    private void playGSharp() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.gsharp);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playGNote() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.gnote);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playFSpharp() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.fsharp);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playFNote() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.fnote);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playENote() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.enote);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playDSharp() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.dsharp);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playDNote() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.dnote);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playCSharp() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.csharp);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playCNote() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.cnote);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playBNote() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.bnote);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playASharp() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.asharp);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playANote() {
        MediaPlayer mp = MediaPlayer.create( this, R.raw.anote);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }
}