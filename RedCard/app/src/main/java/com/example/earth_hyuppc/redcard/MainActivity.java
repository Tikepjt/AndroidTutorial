package com.example.earth_hyuppc.redcard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OutBtnClicked(View v) {
        Intent intent = new Intent(this, RedCardActivity.class);
        startActivity(intent);
    }

//    final EditText nameText = (EditText) findViewById(R.id.editText);
//    Button OutButton = (Button) findViewById(R.id.button);
    }
//}