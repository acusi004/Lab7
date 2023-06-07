package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class animation_dangnhap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation_dangnhap);

        ImageView imageView = findViewById(R.id.anim_imageView);
        TextView textView= findViewById(R.id.anim_Welcome);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_dang_nhap);
        imageView.setAnimation(animation);
        textView.setAnimation(animation);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                startActivity(new Intent(animation_dangnhap.this, MainActivity_quat.class));
                finish();
            }
        },3000);
    }
}