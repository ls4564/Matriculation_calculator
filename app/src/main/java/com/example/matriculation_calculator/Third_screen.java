package com.example.matriculation_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Third_screen extends AppCompatActivity {
    TextView top_average,all_average_tv,subject,unit_tv,grade_tv,bonus_tv;
    Intent gi;
    private String str_grade = "",str_subject = "",str_unit = "",str_bonus ="",str_all_average = "";
    double[] arr;
    int btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);
        weddings();
        gi = getIntent();
        arr = gi.getDoubleArrayExtra("arr");
        btnClick = gi.getIntExtra("option",-1);

        str_subject = "Hebrew\n" + "Digits\n" + "History\n" + "Citizenship\n" + "Bible\n" + "Math\n" + "English\n";

        str_unit = "2\n" + "2\n" + "2\n" + "2\n" + "2\n" + gi.getStringExtra("Math_unit") + "\n" + gi.getStringExtra("English_unit") + "\n";

        str_grade = str_grade + gi.getStringExtra("Hebrew") + "\n" +gi.getStringExtra("Digits") + "\n";
        str_grade = str_grade + gi.getStringExtra("History") + "\n" +gi.getStringExtra("Citizenship") + "\n";
        str_grade = str_grade + gi.getStringExtra("Bible") + "\n" + gi.getStringExtra("Math_grade") + "\n";
        str_grade = str_grade + gi.getStringExtra("English_grade") + "\n";

        str_bonus = "0\n" + "0\n" + "0\n" + "0\n" + "0\n" + gi.getStringExtra("Math_bonus") + "\n" + gi.getStringExtra("English_bonus") + "\n";


        switch (btnClick)
    {
        case 1:
            op1();
            break;
        case 2:
            op1();
            op2();
            break;
        case 3:
            op1();
            op2();
            op3();
            break;
    }

        subject.setText(str_subject);
        unit_tv.setText(str_unit);
        grade_tv.setText(str_grade);
        bonus_tv.setText(str_bonus);
        top_average.setText("Best Average Grade: "+ arr[0]);
        all_average_tv.setText(str_all_average);
    }


    public void op1()
    {
        str_subject = str_subject + gi.getStringExtra("name1") + "\n";
        str_unit = str_unit + gi.getStringExtra("unit1") + "\n";
        str_grade = str_grade + gi.getStringExtra("grade1") + "\n";
        str_bonus = str_bonus + gi.getStringExtra("bonus1") + "\n";


    }
    public void op2()
    {
        str_subject = str_subject + gi.getStringExtra("name2") + "\n";
        str_unit = str_unit + gi.getStringExtra("unit2") + "\n";
        str_grade = str_grade + gi.getStringExtra("grade2") + "\n";
        str_bonus = str_bonus + gi.getStringExtra("bonus2") + "\n";

        str_all_average = String.valueOf(arr[1]) + "\n" + String.valueOf(arr[2]) + "\n" ;

    }
    public void op3()
    {
        str_subject = str_subject + gi.getStringExtra("name3") + "\n";
        str_unit = str_unit + gi.getStringExtra("unit3") + "\n";
        str_grade = str_grade + gi.getStringExtra("grade3") + "\n";
        str_bonus = str_bonus + gi.getStringExtra("bonus3") + "\n";
        str_all_average = str_all_average + String.valueOf(arr[3]) + "\n" + String.valueOf(arr[4]) + "\n";
        str_all_average = str_all_average + String.valueOf(arr[5]) + "\n" + String.valueOf(arr[6]) + "\n";

    }


    public void weddings()
    {
        top_average = findViewById(R.id.top_average_tv);
        all_average_tv = findViewById(R.id.all_average_tv);
        subject = findViewById(R.id.subject);
        unit_tv = findViewById(R.id.unit_tv);
        grade_tv = findViewById(R.id.grade_tv);
        bonus_tv = findViewById(R.id.bonus_tv);


    }

    public void go_back_2(View view)
    {
        finish();
    }
}