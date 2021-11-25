package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;


import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txt1;
    private EditText txt2;
    private TextView ans;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=findViewById(R.id.editTextNumber);
        txt2=findViewById(R.id.editTextNumber2);

        ans=findViewById(R.id.textView);
    }
    public void btn ( View view )
    {
        int n1= Integer.parseInt(txt1.getText().toString());
        int n2= Integer.parseInt(txt2.getText().toString());
        int sum= n1 + n2;
        ans.setText(String.valueOf(sum));
    }
}