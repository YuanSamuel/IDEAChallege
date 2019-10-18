package com.example.crhsideachallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button numInc, sizeInc;

    int num = 0, size = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.myNumber);
        numInc = findViewById(R.id.numInc);
        sizeInc = findViewById(R.id.sizeInc);
        text.setText(num);
        text.setTextSize(size);


        numInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               num++ ;
               text.setText(num);
            }
        });

        sizeInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                size++;
                text.setTextSize(size);
            }
        });
    }
}
