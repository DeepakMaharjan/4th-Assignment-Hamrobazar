package com.deepak.hamrobazzar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

import com.deepak.hamrobazzar.agreement.Terms;

public class Register extends AppCompatActivity {

    private Spinner spinCity;
    private TextView tvRegisterTerms;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



        spinCity = findViewById(R.id.spinCity);

        String cities[] = {"Kathmandu","Lalitpur","Bhaktapur","Pokhara","Bara","Baglung","Chitwan","Dama","Dang","Syangja","Gorkha","Itahari","Hetauda","Biratnagar","Janakpur","Dadeldhura","Dhankuta"};

        ArrayAdapter spinAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                cities
        );

        spinCity.setAdapter(spinAdapter);

        //Terms Section
        tvRegisterTerms = findViewById(R.id.tvRegisterTerms);
        tvRegisterTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this, Terms.class);
                startActivity(intent);

            }
        });





    }
}
