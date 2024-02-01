package com.jainsoham.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    Button incrementButton;
    TextView greetingDisplay;
    Button incrementRadio;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        incrementButton = findViewById(R.id.increment_button);
        greetingDisplay = findViewById(R.id.greeting_textview);
        incrementRadio = findViewById(R.id.radio_increment);
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Incrementing: " + ++count);
                Log.i("Incrementing", "" + count);
                greetingDisplay.setText("" + count);
                v.setBackgroundColor(Color.rgb(255, 0, 255));
            }
        });

        incrementRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Incrementing: " + ++count);
                Log.i("Incrementing", "" + count);
                greetingDisplay.setText("" + count);
            }
        });
    }

    public void decrement(View v) {
        System.out.println("Decrementing: " + --count);
        greetingDisplay.setText("" + count);
        v.setBackgroundColor(Color.BLUE);
    }

    public void decrement2(View v) {
        System.out.println("Decrementing: " + --count);
        greetingDisplay.setText("" + count);
    }
}