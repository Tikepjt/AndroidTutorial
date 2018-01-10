package com.tistory.tikepjt.part2_4;

import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class Lab4_3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4_3);

        TabHost host =(TabHost)findViewById(R.id.host);
        host.setup();

        TabHost.TabSpec spec = host.newTabSpec("tab1");
        spec.setIndicator(null, ResourcesCompat.getDrawable(
                getResources(),R.drawable.icon, null));
        spec.setContent(R.id.tab_content1);
        host.addTab(spec);
        spec = host.newTabSpec("tab2");
        spec.setIndicator(null, ResourcesCompat.getDrawable(
                getResources(), R.drawable.icon, null));
        spec.setContent(R.id.tab_content2);
        host.addTab(spec);

        spec = host.newTabSpec("tab3");
        spec.setIndicator(null, ResourcesCompat.getDrawable(
                getResources(), R.drawable.icon, null));
        spec.setContent(R.id.tab_content3);
        host.addTab(spec);
    }
}
