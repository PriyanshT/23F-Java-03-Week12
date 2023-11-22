package com.georgiancollege.week12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText number1TextField;
    private EditText number2TextField;
    private Button submitButton;
    private TextView finalLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Initialize", "I am inside the initialize method (onCreate method)");

        // attach view ids with controller variables
        number1TextField = findViewById(R.id.editTextNumber);
        number2TextField = findViewById(R.id.editTextNumber3);
        submitButton = findViewById(R.id.button);
        finalLabel = findViewById(R.id.textView2);

        // add event listener on the submit button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Listener", "Submit button clicked!");

                try {
                    // get user data and store it in variables
                    int num1 = Integer.parseInt(number1TextField.getText().toString());
                    int num2 = Integer.parseInt(number2TextField.getText().toString());
                    Log.d("Numbers", "User's Number 1: " + num1);
                    Log.d("Numbers", "User's Number 2: " + num2);

                    // create an object of Number with the constructor
                    Number number = new Number(num1, num2);
                    Log.i("ObjectAdded", "number object created: " + number);

                    // add sum data to final label
                    finalLabel.setText(String.format("%d + %d = %d", num1, num2, number.sum()));
                } catch (Exception e){
                    finalLabel.setText("Please add numbers data to the boxes.");
                    Log.e("Numbers", "No Numbers added.");
                }
            }
        });
    }
}