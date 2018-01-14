package com.tistory.tikepjt.part2_6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener, CompoundButton.OnCheckedChangeListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        bellTextView.setOnClickListener(this);
        labellTextView.setOnClickListener(this);

        repeatCheckView.setOnClickedChangeedListener(this);
        vibrateCheckView.setOnClickedChangeListener(this);
        switchView.setOnClickedChangeListener(this);
    }
    private void showToast(String message){
    }
    @Override
    public void onClick(View v) {
        if (v == bellTextView) {
            showToast("bell text click event...");
        }else if (v==labelTextView){
            showToast("label text click event...");
        }
    }
    @Override
    public void onCheckedChangeed(CompoundButton buttonView, boolean isChecked){
        if (buttonView==repeatCheckView){
            showToast("repeat checkbox is " +isChecked);{
        }else if (buttonView==vibrateCheckView){
            showToast("ivbrate checkbox is " +isChecked);{
        }else if (buttonView==switchView){
            showToast("switch is " + isChecked);}
    }
}
