package com.example.fibonacci;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNumber;
    Button btnGenerate;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber = findViewById(R.id.etNumber);
        btnGenerate = findViewById(R.id.btnGenerate);
        tvResult = findViewById(R.id.tvResult);

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(etNumber.getText().toString());
                tvResult.setText(generateFibonacci(n));
            }
        });
    }

    // Function to generate Fibonacci series
    private String generateFibonacci(int n) {
        int a = 0, b = 1;
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            result.append(a).append(" ");
            int next = a + b;
            a = b;
            b = next;
        }
        return result.toString();
    }
}
