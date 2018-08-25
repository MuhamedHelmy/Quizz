package com.example.mohamed_abdelsamad.quizz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
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
        Toast.makeText(MainActivity.this, getString(R.string.message2) + score
                , Toast.LENGTH_SHORT).show();
    }

    //getscore method
    private int getScore() {
        int score = 0;
        RadioGroup radioGroup = findViewById(R.id.radiogroub1);
        RadioGroup radioGroup1 = findViewById(R.id.radiogrobe2);
        RadioGroup radioGroup2 = findViewById(R.id.radiogroub3);
        CheckBox checkBox = findViewById(R.id.q4a1);
        CheckBox checkBox2 = findViewById(R.id.q4a3);
        CheckBox checkBox3 = findViewById(R.id.q5a1);
        CheckBox checkBox4 = findViewById(R.id.q5a2);
        CheckBox checkBox5 = findViewById(R.id.q5a3);
        CheckBox checkBox6 = findViewById(R.id.q5a4);
        CheckBox checkBox7 = findViewById(R.id.q4a2);
        EditText answer = findViewById(R.id.edittext);

        if (radioGroup.getCheckedRadioButtonId() == R.id.q1a2) {
            score += 1;
        }
        if (radioGroup1.getCheckedRadioButtonId() == R.id.q2a3) {
            score += 1;
        }
        if (radioGroup2.getCheckedRadioButtonId() == R.id.q3a1) {
            score += 1;
        }
        if (checkBox.isChecked() && checkBox2.isChecked() && !checkBox7.isChecked()) {
            score += 1;
        }
        if (checkBox3.isChecked() && checkBox4.isChecked() && checkBox5.isChecked() && !checkBox6.isChecked()) {
            score += 1;
        }
        if (answer.getText().toString().equalsIgnoreCase("Relative") || answer.getText().toString().equalsIgnoreCase("Relative layout") ||
                answer.getText().toString().equalsIgnoreCase(" Relative layout") || answer.getText().toString().equalsIgnoreCase(" Relative")
                || answer.getText().toString().equalsIgnoreCase("Relative ")) {
            score += 1;
        } else
            Toast.makeText(MainActivity.this, getString(R.string.toastmessage1), Toast.LENGTH_SHORT).show();

        return score;
    }
}
