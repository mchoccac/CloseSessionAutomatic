package com.example.sessioncerrarautomaticamente;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.Button;




public class SecondActivity extends AppCompatActivity {

    private EditText userName;
    private EditText password;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        userName = (EditText) findViewById(R.id.username_field);
        password = (EditText) findViewById(R.id.pass_field);
        btnLogin = (Button) findViewById(R.id.btn_login);
        userName.setText("admin");
        password.setText("admin");

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userName.getText().toString().trim().equals("")) {
                    Toast.makeText(SecondActivity.this, "Please input your user name", Toast.LENGTH_SHORT).show();
                } else if (password.getText().toString().trim().equals("")) {
                    Toast.makeText(SecondActivity.this, "Please input your password", Toast.LENGTH_SHORT).show();
                } else if (userName.getText().toString().equals("admin") &&
                        password.getText().toString().equals("admin")) {
                    //Correct user name and password, go to main screen
                    Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(SecondActivity.this, "Wrong input data", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
