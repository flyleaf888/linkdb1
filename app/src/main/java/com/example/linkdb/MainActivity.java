package com.example.linkdb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Thread(new Runnable() {
            @Override
            public void run() {

             // DBConnection.insertmydb();
               DBConnection.qMysql();
               // DBConnection.linkMysql();
            }
        }).start();
    }
}
