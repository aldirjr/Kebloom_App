package com.project.kebloomapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button buttonLogin = findViewById(R.id.login);
    public void loginClicked(View view) {
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);

        if (email.getText().toString().matches("") || password.getText().toString().matches("")) {
            Toast.makeText(this, "A email and a password are required.", Toast.LENGTH_SHORT).show();
        } else {
            //Code for creating the user
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button buttonLogin = findViewById(R.id.login);

        Button buttonRegister = findViewById(R.id.register);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainMenu.class);
                startActivity(intent);

            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Registration_p1.class);
                startActivity(intent);
            }
        });

    }

}
