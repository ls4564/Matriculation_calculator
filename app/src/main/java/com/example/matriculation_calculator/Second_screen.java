package com.example.matriculation_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Second_screen extends AppCompatActivity {
    EditText eD_1_2_pg2, eD_1_3_pg2, eD_2_2_pg2, eD_2_3_pg2, eD_3_1_pg2, eD_3_2_pg2, eD_3_3_pg2, eD_4_1_pg2, eD_4_2_pg2, eD_4_3_pg2, eD_5_1_pg2, eD_5_2_pg2, eD_5_3_pg2;
    Button btn_op1, btn_op2, btn_op3, btn_for_pg2_to_pg3;
    boolean canSkip = false,first = true;
    int btnClick = 0, units,anass;
    double[] arr = {-1,-1,-1,-1,-1,-1,-1};
    double sum_grade;
    private String str_1_2,str_1_3,str_2_2,str_2_3,str_3_1,str_3_2,str_3_3,str_4_1,str_4_2,str_4_3,str_5_1,str_5_2,str_5_3;
    private int num_1_2,num_1_3,num_2_2,num_2_3,num_3_2,num_3_3,num_4_2,num_4_3,num_5_2,num_5_3;
    Intent gi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        weddings();

        gi = getIntent();
        sum_grade = gi.getDoubleExtra("sum_grade", -1);
        units = gi.getIntExtra("units", -1);
    }



    public void first_op(View view) {
        eD_3_1_pg2.setVisibility(View.VISIBLE);
        eD_3_2_pg2.setVisibility(View.VISIBLE);
        eD_3_3_pg2.setVisibility(View.VISIBLE);
        eD_4_1_pg2.setVisibility(View.INVISIBLE);
        eD_4_2_pg2.setVisibility(View.INVISIBLE);
        eD_4_3_pg2.setVisibility(View.INVISIBLE);
        eD_5_1_pg2.setVisibility(View.INVISIBLE);
        eD_5_2_pg2.setVisibility(View.INVISIBLE);
        eD_5_3_pg2.setVisibility(View.INVISIBLE);
        btn_op2.setVisibility(View.INVISIBLE);
        btn_op3.setVisibility(View.INVISIBLE);
        btnClick = 1;
        btn_for_pg2_to_pg3.setVisibility(View.VISIBLE);
    }



    public void second_op(View view) {
        eD_3_1_pg2.setVisibility(View.VISIBLE);
        eD_3_2_pg2.setVisibility(View.VISIBLE);
        eD_3_3_pg2.setVisibility(View.VISIBLE);
        eD_4_1_pg2.setVisibility(View.VISIBLE);
        eD_4_2_pg2.setVisibility(View.VISIBLE);
        eD_4_3_pg2.setVisibility(View.VISIBLE);
        eD_5_1_pg2.setVisibility(View.INVISIBLE);
        eD_5_2_pg2.setVisibility(View.INVISIBLE);
        eD_5_3_pg2.setVisibility(View.INVISIBLE);
        btn_op1.setVisibility(View.INVISIBLE);
        btn_op3.setVisibility(View.INVISIBLE);
        btnClick = 2;
        btn_for_pg2_to_pg3.setVisibility(View.VISIBLE);
    }



    public void third_op(View view) {
        eD_3_1_pg2.setVisibility(View.VISIBLE);
        eD_3_2_pg2.setVisibility(View.VISIBLE);
        eD_3_3_pg2.setVisibility(View.VISIBLE);
        eD_4_1_pg2.setVisibility(View.VISIBLE);
        eD_4_2_pg2.setVisibility(View.VISIBLE);
        eD_4_3_pg2.setVisibility(View.VISIBLE);
        eD_5_1_pg2.setVisibility(View.VISIBLE);
        eD_5_2_pg2.setVisibility(View.VISIBLE);
        eD_5_3_pg2.setVisibility(View.VISIBLE);
        btn_op1.setVisibility(View.INVISIBLE);
        btn_op2.setVisibility(View.INVISIBLE);
        btnClick = 3;
        btn_for_pg2_to_pg3.setVisibility(View.VISIBLE);
    }








    public void Next_page_3(View view) {
        Reset_variables();


        //Math
        str_1_2 = eD_1_2_pg2.getText().toString();
        str_1_3 = eD_1_3_pg2.getText().toString();
        if (!str_1_2.isEmpty() && !str_1_3.isEmpty()) {
            num_1_2 = Integer.parseInt(str_1_2);
            num_1_3 = Integer.parseInt(str_1_3);

            if (check_units_legal(num_1_2) && check_grade_legal(num_1_3)) {
                //English
                str_2_2 = eD_2_2_pg2.getText().toString();
                str_2_3 = eD_2_3_pg2.getText().toString();
                if (!str_2_2.isEmpty() && !str_2_3.isEmpty()) {
                    num_2_2 = Integer.parseInt(str_2_2);
                    num_2_3 = Integer.parseInt(str_2_3);

                    if (check_units_legal(num_2_2) && check_grade_legal(num_2_3)) {
                        switch (btnClick) {
                            case 1:
                                canSkip = check_one_line();
                                anass = 1;
                                break;
                            case 2:
                                canSkip = check_two_line();
                                anass = 3;
                                break;
                            case 3:
                                canSkip = check_three_line();
                                anass = 7;
                                break;
                        }

                        if(canSkip)
                        {
                            units = units + num_1_2;
                            num_1_3 = bonus(num_1_3,num_1_2,true);
                            sum_grade = sum_grade + (num_1_3 * num_1_2);

                            units = units + num_2_2;
                            num_2_3 = bonus(num_2_3,num_2_2,true);
                            sum_grade = sum_grade + (num_2_3 * num_2_2);

                            num_3_3 = bonus(num_3_3,num_3_2,false);
                            num_3_3 = (num_3_3 * num_3_2);
                            arr[0] = (sum_grade + num_3_3)/(units + num_3_2);

                            switch (btnClick)
                            {
                                case 2:
                                    arr = caulation_ans_op2(arr);
                                    break;
                                case 3:
                                    arr = caulation_ans_op2(arr);
                                    num_5_3 = bonus(num_5_3,num_5_2,false);
                                    num_5_3 = (num_5_3 * num_5_2);
                                    arr[3] = (sum_grade + num_5_3)/(units+num_5_2);
                                    arr[4] = (sum_grade + num_5_3 + num_4_3)/(units + num_5_2 + num_4_2);
                                    arr[5] = (sum_grade + num_5_3 + num_4_3)/(units + num_5_2 + num_4_2);
                                    arr[6] = (sum_grade + num_5_3 + num_4_3 + num_3_3)/(units + num_5_2 + num_4_2 + num_3_2);

                                    break;
                            }
                            arr = sort_arr(arr);

                            Intent nl = new Intent(this, Third_screen.class);
                            nl.putExtra("Hebrew",gi.getStringExtra("Hebrew"));
                            nl.putExtra("Digits",gi.getStringExtra("Digits"));
                            nl.putExtra("History",gi.getStringExtra("History"));
                            nl.putExtra("Citizenship",gi.getStringExtra("Citizenship"));
                            nl.putExtra("Bible",gi.getStringExtra("Bible"));

                            nl.putExtra("Math_grade",str_1_3);
                            nl.putExtra("Math_unit",str_1_2);
                            nl.putExtra("Math_bonus",get_value_of_bonus(num_1_2,true));

                            nl.putExtra("English_grade",str_2_3);
                            nl.putExtra("English_unit",str_2_2);
                            nl.putExtra("English_bonus",get_value_of_bonus(num_2_2,true));


                            nl.putExtra("name1",str_3_1);
                            nl.putExtra("name2",str_4_1);
                            nl.putExtra("name3",str_5_1);

                            nl.putExtra("unit1",str_3_2);
                            nl.putExtra("unit2",str_4_2);
                            nl.putExtra("unit3",str_5_2);

                            nl.putExtra("grade1",str_3_3);
                            nl.putExtra("grade2",str_4_3);
                            nl.putExtra("grade3",str_5_3);

                            nl.putExtra("bonus1", get_value_of_bonus(num_3_2,false));
                            nl.putExtra("bonus2", get_value_of_bonus(num_4_2,false));
                            nl.putExtra("bonus3", get_value_of_bonus(num_5_2,false));


                            nl.putExtra("arr",arr);
                            nl.putExtra("option",btnClick);
                            startActivity(nl);
                        }
                    }
                    else
                    {
                        Toast.makeText(this, "English input illegal!", Toast.LENGTH_SHORT).show();
                    }

                }
                else
                {
                    Toast.makeText(this, "The field of English Empty", Toast.LENGTH_SHORT).show();
                }
            }
            else
            {
                Toast.makeText(this, "Math input illegal!", Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            Toast.makeText(this, "The field of Math Empty", Toast.LENGTH_SHORT).show();
        }
    }


    public void weddings()
    {
        eD_1_2_pg2 = findViewById(R.id.eD_1_2_pg2);
        eD_1_3_pg2 = findViewById(R.id.eD_1_3_pg2);
        eD_2_2_pg2 = findViewById(R.id.eD_2_2_pg2);
        eD_2_3_pg2 = findViewById(R.id.eD_2_3_pg2);
        eD_3_1_pg2 = findViewById(R.id.eD_3_1_pg2);
        eD_3_2_pg2 = findViewById(R.id.eD_3_2_pg2);
        eD_3_3_pg2 = findViewById(R.id.eD_3_3_pg2);
        eD_4_1_pg2 = findViewById(R.id.eD_4_1_pg2);
        eD_4_2_pg2 = findViewById(R.id.eD_4_2_pg2);
        eD_4_3_pg2 = findViewById(R.id.eD_4_3_pg2);
        eD_5_1_pg2 = findViewById(R.id.eD_5_1_pg2);
        eD_5_2_pg2 = findViewById(R.id.eD_5_2_pg2);
        eD_5_3_pg2 = findViewById(R.id.eD_5_3_pg2);

        btn_op1 = findViewById(R.id.btn_op1);
        btn_op2 = findViewById(R.id.btn_op2);
        btn_op3 = findViewById(R.id.btn_op3);
        btn_for_pg2_to_pg3 = findViewById(R.id.btn_for_pg2_to_pg3);
    }

    public void Reset_variables()
    {
        canSkip = false;
        str_1_2 = "";
        str_1_3 = "";
        str_2_2 = "";
        str_2_3 = "";
        str_3_1 = "";
        str_3_2 = "";
        str_3_3 = "";
        str_4_1 = "";
        str_4_2 = "";
        str_4_3 = "";
        str_5_1 = "";
        str_5_2 = "";
        str_5_3 = "";

        num_1_2 = 0;
        num_1_3 = 0;
        num_2_2 = 0;
        num_2_3 = 0;
        num_3_2 = 0;
        num_3_3 = 0;
        num_4_2 = 0;
        num_4_3 = 0;
        num_5_2 = 0;
        num_5_3 = 0;

        units = gi.getIntExtra("units",-1);
        sum_grade = gi.getDoubleExtra("sum_grade",-1);

        arr[0] = -1;
        arr[1] = -1;
        arr[2] = -1;
        arr[3] = -1;
        arr[4] = -1;
        arr[5] = -1;
        arr[6] = -1;



    }



    public boolean check_units_legal( int num)
    {
        if (num >= 3) {
            if (num <= 5) {
                return true;
            }
        }
        return false;
    }



    public boolean check_grade_legal ( int num)
    {

        if (num <= 100)
        {
            if(num > 0)
            {
                return true;
            }
        }
        return false;
    }


    public double[] sort_arr(double arr[])
    {
        double temp = 0;
        boolean all_sort = false;

        while(!all_sort)
        {
            all_sort = true;
            for(int i = 1 ; i < anass ; i++)
            {
                if(arr[i-1] < arr [i])
                {
                    temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    all_sort = false;
                }
            }
        }
        return arr;
    }


    public int bonus(int grade,int unit,boolean op)
            //op true - English, math. 4 = 15, 5 = 30
            //op false - all the others. 4 = 10, 5 = 20
    {
        if(op)
        {
            switch (unit)
            {
                case 4:
                    grade = grade + 15;
                    break;
                case 5:
                    grade = grade + 30;
                    break;
            }
        }
        else
        {
            switch (unit)
            {
                case 4:
                    grade = grade + 10;
                    break;
                case 5:
                    grade = grade + 20;
                    break;
            }
        }
        return grade;
    }

    public String get_value_of_bonus(int unit,boolean op)
    //op true - English, math. 4 = 15, 5 = 30
    //op false - all the others. 4 = 10, 5 = 20
    {
        String bouns = "0";
        if(op)
        {
            switch (unit)
            {
                case 4:
                    bouns = "15";
                    break;
                case 5:
                    bouns = "30";
                    break;
            }
        }
        else
        {
            switch (unit)
            {
                case 4:
                    bouns = "10";
                    break;
                case 5:
                    bouns = "20";
                    break;
            }
        }
        return bouns;
    }

    public boolean check_one_line()
    {
        str_3_1 = eD_3_1_pg2.getText().toString();
        if (!str_3_1.isEmpty()) {
            str_3_2 = eD_3_2_pg2.getText().toString();
            str_3_3 = eD_3_3_pg2.getText().toString();
            if (!str_3_2.isEmpty() && !str_3_3.isEmpty()) {
                num_3_2 = Integer.parseInt(str_3_2);
                num_3_3 = Integer.parseInt(str_3_3);
                if (check_units_legal(num_3_2) && check_grade_legal(num_3_3)) {
                    return true;
                }
                else
                {
                    Toast.makeText(this, "unit or grade of fist line illegal !!", Toast.LENGTH_SHORT).show();
                }
            }
            else
            {
                Toast.makeText(this, "unit or grade of fist line Empty !!", Toast.LENGTH_SHORT).show();
            }

        }
        else
        {
            Toast.makeText(this, "name of fist line Empty", Toast.LENGTH_SHORT).show();
        }
        return false;
    }



    public boolean check_two_line()
    {
        if(check_one_line());
        {
            str_4_1 = eD_4_1_pg2.getText().toString();
            if (!str_4_1.isEmpty()) {
                str_4_2 = eD_4_2_pg2.getText().toString();
                str_4_3 = eD_4_3_pg2.getText().toString();
                if (!str_4_2.isEmpty() && !str_4_3.isEmpty()) {
                    num_4_2 = Integer.parseInt(str_4_2);
                    num_4_3 = Integer.parseInt(str_4_3);
                    if (check_units_legal(num_4_2) && check_grade_legal(num_4_3)) {
                        return true;
                    }
                    else
                    {
                        Toast.makeText(this, "unit or grade of second line illegal !!", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(this, "unit or grade of second line Empty !!", Toast.LENGTH_SHORT).show();
                }
            }
            else
            {
                Toast.makeText(this, "name of second line Empty", Toast.LENGTH_SHORT).show();
            }
        }
        return false;
    }



    public boolean check_three_line()
    {
        if(check_two_line());
        {
            str_5_1 = eD_5_1_pg2.getText().toString();
            if (!str_5_1.isEmpty()) {
                str_5_2 = eD_5_2_pg2.getText().toString();
                str_5_3 = eD_5_3_pg2.getText().toString();
                if (!str_5_2.isEmpty() && !str_5_3.isEmpty()) {
                    num_5_2 = Integer.parseInt(str_5_2);
                    num_5_3 = Integer.parseInt(str_4_3);
                    if (check_units_legal(num_5_2) && check_grade_legal(num_5_3)) {
                        return true;
                    }
                    else
                    {
                        Toast.makeText(this, "unit or grade of third line illegal !!", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(this, "unit or grade of third line Empty !!", Toast.LENGTH_SHORT).show();
                }
            }
            else
            {
                Toast.makeText(this, "name of third line Empty", Toast.LENGTH_SHORT).show();
            }
        }
        return false;
    }


    public double[] caulation_ans_op2(double[] arr)
    {
        num_4_3 = bonus(num_4_3,num_4_2,false);
        num_4_3 = (num_4_3 * num_4_2);
        arr[1] = (sum_grade + num_4_3)/(units+num_4_2);
        arr[2] = (sum_grade + num_4_3 + num_3_3)/(units+num_4_2+num_3_2);
        return arr;
    }


    public void go_back_1(View view)
    {
        finish();
    }

}