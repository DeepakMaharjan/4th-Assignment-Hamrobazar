package com.deepak.hamrobazzar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoggedIn extends AppCompatActivity {

    private Button btnLoggedInBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);

        btnLoggedInBack = findViewById(R.id.btnLoggedInBack);

        btnLoggedInBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoggedIn.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
