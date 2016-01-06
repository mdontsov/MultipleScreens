package com.example.maxim.multiplescreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void goNext2(View view) {
        Intent intent=new Intent(FirstActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
