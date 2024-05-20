package com.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.project.R;

public class HomeActivity extends AppCompatActivity {
    TextView textViewUsername;
    Button closeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewUsername = findViewById(R.id.textViewUsername);
        closeBtn = (Button) findViewById(R.id.closeBtn);

        // Navigation and params
        Intent intent = getIntent();
        if (intent != null) {
            String username = intent.getStringExtra("username");
            Log.d("HomeActivity", "Username: " + username);

            //Display data in View
            textViewUsername.setText(username);

        }
    }

    public void onClose(View view) {
        finishAffinity();
    }

}
