package com.example.mockpreparation;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ques<quesActivity> extends AppCompatActivity {
Button b6,b2,b3,b4;
TextView t;
Animation anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques);
        b6= (Button) findViewById(R.id.button4);
        anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
        b6.setVisibility(View.VISIBLE);
        b6.startAnimation(anim);
        t= (TextView) findViewById(R.id.button4);
        anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);t.setVisibility(View.VISIBLE);
        t.startAnimation(anim);

        b2= (Button) findViewById(R.id.button);
        anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
        b2.setVisibility(View.VISIBLE);
        b2.startAnimation(anim);

        b3= (Button) findViewById(R.id.button3);
        anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
        b3.setVisibility(View.VISIBLE);
        b3.startAnimation(anim);

        b4= (Button) findViewById(R.id.button2);
        anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
        b4.setVisibility(View.VISIBLE);
        b4.startAnimation(anim);

       b6.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent intent=new Intent(ques.this,ans.class);
               startActivity(intent);
           }
       });
       b3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(ques.this,truefalse.class);
               startActivity(intent);

           }
       });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri= Uri.parse("https://developer.android.com/guide/topics/manifest/application-element#:~:text=Whether%20or%20not%20the%20Android%20system%20can%20instantiate,overrides%20the%20component-specific%20values%3B%20all%20components%20are%20disabled.");
            Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent);
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ques.this,MCQs.class);
                        startActivity(intent);
            }
        });
    }
}