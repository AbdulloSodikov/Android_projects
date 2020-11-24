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

     findViewById(R.id.buttonReset).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            counter = 0 ;
            updateCounter();
        }
    });
    findViewById(R.id.buttonMinus).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(counter > 0 ){
                counter--;
                updateCounter();
            }
        }
    });
    findViewById(R.id.buttonPlus).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            counter++;
            updateCounter();

        }
    });

    }
private void updateCounter (){
    intCounter.setText(String.valueOf(counter));

}
}

