package com.example.practiceweeks8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.practiceweeks8.R;

public class Login extends AppCompatActivity {
    TextView emailSignIn, passwordSignIn;
    Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.face_screen);


    }
}