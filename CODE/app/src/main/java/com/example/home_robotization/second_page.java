package com.example.home_robotization;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class second_page extends AppCompatActivity {
    EditText usr, pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
    }

    public void userLogin(View view) {
        //local log in
        usr = (EditText) findViewById(R.id.username);
        pwd = (EditText) findViewById(R.id.password);
        if (usr.getText().toString().equals("admin") && pwd.getText().toString().equals("1234")) {
            Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(second_page.this, bluetooth.class);
            second_page.this.startActivity(myIntent);
        } else {
            Toast.makeText(getApplicationContext(), "Wrong!", Toast.LENGTH_SHORT).show();
        }
    }
}
