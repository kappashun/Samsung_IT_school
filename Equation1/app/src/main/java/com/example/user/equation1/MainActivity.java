package com.example.user.equation1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void solveEquation(View view) {
        // ax^2+bx+c=0
        double a = Double.parseDouble( ((EditText) findViewById(R.id.coefficient_a)).getText().toString());
        double b = Double.parseDouble( ((EditText) findViewById(R.id.coefficient_b)).getText().toString());
        double c = Double.parseDouble( ((EditText) findViewById(R.id.coefficient_c)).getText().toString());
        if(a == 0){
            TextView result = (TextView) findViewById(R.id.result);
            result.setText("a should not be 0");
            return;
        }
        double D = b*b-4*a*c;
        if(D > 0){
            TextView result = (TextView) findViewById(R.id.result);
            result.setText("x =" + String.valueOf((-b-sqrt(D))/2*a) + ", " + String.valueOf((-b+sqrt(D))/2*a));
            return;
        }
        if(D == 0){
            TextView result = (TextView) findViewById(R.id.result);
            result.setText("x =" + String.valueOf(-b/2*a));
            return;
        }
        if(D < 0){
            TextView result = (TextView) findViewById(R.id.result);
            result.setText("no such x");
            return;
        }
    }
}
