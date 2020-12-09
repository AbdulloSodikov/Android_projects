package com.example.myfirstapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView newImage;
    TextView textMyApp;
    ImageView imageMyApp;
    Button firstButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newImage = findViewById(R.id.imageMisha);
        newImage = findViewById(R.id.imageMasha);
        imageMyApp = findViewById(R.id.imageMisha);
        imageMyApp = findViewById(R.id.imageMasha);
        textMyApp = findViewById(R.id.title);
        textMyApp = findViewById(R.id.testHistory);

        firstButton = findViewById(R.id.button);
        firstButton.setOnContextClickListener();


    }
}