package com.tistory.tikepjt.part2_3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class Lab3_4Activity extends AppCompatActivity {

    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_4);

//        TextView textView=(TextView)findViewById(R.id.fontView);
//        Typeface typeface=Typeface.createFromAsset(getAssets(), "xmas.ttf");
//        textView.setTypeface(typeface);

        checkBox=(CheckBox)findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    checkBox.setText(getString(R.string.is_Checked));
                } else {
                    checkBox.setText(getString(R.string.is_unChecked));
                }
            }
        });
    }
}