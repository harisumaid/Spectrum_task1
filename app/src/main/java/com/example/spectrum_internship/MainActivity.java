package com.example.spectrum_internship;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showName(View view) {
        TextView regdName = findViewById(R.id.regdName);
        EditText regdNo= findViewById(R.id.regdNo);
        String number = String.valueOf(regdNo.getText());
        if (number.equals("1701106104")){
            //this part changes the textview
            String name;
            name = "Haris Umaid";
            regdName.setText(name);

            //this part changes the color
            Button clickForName = findViewById(R.id.clickForName);
            clickForName.setBackground(this.getResources().getDrawable(R.drawable.gradient_on_click));
        } else {
            Toast.makeText(getApplicationContext(),"Regd No. is 1701106104",Toast.LENGTH_LONG).show();
        }
    }
}
