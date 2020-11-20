package com.example.lesson18_android;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class SecondActivity extends AppCompatActivity {
    private int counter;
    TextView intCounter;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

     intCounter = findViewById(R.id.intSecondCounter);

     Button reset = findViewById(R.id.buttonReset);
    reset.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            counter *= 0 ;
        intCounter.setText(String.valueOf(counter));
        }
    });
    Button minus = findViewById(R.id.buttonMinus);
    minus.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(counter > 0 ){
                counter--;
                intCounter.setText(String.valueOf(counter));
            }
        }
    });
    Button plus = findViewById(R.id.buttonPlus);
    plus.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            counter++;
            intCounter.setText(String.valueOf(counter));
        }
    });

    }
}

