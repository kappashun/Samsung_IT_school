package com.example.user.authorization;

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

    public void confirm(View view) {
        String login = new String( ((EditText) findViewById(R.id.login)).getText().toString());
        String password = new String( ((EditText) findViewById(R.id.password)).getText().toString());
        if(login == password){
            TextView result = (TextView) findViewById(R.id.result);
            result.setText("Right");
            return;
        }
        else{
            TextView result = (TextView) findViewById(R.id.result);
            result.setText("Wrong");
            return;
        }
    }
}
