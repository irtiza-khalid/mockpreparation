package com.example.mockpreparation;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView b;
    TextView t;
    Animation  anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(ImageView) findViewById(R.id.imageView2);
        t=(TextView) findViewById(R.id.textView6);
        anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
        t.setVisibility(View.VISIBLE);
        t.startAnimation(anim);
        anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
        b.setVisibility(View.VISIBLE);
        b.startAnimation(anim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, ques.class);
               startActivity(intent);
               onBackPressed();
            }
        },3000);

    }
}