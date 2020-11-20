package com.example.lesson18_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int counter;
    TextView textView;
    ImageView imageForClick;
    Button newButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.intCounter);


        imageForClick = findViewById(R.id.icForClick);
        imageForClick.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        counter++;
        textView.setText(String.valueOf(counter));

    }
});
        newButton = findViewById(R.id.newButton);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent firstIntent = new Intent (getApplicationContext(), SecondActivity.class);
            startActivity(firstIntent);

            }
        });

    }
}