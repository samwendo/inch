package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    private EditText unitEditText;
    private Button button;
    private TextView resultText;
    private RadioButton mRadioButton;
    private RadioButton inchRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
findViews();
setButtonClickListener();

    }
    private void findViews() {
        //finding views in the layout
        mRadioButton = findViewById(R.id.mRadioButton);
        inchRadioButton= findViewById(R.id.inchRadioButton);
        unitEditText = findViewById(R.id.unitEditText);
        button = findViewById(R.id.button);
        resultText = findViewById(R.id.resultText);

    }
    protected void setButtonClickListener() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertbutton();
            }
        });
    }
    private void convertbutton() {
        String greeting;
        String unitText = unitEditText.getText().toString();


        if (mRadioButton.isChecked()) {
            greeting = "  . Meters ";

        } else if (inchRadioButton.isChecked()) {
            greeting = " . Inch ";

        } else {
            greeting = " sorry ";
        }

        // convert all numbers to strings
        int unit  = Integer.parseInt(unitText);

        //get total height in inches
        int totalInches = (unit * 12)+ unit;


        resultText.setText(greeting + " Your height is = " + String.valueOf(totalInches)
        );
    }
   }
