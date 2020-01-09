package com.example.anagramtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView resultTextView = findViewById(R.id.text_view_result);

        if (AnagramChecker.isValidAnagram("table", "bleaT")) {
            resultTextView.setText("Anagrams.");
        } else {
            resultTextView.setText("Not Anagrams");
        }
    }
}
