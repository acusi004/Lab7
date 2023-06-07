package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity_quat extends AppCompatActivity {

  ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_quat);
        Button fast = findViewById(R.id.btn_fast);
        Button medium = findViewById(R.id.btn_medium);
        Button slow = findViewById(R.id.btn_slow);
        Button off = findViewById(R.id.btn_off);
        imageView = findViewById(R.id.anim_quat);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.quat);


        fast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                starFan(200);
            }
        });
        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                starFan(800);
            }
        });
        slow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                starFan(2000);
            }
        });
        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopFan();
            }
        });





    }
        public void starFan(long time) {
            Runnable runnable = new Runnable(){

                @Override
                public void run() {
                    imageView.animate().rotationBy(360).withEndAction(this).setDuration(time).setInterpolator(new LinearInterpolator())
                            .start();
                }
            };
            imageView.animate().rotationBy(360).withEndAction(runnable).setDuration(time).setInterpolator(new LinearInterpolator())
                    .start();
        }

        public void stopFan(){
            imageView.animate().cancel();
        }


    }


