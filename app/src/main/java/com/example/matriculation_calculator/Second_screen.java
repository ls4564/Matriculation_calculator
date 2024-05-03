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
    boolean canSkip = false;
    int btnClick = 0, units;
    double sum_grade;
    private String str_1_2,str_1_3,str_2_2,str_2_3,str_3_1,str_3_2,str_3_3,str_4_1,str_4_2,str_4_3,str_5_1,str_5_2,str_5_3;
    private int num_1_2,num_1_3,num_2_2,num_2_3,num_3_1,num_3_2,num_3_3,num_4_1,num_4_2,num_4_3,num_5_1,num_5_2,num_5_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
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


        Intent gi = getIntent();
        sum_grade = gi.getDoubleExtra("sum", -1);
        units = gi.getIntExtra("units", -1);
        //String user_name = gi.getStringExtra("user_name");
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

    public void go_back_1(View view) {
        finish();
    }

    public void Next_page_3(View view) {
        canSkip = false;

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
                                break;
                            case 2:
                                canSkip = check_two_line();
                                break;
                            case 3:
                                canSkip = check_three_line();
                                break;
                        }

                        if(canSkip)
                        {
                            units = units = num_1_2;
                            sum_grade = sum_grade + (num_1_3 * num_1_2);

                            units = units = num_2_2;
                            sum_grade = sum_grade + (num_2_3 * num_2_2);
                            switch (btnClick)
                            {
                                case 1:
                                    canSkip = check_one_line();
                                    break;
                                case 2:
                                    canSkip = check_two_line();
                                    break;
                                case 3:
                                    canSkip = check_three_line();
                                    break;
                            }
                            Intent nl = new Intent(this, Third_screen.class);

                            nl.putExtra("sum_grade",sum_grade);
                            nl.putExtra("units",units);
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

        if (num <= 100) {
            return true;
        }
        return false;
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

}