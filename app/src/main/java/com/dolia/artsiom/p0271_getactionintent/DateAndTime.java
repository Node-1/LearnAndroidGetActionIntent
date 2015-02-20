package com.dolia.artsiom.p0271_getactionintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import java.sql.Date;
import java.text.SimpleDateFormat;


public class DateAndTime extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date_and_time);

        String format = "";
        String textInfo = "";

        Intent intent = getIntent();
        String action = intent.getAction();

        if(action.equals("com.dolia.artsiom.action.showtime")){

            format = "HH:mm:ss";
            textInfo = "Time: ";

        }else if (action.equals("com.dolia.artsiom.action.showdate")){

            format = "dd.MM.yyyy";
            textInfo = "Date: ";
        }

        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateTime = sdf.format(new Date(System.currentTimeMillis()));

        TextView tvInfo = (TextView) findViewById(R.id.tvInfo);
        tvInfo.setText(textInfo + dateTime);
    }
}
