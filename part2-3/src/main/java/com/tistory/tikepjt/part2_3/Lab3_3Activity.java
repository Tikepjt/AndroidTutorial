package com.tistory.tikepjt.part2_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Lab3_3Activity extends AppCompatActivity implements View.OnClickListener{

    Button trueBtn;
    TextView targetTextView;
    Button falseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_3);

        trueBtn = findViewById(R.id.trueBtn);
        targetTextView = findViewById(R.id.target_TextView);
        falseBtn = findViewById(R.id.falseBtn);

        trueBtn.setOnClickListener(this);
        falseBtn.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v == trueBtn){
            targetTextView.setVisibility(View.VISIBLE);
        }else if(v == falseBtn){
            targetTextView.setVisibility(View.INVISIBLE);
        }
    }
}
