package com.example.latihanintentanpadata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithData extends AppCompatActivity {
    TextView txtMovedata;
    public static  final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_AGE = "extra_age";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        txtMovedata = findViewById(R.id.tv_received_data);
        String name= getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE,0);

        String text = "Name :"+name+"\nAge :"+age;
        txtMovedata.setText(text);


    }
}