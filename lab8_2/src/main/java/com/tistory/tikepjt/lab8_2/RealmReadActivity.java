package com.tistory.tikepjt.lab8_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import io.realm.Realm;

public class RealmReadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realm_read);

        TextView titleView=(TextView)findViewById(R.id.realm_read_title);
        TextView contentView=(TextView)findViewById(R.id.realm_read_content);

        Intent intent=getIntent();
        String title=intent.getStringExtra("title");

        Realm mRealm=Realm.getDefaultInstance();

        com.tistory.tikepjt.lab8_2.MemoVO vo=mRealm.where(com.tistory.tikepjt.lab8_2.MemoVO.class).equalTo("title", title).findFirst();

        titleView.setText(vo.title);
        contentView.setText(vo.content);

    }
}