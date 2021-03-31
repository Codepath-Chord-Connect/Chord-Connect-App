package com.example.chordconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    Button btnSignup;
    EditText etPassword;
    EditText etUsername;
    public final String TAG = "Login Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // get the login activity layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        if(ParseUser.getCurrentUser() != null){
            goMainActivity();
        }

        btnLogin = findViewById(R.id.btnLogin);
        btnSignup = findViewById(R.id.btnSignup);
        etPassword = findViewById(R.id.etPassword);
        etUsername = findViewById(R.id.ptUsername);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                loginUser(username, password);
            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ParseUser user = new ParseUser();

                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                user.setPassword(password);
                user.setUsername(username);

                user.signUpInBackground(new SignUpCallback() {
                    @Override
                    public void done(ParseException e) {
                        if(e != null){
                            Toast.makeText(LoginActivity.this, "Something wrong with sign up", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        else{
                            Toast.makeText(LoginActivity.this, "Successfully signed up!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }

    private void loginUser(String username, String password) {

        ParseUser.logInInBackground(username, password, new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if(e != null){
                    Log.e(TAG, "Issue with login", e);
                    Toast.makeText(LoginActivity.this, "Invalid Name & Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                else{
                    Toast.makeText(LoginActivity.this, "Successfully logged in!", Toast.LENGTH_SHORT).show();
                    goMainActivity();
                }
            }
        });
    }

    private void goMainActivity() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }
}