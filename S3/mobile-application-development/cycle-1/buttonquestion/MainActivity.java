package com.example.buttonquestion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView questionTextView;
    private TextView answerTextView;
    private Button showAnswerButton;

    private String[] questions = {
            "What is the capital of France?","",
            "What is the largest planet in the solar system?","",
            "What is 2 + 2?",""
    };

    private String[] answers = {
            "Paris","",
            "Jupiter","",
            "4",""
    };

    private int currentQuestionIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionTextView = findViewById(R.id.questionTextView);
        answerTextView = findViewById(R.id.answerTextView);
        showAnswerButton = findViewById(R.id.showAnswerButton);

        questionTextView.setText(questions[currentQuestionIndex]);

        showAnswerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerTextView.setText(answers[currentQuestionIndex]);

                currentQuestionIndex = (currentQuestionIndex + 1) % questions.length;
                questionTextView.setText(questions[currentQuestionIndex]);
            }
        });
    }
}
