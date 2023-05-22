package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View v){
        EditText et1 =(EditText)findViewById(R.id.editTextNumber);
        EditText et2 =(EditText) findViewById(R.id.editTextNumber2);
        EditText et3 =(EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1+n2;

        et3.setText("Total Value "+result);
    }

    public void sub(View v){
        EditText et1 =(EditText)findViewById(R.id.editTextNumber);
        EditText et2 =(EditText) findViewById(R.id.editTextNumber2);
        EditText et3 =(EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1-n2;

        et3.setText("subtract Value "+result);
    }

    public void multiply(View v){
        EditText et1 =(EditText)findViewById(R.id.editTextNumber);
        EditText et2 =(EditText) findViewById(R.id.editTextNumber2);
        EditText et3 =(EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1*n2;

        et3.setText("multiply Value "+result);
    }

    public void divide(View v){
        EditText et1 =(EditText)findViewById(R.id.editTextNumber);
        EditText et2 =(EditText) findViewById(R.id.editTextNumber2);
        EditText et3 =(EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1/n2;

        et3.setText("divide Value "+result);
    }
}