package com.example.whattimeitis_ismael;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private TextView txtDateTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        curDateTime();
    }

    private void curDateTime(){
        txtDateTime = findViewById(R.id.txtDateTime);
        Date date = new Date();
        Date time = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        String d = dateFormat.format(date);
        String t = timeFormat.format(time);

        txtDateTime.setText("Date\n"+d+"\nTime\n"+t);
    }
}