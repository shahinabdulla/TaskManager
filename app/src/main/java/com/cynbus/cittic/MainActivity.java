package com.cynbus.cittic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button login;
    private EditText usernameB;
    private EditText passwordB;

    private String username;
    private String password;

    private String realUsername = "hello";
    private String realPassword = "1234";

    private TextView nameDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        usernameB = findViewById(R.id.username);
        passwordB = findViewById(R.id.password);
        nameDisplay = findViewById(R.id.nameDisplay);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                username = usernameB.getText().toString().trim();
                password = passwordB.getText().toString().trim();

                if(username.equals(realUsername) && password.equals(realPassword)){
                    Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                }
            }

        });








    }

}
