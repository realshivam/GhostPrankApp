package com.prefycs.ghostprankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;

import java.io.IOException;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final MediaPlayer m = MediaPlayer.create(this, R.raw.screaming_of_a_girl);

        final Vibrator v = (Vibrator) Main2Activity.this.getSystemService(this.VIBRATOR_SERVICE);


        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                v.vibrate(520000);
                m.start();
                m.setLooping(true);
                setwall();


            }
        },200);




    }


    private void setwall() {

        Bitmap bp = BitmapFactory.decodeResource(getResources(), R.drawable.wall);
        WallpaperManager man = WallpaperManager.getInstance(getApplicationContext());

        try {
            man.setBitmap(bp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
