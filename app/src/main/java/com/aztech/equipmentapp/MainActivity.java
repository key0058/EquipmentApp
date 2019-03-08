package com.aztech.equipmentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void userLogin(View view) {
        TextView usernameTextView = findViewById(R.id.username);
        TextView passwordTextView = findViewById(R.id.password);
        String message = usernameTextView.getText() + "---" + passwordTextView.getText();
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
