package de.kai_morich.simple_usb_terminal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("Arnika") && password.getText().toString().equals("123")) {
                    Toast.makeText(login.this, "Access Granted!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(login.this, "access Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}