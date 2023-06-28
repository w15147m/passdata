package com.example.passdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
  TextView tw1,tw2,tw3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Hooks
        tw1 = findViewById(R.id.textView2);
        tw2 =(TextView) findViewById(R.id.textView3);
        tw3 = (TextView) findViewById(R.id.textView4);
        //Get data from Mainactivity
        Intent intent = getIntent();
        String getname = intent.getStringExtra("name");
        String getemail = intent.getStringExtra("E-mail");
        String getnum = intent.getStringExtra("num");

        tw1.setText("Name  " + getname);
        tw2.setText("E-mail  " + getemail);
        tw3.setText("Phone  " + getnum);


    }
}