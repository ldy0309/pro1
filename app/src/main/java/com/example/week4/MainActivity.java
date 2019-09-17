package com.example.week4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abc);
        out =findViewById(R.id.out);


        EditText input =findViewById(R.id.inp);
        String str = input.getText().toString();

        Button btn = findViewById(R.id.btn);

    }

    public void onClick(View v) {
        Log.i("main","clicked");
        EditText input =findViewById(R.id.inp);
        String str = input.getText().toString();
        out.setText("Hi ," + str);

    }
}
