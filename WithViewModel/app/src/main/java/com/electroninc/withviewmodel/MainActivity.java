package com.electroninc.withviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CountViewModel countViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countViewModel = ViewModelProviders.of(this).get(CountViewModel.class);

        final TextView countTextView = findViewById(R.id.count_text_view);
        countTextView.setText(formatCount());

        Button addOneButton = findViewById(R.id.add_one_btn);
        addOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countViewModel.count++;
                countTextView.setText(formatCount());
            }
        });
    }

    private String formatCount() {
        return "Count: " + countViewModel.count;
    }
}
