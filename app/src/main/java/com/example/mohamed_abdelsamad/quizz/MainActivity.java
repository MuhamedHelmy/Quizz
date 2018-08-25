package com.example.mohamed_abdelsamad.quizz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
  // button  click method
    public void checkAnswer(View v) {
        int score = getScore();
        Toast.makeText(MainActivity.this, "Your score is : " + score
                , Toast.LENGTH_SHORT).show();
    }
    //getscore method
    private int getScore() {
        int score = 0;
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroub1);
        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radiogrobe2);
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radiogroub3);
        CheckBox checkBox = (CheckBox) findViewById(R.id.q4a1);


        CheckBox checkBox2 = (CheckBox) findViewById(R.id.q4a3);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.q5a1);

        CheckBox checkBox4 = (CheckBox) findViewById(R.id.q5a2);
        CheckBox checkBox5 = (CheckBox) findViewById(R.id.q5a3);


        if (radioGroup.getCheckedRadioButtonId() == R.id.q1a2) {
            score += 1;
        }
        if (radioGroup1.getCheckedRadioButtonId() == R.id.q2a3) {
            score += 1;
        }
        if (radioGroup2.getCheckedRadioButtonId() == R.id.q3a1) {
            score += 1;
        }
        if (checkBox.isChecked() && checkBox2.isChecked()) {
            score += 1;
        }
        if (checkBox3.isChecked() && checkBox4.isChecked() && checkBox5.isChecked()) {
            score += 1;
        }

        return score;
    }
}
