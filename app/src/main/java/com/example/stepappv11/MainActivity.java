package com.example.stepappv11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    private TextView showCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        counter = 0;
        showCount.setText(Integer.toString(counter));
        Toast toast = Toast.makeText(this, R.string.counterStart, Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view) {
        counter++;
        showCount.setText(Integer.toString(counter));
    }
}