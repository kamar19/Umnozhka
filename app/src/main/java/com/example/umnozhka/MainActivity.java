package com.example.umnozhka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import static com.example.umnozhka.R.id.textViewAnswerShow1;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//    String[] data = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};
//
//    GridView gvMain;
//    ArrayAdapter<String> adapter;
    SharedPreferences sharedPreferences;

    Button buttonDigit1,buttonDigit2,buttonDigit3,buttonDigit4,buttonDigit5,buttonDigit6,buttonDigit7,buttonDigit8,buttonDigit9,
        buttonDigit0,buttonEnter;
    TextView textViewAnswerShow1,textViewAnswerShow2,textViewAnswerShow3,textViewAnswerShow4,textViewAnswerShow5,textViewAnswerShow6,
             textViewAnswerShow7,textViewAnswerShow8,textViewAnswerShow9,textViewAnswerShow10,textViewAnswerShow11,textViewAnswerShow12,
             textViewQuestion, textViewAnswerShowBasic;
    int currentOneUnit,currentTwoUnit;


    public int getCurrentOneUnit() {
        return currentOneUnit;
    }

    public void setCurrentOneUnit(int currentOneUnit) {
        this.currentOneUnit = currentOneUnit;
    }

    public int getCurrentTwoUnit() {
        return currentTwoUnit;
    }

    public void setCurrentTwoUnit(int currentTwoUnit) {
        this.currentTwoUnit = currentTwoUnit;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main );

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
        textViewAnswerShow1.setText("");
        textViewAnswerShow2 = findViewById(R.id.textViewAnswerShow2);
        textViewAnswerShow2.setText("");
        textViewAnswerShow3 = findViewById(R.id.textViewAnswerShow3);
        textViewAnswerShow3.setText("");
        textViewAnswerShow4 = findViewById(R.id.textViewAnswerShow4);
        textViewAnswerShow4.setText("");
        textViewAnswerShow5 = findViewById(R.id.textViewAnswerShow5);
        textViewAnswerShow5.setText("");
        textViewAnswerShow6 = findViewById(R.id.textViewAnswerShow6);
        textViewAnswerShow6.setText("");
        textViewAnswerShow7 = findViewById(R.id.textViewAnswerShow7);
        textViewAnswerShow7.setText("");
        textViewAnswerShow8 = findViewById(R.id.textViewAnswerShow8);
        textViewAnswerShow8.setText("");
        textViewAnswerShow9 = findViewById(R.id.textViewAnswerShow9);
        textViewAnswerShow9.setText("");
        textViewAnswerShow10 = findViewById(R.id.textViewAnswerShow10);
        textViewAnswerShow10.setText("");
        textViewAnswerShow11 = findViewById(R.id.textViewAnswerShow11);
        textViewAnswerShow11.setText("");
        textViewAnswerShow12 = findViewById(R.id.textViewAnswerShow12);
        textViewAnswerShow12.setText("");
        textViewAnswerShowBasic = findViewById(R.id.textViewAnswerShowBasic);

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

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

//        MenuItem mi = menu.add(0, 1, 0, "Preferences");
//        mi.setIntent(new Intent(this, PrefActivity.class));
//        return super.onCreateOptionsMenu(menu);
        return true;
    }





    @Override
    public void onClick(View v) {
        String tempQuestion= textViewAnswerShowBasic.getText().toString();
        switch (v.getId()){
            case R.id.buttonDigit1:
                textViewAnswerShowBasic.setText(tempQuestion+"1");
                break;
            case R.id.buttonDigit2:
                textViewAnswerShowBasic.setText(tempQuestion+"2");
                break;
            case R.id.buttonDigit3:
                textViewAnswerShowBasic.setText(tempQuestion+"3");
                break;
            case R.id.buttonDigit4:
                textViewAnswerShowBasic.setText(tempQuestion+"4");
                break;
            case R.id.buttonDigit5:
                textViewAnswerShowBasic.setText(tempQuestion+"5");
                break;
            case R.id.buttonDigit6:
                textViewAnswerShowBasic.setText(tempQuestion+"6");
                break;
            case R.id.buttonDigit7:
                textViewAnswerShowBasic.setText(tempQuestion+"7");
                break;
            case R.id.buttonDigit8:
                textViewAnswerShowBasic.setText(tempQuestion+"8");
                break;
            case R.id.buttonDigit9:
                textViewAnswerShowBasic.setText(tempQuestion+"9");
                break;
            case R.id.buttonDigit0:
                textViewAnswerShowBasic.setText(tempQuestion+"0");
                break;
            case R.id.buttonEnter:
                //выполняется проверка Ответа на математический Вопрос

//                textViewQuestion.setText(textViewQuestion.getText()+"1");
                break;


        }


    }
    private void generateUnits(){
        // в зависимости от настроек, создает ткущие числа и действие между ними


    }


    //Возвращаем //Нужно определиться или да/нет, или цифру и сравниваем сами цифру
//    private void

}
