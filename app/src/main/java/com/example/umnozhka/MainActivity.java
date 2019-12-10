package com.example.umnozhka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//    String[] data = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};
//
//    GridView gvMain;
//    ArrayAdapter<String> adapter;
    Button buttonDigit1,buttonDigit2,buttonDigit3,buttonDigit4,buttonDigit5,buttonDigit6,buttonDigit7,buttonDigit8,buttonDigit9,
        buttonDigit0,buttonEnter;
    TextView textViewAnswerShow1,textViewAnswerShow2,textViewAnswerShow3,textViewAnswerShow4,textViewAnswerShow5,textViewAnswerShow6,
             textViewAnswerShow7,textViewAnswerShow8,textViewAnswerShow9,textViewAnswerShow10,textViewAnswerShow11,textViewAnswerShow12,
             textViewQuestion, textViewAnswerBasic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDigit1 = findViewById(R.id.buttonDigit1);
        buttonDigit2 = findViewById(R.id.buttonDigit2);
        buttonDigit3 = findViewById(R.id.buttonDigit3);
        buttonDigit4 = findViewById(R.id.buttonDigit4);
        buttonDigit5 = findViewById(R.id.buttonDigit5);
        buttonDigit6 = findViewById(R.id.buttonDigit6);
        buttonDigit7 = findViewById(R.id.buttonDigit7);
        buttonDigit8 = findViewById(R.id.buttonDigit8);
        buttonDigit9 = findViewById(R.id.buttonDigit9);
        buttonDigit0 = findViewById(R.id.buttonDigit0);
        buttonEnter = findViewById(R.id.buttonEnter);
        textViewAnswerShow1 = findViewById(R.id.textViewAnswerShow1);
        textViewAnswerShow2 = findViewById(R.id.textViewAnswerShow2);
        textViewAnswerShow3 = findViewById(R.id.textViewAnswerShow3);
        textViewAnswerShow4 = findViewById(R.id.textViewAnswerShow4);
        textViewAnswerShow5 = findViewById(R.id.textViewAnswerShow5);
        textViewAnswerShow6 = findViewById(R.id.textViewAnswerShow6);
        textViewAnswerShow7 = findViewById(R.id.textViewAnswerShow7);
        textViewAnswerShow8 = findViewById(R.id.textViewAnswerShow8);
        textViewAnswerShow9 = findViewById(R.id.textViewAnswerShow9);
        textViewAnswerShow10 = findViewById(R.id.textViewAnswerShow10);
        textViewAnswerShow11 = findViewById(R.id.textViewAnswerShow11);
        textViewAnswerShow12 = findViewById(R.id.textViewAnswerShow12);
        textViewAnswerBasic = findViewById(R.id.textViewAnswerShowBasic);
        textViewQuestion  = findViewById(R.id.textViewQuestion);

        buttonDigit1.setOnClickListener(this);
        buttonDigit2.setOnClickListener(this);
        buttonDigit3.setOnClickListener(this);
        buttonDigit4.setOnClickListener(this);
        buttonDigit5.setOnClickListener(this);
        buttonDigit6.setOnClickListener(this);
        buttonDigit7.setOnClickListener(this);
        buttonDigit8.setOnClickListener(this);
        buttonDigit9.setOnClickListener(this);
        buttonDigit0.setOnClickListener(this);
        buttonEnter.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonDigit1:
                textViewQuestion.setText(textViewQuestion.getText()+"1");
                break;
            case R.id.buttonDigit2:
                textViewQuestion.setText(textViewQuestion.getText()+"2");
                break;
            case R.id.buttonDigit3:
                textViewQuestion.setText(textViewQuestion.getText()+"3");
                break;
            case R.id.buttonDigit4:
                textViewQuestion.setText(textViewQuestion.getText()+"4");
                break;
            case R.id.buttonDigit5:
                textViewQuestion.setText(textViewQuestion.getText()+"5");
                break;
            case R.id.buttonDigit6:
                textViewQuestion.setText(textViewQuestion.getText()+"6");
                break;
            case R.id.buttonDigit7:
                textViewQuestion.setText(textViewQuestion.getText()+"7");
                break;
            case R.id.buttonDigit8:
                textViewQuestion.setText(textViewQuestion.getText()+"8");
                break;
            case R.id.buttonDigit9:
                textViewQuestion.setText(textViewQuestion.getText()+"9");
                break;
            case R.id.buttonDigit0:
                textViewQuestion.setText(textViewQuestion.getText()+"0");
                break;
            case R.id.buttonEnter:
                //выполняется проверка Ответа на математический Вопрос

//                textViewQuestion.setText(textViewQuestion.getText()+"1");
                break;


        }

    }
    //Возвращаем //Нужно определиться или да/нет, или цифру и сравниваем сами цифру
//    private void

}
