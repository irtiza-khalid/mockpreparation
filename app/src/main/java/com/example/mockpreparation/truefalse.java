package com.example.mockpreparation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class truefalse extends AppCompatActivity {
ImageView i1,i2,i3,i4;
TextView t1,t2,t3;
Animation ani,ani2;
String[] st,st2;
public int index=0;
boolean answer;

   public int sum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truefalse);
        i1=(ImageView)findViewById(R.id.imageView4);
        i2=(ImageView)findViewById(R.id.imageView6);
        i3=(ImageView)findViewById(R.id.imageView7);
        i4=(ImageView)findViewById(R.id.imageView10);
        t1=(TextView) findViewById(R.id.textView2);
        t3=(TextView) findViewById(R.id.textView3);
        t2=(TextView) findViewById(R.id.textView4);
        ani= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
        i1.setVisibility(View.VISIBLE);
        i1.startAnimation(ani);
        ani2= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
        t1.setVisibility(View.VISIBLE);
        t1.startAnimation(ani2);

updateQuestion();
        t2.setText("00");


       // t3.setText(st[index]);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                if(answer==true)
                {
                  sum++;

                    t2.setText(String.valueOf(sum));
                   if(index==True.fal.length)
                   {
                       Intent intent=new Intent(truefalse.this,result.class);
                       Bundle b=new Bundle();
                       b.putInt("final score",sum);
                       intent.putExtras(b);

                       startActivity(intent);

                   }
                   else
                   {
                       updateQuestion();
                   }
                }
                else
                {

                    if(index==True.fal.length)
                    {
                        Intent intent=new Intent(truefalse.this,result.class);
                        Bundle b=new Bundle();
                        b.putInt("final score",sum);
                        intent.putExtras(b);

                        startActivity(intent);

                    }
                    else
                    {
                        updateQuestion();
                    }

                }

            }

        });

         i2.setOnClickListener(new View.OnClickListener() {
             @Override

             public void onClick(View view) {

                 if(answer== false)
                 {
                      sum++;
                     t2.setText(String.valueOf(sum));

                     if(index==True.fal.length)
                     {
                         Intent intent=new Intent(truefalse.this,result.class);
                         Bundle b=new Bundle();
                         b.putInt("final score",sum);
                         intent.putExtras(b);
                         truefalse.this.finish();
                         startActivity(intent);

                     }
                     else
                     {
                         updateQuestion();
                     }


                 }
                 else
                 {


                     if(index==True.fal.length)
                     {
                         Intent intent=new Intent(truefalse.this,result.class);
                         Bundle b=new Bundle();
                         b.putInt("final score",sum);
                         intent.putExtras(b);
                         truefalse.this.finish();
                         startActivity(intent);

                     }
                     else
                     {
                         updateQuestion();
                     }

                 }
             }
             });



    }
    public void updateQuestion()
    {
        t3.setText(True.fal[index]);
        answer= True.tru[index];
        index++;
    }

}