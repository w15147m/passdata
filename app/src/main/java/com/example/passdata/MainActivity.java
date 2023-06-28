package com.example.passdata;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText etn , ete , etnum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         //Hooks
        btn = findViewById(R.id.button);
        etn = findViewById(R.id.etname);
        ete = findViewById(R.id.ete);
        etnum = findViewById(R.id.etnum);
        //Pass Data on Button Click
        btn.setOnClickListener(v -> {
            //Get data from input field
         String getname = etn.getText().toString();
         String getemail = ete.getText().toString();
         String getnum = etnum.getText().toString();
            //Pass data to 2nd activity
            Intent intent = new Intent(MainActivity.this , MainActivity2.class);
            intent.putExtra("name",getname);
            intent.putExtra("E-mail",getemail);
            intent.putExtra("num",getnum);
            startActivity(intent);
//            Intent intent = new Intent(MainActivity.this , MainActivity2.class);
//            intent.putExtra("name",getname);
//            intent.putExtra("E-mail",getemail);
//            intent.putExtra("num",getnum);
//            startActivity(intent);







        });


    }
}