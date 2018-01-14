package com.tistory.tikepjt.part2_4;

import android.app.DatePickerDialog;
//import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
//import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

import static android.app.ProgressDialog.*;

public class Lab5_2Activity extends AppCompatActivity implements View.OnClickListener{

    Button alertBtn;
    Button listBtn;
    Button progressBtn;
    Button dateBtn;
    Button timeBtn;
    Button customDialogBtn;

    AlertDialog customDialog;
    AlertDialog listDialog;
    AlertDialog alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab5_2);

        alertBtn = findViewById (R.id.btn_alert);
        listBtn = findViewById (R.id.btn_list);
        progressBtn = findViewById (R.id.btn_progress);
        dateBtn = findViewById (R.id.btn_date);
        timeBtn = findViewById (R.id.btn_time);
        customDialogBtn = findViewById (R.id.btn_custom);

        alertBtn.setOnClickListener(this);
        listBtn.setOnClickListener(this);
        progressBtn.setOnClickListener(this);
        dateBtn.setOnClickListener(this);
        timeBtn.setOnClickListener(this);
        customDialogBtn.setOnClickListener(this);
    }

    private void showToast(String message){
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.show();
    }

        DialogInterface.OnClickListener dialogListener = new DialogInterface.OnClickListener(){
        @Override
        public void onClick(DialogInterface dialog, int which){
            if (dialog==customDialog && which==DialogInterface.BUTTON_POSITIVE){
                showToast("CustomDialog Confirm click....");
            }else if (dialog == listDialog){
                String[] dates=getResources().getStringArray(R.array.dialog_array);
                showToast(dates[which]+ "Celected.");
            }else if (dialog == alertDialog && which == DialogInterface.BUTTON_POSITIVE){
                showToast("alert dialog ok click....");
            }
        }
    };

    @Override
    public void onClick(View v) {
        if (v == alertBtn){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setIcon(android.R.drawable.ic_dialog_alert);
            builder.setTitle("Alert");
            builder.setMessage("Really shut down?");
            builder.setPositiveButton("OK", dialogListener);
            builder.setNegativeButton("NO", null);

            alertDialog = builder.create();
            alertDialog.show();

        }else if (v == listBtn){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("alarm sound");
            builder.setSingleChoiceItems(R.array.dialog_array, 0, dialogListener);

            builder.setPositiveButton("allow", null);
            builder.setNegativeButton("cancel", null);
            listDialog = builder.create();
            listDialog.show();

        }else if (v == progressBtn){
            ProgressDialog progressDialog;
            progressDialog = new ProgressDialog(this);
            progressDialog.setIcon(android.R.drawable.ic_dialog_alert);
            progressDialog.setTitle("Wait..");
            progressDialog.setMessage("Please wait.");


            progressDialog.setProgressStyle(STYLE_HORIZONTAL);
            progressDialog.setIndeterminate(true);

            progressDialog.show();

        }else if (v == dateBtn){
            Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog dateDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth){
                        showToast(year + ":" + (monthOfYear + 1) + ":" + dayOfMonth);
                    }
                }, year, month, day);
                dateDialog.show();
        }else if (v == timeBtn){
            Calendar c = Calendar.getInstance();
            int hour = c.get(Calendar.HOUR_OF_DAY);
            int minute = c.get(Calendar.MINUTE);

            TimePickerDialog timeDialog = new TimePickerDialog(this,
                    new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                            showToast(hourOfDay + ":" + minute);
                    }
            }, hour, minute, false);
            timeDialog.show();
        }else if (v == customDialogBtn){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.dialog_layout, null);
            builder.setView(view);

            builder.setPositiveButton("allow", dialogListener);
            builder.setNegativeButton("cancel", null);

            customDialog = builder.create();
            customDialog.show();
        }
    }
}
