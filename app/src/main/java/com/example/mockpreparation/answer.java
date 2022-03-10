package com.example.mockpreparation;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class answer extends AppCompatActivity {
ImageView m1,m2,m3,m4;
TextView t1,t2,t3,t4,t5,t6;
String[] answer,question;
int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);
        m1=(ImageView) findViewById(R.id.imageView8);
        m2=(ImageView) findViewById(R.id.imageView);
        m3=(ImageView) findViewById(R.id.imageView9);
        m4=(ImageView) findViewById(R.id.imageView5);
        t1=(TextView) findViewById(R.id.textView13);
        t2=(TextView) findViewById(R.id.textView12);
        t3=(TextView) findViewById(R.id.textView15);
        t4=(TextView) findViewById(R.id.textView21);
        t5=(TextView) findViewById(R.id.textView18);
        t6=(TextView) findViewById(R.id.textView16);
        question=getResources().getStringArray(R.array.ques);
        for (String s : answer = getResources().getStringArray(R.array.ans)) {

        }

        m3.setOnClickListener(((View.OnClickListener) this)::onClick);
        m4.setOnClickListener(((View.OnClickListener) this)::onClick);
        m1.setOnClickListener(((View.OnClickListener) this)::onClick);


};


    public void onClick(View view) {
        index = 0;
        t2.setText(String.valueOf(index + 1));
        t4.setText(question[index]);

switch (view.getId())
{
    case R.id.imageView8:
        if(index>0) {
            t6.setText("Select 'A' for answer");
            t2.setText(String.valueOf(index - 1));
            t4.setText(question[index - 1]);
            index--;
            m3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    t6.setText(answer[index-1]);


                }

            });
        }
        else
            {
                Context context = getApplicationContext();

                String text = "enter the right arrow";

                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);

                toast.show();
            }

        break;
    case R.id.imageView5:
        if(index<10) {
            t6.setText("Select 'A' for answer");
            t2.setText(String.valueOf(index + 1));
            t4.setText(question[index]);
            index++;
            m3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    t6.setText(answer[index]);


                }

            });
        }
        else {
            Intent intent=new Intent(answer.this,ques.class);
            startActivity(intent);
        }
        break;
    case R.id.imageView9:
        t6.setText(answer[index]);
        break;
}



        }
    }
