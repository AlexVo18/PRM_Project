package com.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.project.R;

public class LoginActivity extends AppCompatActivity {
    Button btnLogin;
    EditText editTextUsername;
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle saveInstanceBundle) {
        super.onCreate(saveInstanceBundle);
        setContentView(R.layout.fb_screen);

        btnLogin = (Button) findViewById(R.id.login_button);
        editTextUsername = findViewById(R.id.editTextText);
        editTextPassword = findViewById(R.id.editTextText2);
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Clear when minimize
        editTextUsername.setText("");
        editTextPassword.setText("");
    }

    public void onLogin(View view) {
        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();

        if (password.isEmpty()) {
            Toast.makeText(LoginActivity.this, "Password is empty", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(LoginActivity.this, "You've logged in!", Toast.LENGTH_SHORT).show();

            // Navigation
            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
            intent.putExtra("username", username);
            startActivity(intent);
        }


    }


}
