package com.meroapp.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.meroapp.myapp.interest.Interest;

public class SimpleIntActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etPrincipal, etRate, etTime;
    Button btnInterest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_int);

        etPrincipal=findViewById(R.id.etPrincipal);
        etRate=findViewById(R.id.etRate);
        etTime=findViewById(R.id.etTime);
        btnInterest=findViewById(R.id.btnInterest);
        btnInterest.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (TextUtils.isEmpty(etPrincipal.getText().toString())) {
            etPrincipal.setError("Please Enter Principal");
            return;
        } else if (TextUtils.isEmpty(etRate.getText().toString())) {
            etRate.setError("Please Enter Rate");
            return;
        } else if (TextUtils.isEmpty(etTime.getText().toString())) {
            etTime.setError("Please Enter Time");
            return;
        }

        int principal, rate, time, result;
        principal = Integer.parseInt(etPrincipal.getText().toString());
        rate = Integer.parseInt(etRate.getText().toString());
        time = Integer.parseInt(etTime.getText().toString());

        Interest interest = new Interest(principal, rate, time);
        result = interest.intrest();
        Toast.makeText(this, "The Interest is" + result, Toast.LENGTH_SHORT).show();


    }
}
