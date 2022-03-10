package com.example.mockpreparation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MCQs extends AppCompatActivity {
    TextView txtno1;
    TextView txtqo2;
    Button btno1;
    Button btno2;
    Button btno3;
    Button btno4;
    public ArrayList<QuizModel> quizModelArrayList;
    Random random;
    int currentscore=0;
    int Questionattempted=1;
    int currentpos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcqs);





                getSupportActionBar().hide();
                txtno1=(TextView)findViewById(R.id.textView4);
                txtqo2=(TextView)findViewById(R.id.textView8);
                btno1=(Button) findViewById(R.id.radioButton);
                btno2=(Button) findViewById(R.id.radioButton2);
                btno3=(Button) findViewById(R.id.radioButton3);
                btno4=(Button) findViewById(R.id.radioButton4);
                quizModelArrayList = new ArrayList<>();
                random =new Random();
                getQuizQuestion(quizModelArrayList);
                currentpos=random.nextInt(quizModelArrayList.size());
                setDataView(currentpos);
                btno1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if(quizModelArrayList.get(currentpos).getAnswer().trim().toLowerCase().equals(btno1.getText().toString().trim().toLowerCase()))
                        {
                            currentscore++;
                            if(Questionattempted==10)
                            {
                                Intent intent=new Intent(MCQs.this,result.class);
                                Bundle b=new Bundle();
                                b.putInt("final score",currentscore);
                                intent.putExtras(b);

                                startActivity(intent);

                            }

                            else{
                                Questionattempted++;
                                currentpos=random.nextInt(quizModelArrayList.size());
                                setDataView(currentpos);
                            }

                        }
                        else
                        {
                            if(Questionattempted==True.fal.length)
                            {
                                Intent intent=new Intent(MCQs.this,result.class);
                                Bundle b=new Bundle();
                                b.putInt("final score",currentscore);
                                intent.putExtras(b);

                                startActivity(intent);

                            }

                            else{
                                Questionattempted++;
                                currentpos=random.nextInt(quizModelArrayList.size());
                                setDataView(currentpos);
                            }
                        }

                    }
                });
                btno2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if(quizModelArrayList.get(currentpos).getAnswer().trim().toLowerCase().equals(btno2.getText().toString().trim().toLowerCase()))
                        {
                            currentscore++;
                            if(Questionattempted==True.fal.length)
                            {
                                Intent intent=new Intent(MCQs.this,result.class);
                                Bundle b=new Bundle();
                                b.putInt("final score",currentscore);
                                intent.putExtras(b);

                                startActivity(intent);

                            }

                            else{
                                Questionattempted++;
                                currentpos=random.nextInt(quizModelArrayList.size());
                                setDataView(currentpos);
                            }
                        }
                        else{

                            if(Questionattempted==True.fal.length)
                            {
                                Intent intent=new Intent(MCQs.this,result.class);
                                Bundle b=new Bundle();
                                b.putInt("final score",currentscore);
                                intent.putExtras(b);

                                startActivity(intent);

                            }

                            else{
                                Questionattempted++;
                                currentpos=random.nextInt(quizModelArrayList.size());
                                setDataView(currentpos);
                            }

                        }

                    }
                });
                btno3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if(quizModelArrayList.get(currentpos).getAnswer().trim().toLowerCase().equals(btno2.getText().toString().trim().toLowerCase()))
                        {
                            currentscore++;
                            if(Questionattempted==True.fal.length)
                            {
                                Intent intent=new Intent(MCQs.this,result.class);
                                Bundle b=new Bundle();
                                b.putInt("final score",currentscore);
                                intent.putExtras(b);

                                startActivity(intent);

                            }

                            else{
                                Questionattempted++;
                                currentpos=random.nextInt(quizModelArrayList.size());
                                setDataView(currentpos);
                            }
                        }
                        else{

                            if(Questionattempted==True.fal.length)
                            {
                                Intent intent=new Intent(MCQs.this,result.class);
                                Bundle b=new Bundle();
                                b.putInt("final score",currentscore);
                                intent.putExtras(b);

                                startActivity(intent);

                            }

                            else{
                                Questionattempted++;
                                currentpos=random.nextInt(quizModelArrayList.size());
                                setDataView(currentpos);
                            }

                        }
                    }
                });
                btno4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(quizModelArrayList.get(currentpos).getAnswer().trim().toLowerCase().equals(btno2.getText().toString().trim().toLowerCase()))
                        {
                            currentscore++;
                            if(Questionattempted==True.fal.length)
                            {
                                Intent intent=new Intent(MCQs.this,result.class);
                                Bundle b=new Bundle();
                                b.putInt("final score",currentscore);
                                intent.putExtras(b);

                                startActivity(intent);

                            }

                            else{
                                Questionattempted++;
                                currentpos=random.nextInt(quizModelArrayList.size());
                                setDataView(currentpos);
                            }
                        }
                        else{

                            if(Questionattempted==True.fal.length)
                            {
                                Intent intent=new Intent(MCQs.this,result.class);
                                Bundle b=new Bundle();
                                b.putInt("final score",currentscore);
                                intent.putExtras(b);

                                startActivity(intent);

                            }

                            else{
                                Questionattempted++;
                                currentpos=random.nextInt(quizModelArrayList.size());
                                setDataView(currentpos);
                            }

                        }
                    }
                });
            }
            private void setDataView(int currentpos)
            {

                txtno1.setText("Questions Attempted : "+Questionattempted+ "/10");


                    txtqo2.setText(quizModelArrayList.get(currentpos).getQuestion());
                    btno1.setText(quizModelArrayList.get(currentpos).getOption1());
                    btno2.setText(quizModelArrayList.get(currentpos).getOption2());
                    btno3.setText(quizModelArrayList.get(currentpos).getOption3());
                    btno4.setText(quizModelArrayList.get(currentpos).getOption4());

            }

            private void getQuizQuestion(ArrayList<QuizModel>quizModelArrayList) {
                quizModelArrayList.add(new QuizModel("Android is -","an operating system","a web ","a web server","non of above","an operating system"));
                quizModelArrayList.add(new QuizModel("Under which of the following Android is licensed?","OSS","Sourceforge","Apache/MIT","None of the above","Apache/MIT"));
                quizModelArrayList.add(new QuizModel("For which of the following Android is mainly developed?","Servers","","Desktops","Mobile devices","Mobile device"));
                quizModelArrayList.add(new QuizModel("Which of the following is not a state in the service lifecycle?","Destroyed","Start","Paused","Running","Paused"));
                quizModelArrayList.add(new QuizModel("Which of the following is not a nickname of any android version?","Donut","Muffin","Honeycomb","Cupcake","Muffin"));
                quizModelArrayList.add(new QuizModel(" Which of the following virtual machine is used by the Android operating system?","JVM","Dalvik virtual machine","Simple virtual machine","None of the above","Dalvik virtual machine"));
                quizModelArrayList.add(new QuizModel(" Which of the following android version is named Jelly Bean?","3.1","2.1","1.1","4.1","4.1"));
                quizModelArrayList.add(new QuizModel("Which of the following converts Java byte code into Dalvik byte code?","Dalvik converter","Dex compiler","Mobile interpretive compiler (MIC)","None of the above","Dex compiler"));
                quizModelArrayList.add(new QuizModel("What is an activity in android?","","android class","A single screen in an application with supporting java code","None of the above","A single screen in an application with supporting java code"));
                quizModelArrayList.add(new QuizModel("Which of the following kernel is used in Android? ","Windows","Windows","Linux","Redhat"," Linux"));
            }
        }

