package com.example.chordstest;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button,button2,button3,button4;
    private SoundPool soundPool;
    private int sound1,sound2,sound3,sound4;
    Animation sup,sdow;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.btest);
        button2=(Button) findViewById(R.id.b2test);
        button3=(Button) findViewById(R.id.b3test);
        button4=(Button) findViewById(R.id.b4test);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        }   else {
            soundPool= new SoundPool(5, AudioManager.STREAM_MUSIC , 0);
        }
        sound1=soundPool.load(this, R.raw.maj_c_c,1);
        sound2=soundPool.load(this, R.raw.maj_c_d,1);
        sound3=soundPool.load(this, R.raw.maj_c_e,1);
        sound4=soundPool.load(this, R.raw.maj_c_f,1);

        sup = AnimationUtils.loadAnimation(this,R.anim.anim);
        sdow = AnimationUtils.loadAnimation(this,R.anim.anim2);
/**
        {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Enable System Volume",
                    Toast.LENGTH_LONG);

            toast.show();
        }
 **/

        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    button.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    button.startAnimation(sdow);
                }
                return false;

            }

        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound1,1,1,0,0,1);
            }
        });




        button2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    button2.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    button2.startAnimation(sdow);
                }
                return false;

            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound2,1,1,0,0,1);
            }
        });
        button3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    button3.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    button3.startAnimation(sdow);
                }
                return false;

            }

        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound3,1,1,0,0,1);
            }

        });
        button4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == motionEvent.ACTION_DOWN) {
                    button4.startAnimation(sup);
                } else if (motionEvent.getAction() == motionEvent.ACTION_UP) {
                    button4.startAnimation(sdow);
                }
                return false;

            }

        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound4,1,1,0,0,1);
            }
        });
    }}
