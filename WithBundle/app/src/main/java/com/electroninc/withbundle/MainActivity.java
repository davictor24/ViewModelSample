package com.electroninc.withbundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private static final String COUNT_KEY = "count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null)
            count = savedInstanceState.getInt(COUNT_KEY, 0);

        final TextView countTextView = findViewById(R.id.count_text_view);
        countTextView.setText(formatCount());

        Button addOneButton = findViewById(R.id.add_one_btn);
        addOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                countTextView.setText(formatCount());
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putInt(COUNT_KEY, count);
        super.onSaveInstanceState(outState);
    }

    private String formatCount() {
        return "Count: " + count;
    }
}
