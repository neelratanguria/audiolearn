package com.flameshot.audio_learn;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    Button buttonPlay;
    Button buttonPause;
    boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonPlay = findViewById(R.id.play);
        buttonPause = findViewById(R.id.pause);
    }

    public void play(View view)
    {
        if (isPlaying)
        {
            mediaPlayer.pause();
            buttonPlay.animate().translationXBy(-195f).setDuration(150);
            buttonPlay.setText("Play");
            isPlaying = false;
        }
        else
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.alert);
            mediaPlayer.start();
            buttonPlay.animate().translationXBy(195f).setDuration(150);
            buttonPlay.setText("Stop");
            isPlaying = true;
        }
    }

    public void pause(View view)
    {
    }
}
