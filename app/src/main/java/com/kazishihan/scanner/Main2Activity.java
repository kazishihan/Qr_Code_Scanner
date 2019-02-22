package com.kazishihan.scanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    TextView display_Information;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        display_Information=(TextView)findViewById(R.id.text_View);

        Intent getData_intent = getIntent();

        String bin_information = getData_intent.getStringExtra("information");

        String [] strs = bin_information.split ("\n");

        String Bin_Number = strs[0];
        String Cleaner_name = strs[1];
        String Bin_location = strs[2];
        String Phone_number = strs[2];

        display_Information.setText(bin_information);


    }
}
