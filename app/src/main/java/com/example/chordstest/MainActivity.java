package com.example.chordstest;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer btest = MediaPlayer.create(this, R.raw.maj_c_c);
        final MediaPlayer b2test = MediaPlayer.create(this, R.raw.maj_c_d);
        final MediaPlayer b3test = MediaPlayer.create(this, R.raw.maj_c_e);
        final MediaPlayer b4test = MediaPlayer.create(this, R.raw.maj_c_f);

        final Button button= this.findViewById(R.id.btest);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btest.start();
            }
        });
        final Button button2= this.findViewById(R.id.b2test);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2test.start();
            }
        });
        final Button button3= this.findViewById(R.id.b3test);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3test.start();
            }

        });
        final Button button4= this.findViewById(R.id.b4test);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4test.start();
            }
        });
    }}