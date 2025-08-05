package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1EditText, num2EditText;
    TextView resultTextView;
    Button addButton, subtractButton, multiplyButton, divideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1EditText = findViewById(R.id.num1EditText);
        num2EditText = findViewById(R.id.num2EditText);
        resultTextView = findViewById(R.id.resultTextView);

        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divideButton = findViewById(R.id.divideButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1Str = num1EditText.getText().toString().trim();
                String n2Str = num2EditText.getText().toString().trim();

                if (n1Str.isEmpty() || n2Str.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter both numbers", Toast.LENGTH_SHORT).show();
                    return;
                }

                double num1 = Double.parseDouble(n1Str);
                double num2 = Double.parseDouble(n2Str);
                double result = 0;

                int id = v.getId();

                if (id == R.id.addButton) {
                    result = num1 + num2;
                } else if (id == R.id.subtractButton) {
                    result = num1 - num2;
                } else if (id == R.id.multiplyButton) {
                    result = num1 * num2;
                } else if (id == R.id.divideButton) {
                    if (num2 == 0) {
                        Toast.makeText(MainActivity.this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    result = num1 / num2;
                }


                resultTextView.setText("Result: " + result);
            }
        };

        addButton.setOnClickListener(listener);
        subtractButton.setOnClickListener(listener);
        multiplyButton.setOnClickListener(listener);
        divideButton.setOnClickListener(listener);
    }
}
