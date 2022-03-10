package com.example.mockpreparation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity {
    TextView txt1Grade;
    TextView txt2Finalscore;
    Button btn1retry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);




                getSupportActionBar().hide();
                txt1Grade = (TextView) findViewById(R.id.textView5);
                txt2Finalscore = (TextView) findViewById(R.id.score);
                btn1retry = (Button) findViewById(R.id.restart);
                Bundle bundle = getIntent().getExtras();
                int score = bundle.getInt("final score");
                txt2Finalscore.setText(" YOU SCORED " + score + " OUT OF " + True.fal.length);
                if (score == 9&& score==10) {
                    txt1Grade.setText("OUTSTANDING");
                } else if (score == 8) {
                    txt1Grade.setText("GOOD");
                } else if (score == 7&&score==6) {
                    txt1Grade.setText("GOOD EFFORT");
                }
                else if (score <= 5)
                {
                    txt1Grade.setText("NEED MORE IMPROVEMENT");
                }

                btn1retry.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(result.this,truefalse.class));
                        result.this.finish();
                    }
                });
            }
        }

