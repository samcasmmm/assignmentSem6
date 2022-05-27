package com.example.question7;


import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView  play_btn, pause_btn;
    MediaPlayer mediaPlayer;
    Handler handler = new Handler();
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play_btn = findViewById(R.id.play);
        pause_btn = findViewById(R.id.pause);

        mediaPlayer = MediaPlayer.create(this,R.raw.tokyo_drift);

        play_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play_btn.setVisibility(View.GONE);
                pause_btn.setVisibility(View.VISIBLE);
                mediaPlayer.start();
                handler.postDelayed(runnable,0);
            }
        });

        pause_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pause_btn.setVisibility(View.GONE);
                play_btn.setVisibility(View.VISIBLE);
                mediaPlayer.pause();
                handler.removeCallbacks(runnable);
            }
        });

    }

}