package com.electroninc.withoutviewmodel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

    private String formatCount() {
        return "Count: " + count;
    }
}
