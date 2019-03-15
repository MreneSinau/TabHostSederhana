package com.mrenesinau.tabhostsederhana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost =(TabHost) findViewById(R.id.tabhost);
        tabHost.setup();

        TabHost.TabSpec spec1=tabHost.newTabSpec("NAME");
        spec1.setContent(R.id.tab1);
        spec1.setIndicator("NAME");

        TabHost.TabSpec spec2=tabHost.newTabSpec("KELAS");
        spec1.setContent(R.id.tab2);
        spec1.setIndicator("KELAS");

        TabHost.TabSpec spec3=tabHost.newTabSpec("NIM");
        spec1.setContent(R.id.tab3);
        spec1.setIndicator("NIM");

        tabHost.addTab(spec1);
        tabHost.addTab(spec2);
        tabHost.addTab(spec3);
    }
}
