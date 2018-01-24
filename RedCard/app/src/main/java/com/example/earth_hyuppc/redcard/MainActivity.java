package com.example.earth_hyuppc.redcard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    EditText editText = (EditText)findViewById(R.id.editText);
//    final String name = editText.getText().toString();

    Intent intent = new Intent(this, RedCardActivity.class);

    startActivity(intent);

    }
}