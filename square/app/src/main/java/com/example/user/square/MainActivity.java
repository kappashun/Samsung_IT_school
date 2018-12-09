package com.example.user.square;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void solveEquation(View view) {
        // ax^2+bx+c=0
        double a = Double.parseDouble( ((EditText)
                findViewById(R.id.value_a)).getText().toString());
        double b = Double.parseDouble( ((EditText)
                findViewById(R.id.value_b)).getText().toString());
        double c = Double.parseDouble( ((EditText)
                findViewById(R.id.value_c)).getText().toString());
        double dis = b*b-4*a*c;
        if(dis < 0){
            TextView result = (TextView) findViewById(R.id.result);
            result.setText("no such x");
        }
        if(dis == 0){
            TextView result = (TextView) findViewById(R.id.result);
            result.setText("" + String.valueOf(b*b/2*a));
        }
        else{
            TextView result = (TextView) findViewById(R.id.result);
            result.setText("" + String.valueOf((b*b-sqrt(dis))/2*a)+ " " + String.valueOf((b*b+sqrt(dis))/2*a));
        }
    }
}
