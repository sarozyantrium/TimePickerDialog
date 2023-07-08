package com.example.timepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView txt_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_time=findViewById(R.id.txt_time);

        txt_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //to get current time

                //it is like creating object(or calling calendar
                Calendar calendar=Calendar.getInstance();
              int hour=calendar.get(Calendar.HOUR_OF_DAY);
                int min=calendar.get(Calendar.MINUTE);

                TimePickerDialog timePickerDialog=new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hour, int minute) {

                        txt_time.setText(hour+"Hour"+minute+" minutes");
                    }
                },hour,min,false);
                timePickerDialog.setTitle("Choose Time ");
                timePickerDialog.show();

            }
        });

    }
}