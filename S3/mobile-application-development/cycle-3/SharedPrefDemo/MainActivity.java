package com.example.sharedprefdemo;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etUsername, etAge;
    Button btnSave, btnLoad;
    TextView tvResult;

    SharedPreferences sharedPreferences;
    public static final String SHARED_PREFS = "userPrefs";
    public static final String KEY_USERNAME = "username";
    public static final String KEY_AGE = "age";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etAge = findViewById(R.id.etAge);
        btnSave = findViewById(R.id.btnSave);
        btnLoad = findViewById(R.id.btnLoad);
        tvResult = findViewById(R.id.tvResult);

        sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        // Save data
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                int age = Integer.parseInt(etAge.getText().toString());

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_USERNAME, username);
                editor.putInt(KEY_AGE, age);
                editor.apply(); // Save changes

                tvResult.setText("Data Saved!");
            }
        });

        // Load saved data
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadData();
            }
        });

        // Auto-load data when app restarts
        loadData();
    }

    private void loadData() {
        String username = sharedPreferences.getString(KEY_USERNAME, "No Name");
        int age = sharedPreferences.getInt(KEY_AGE, 0);

        tvResult.setText("Username: " + username + "\nAge: " + age);
    }
}
