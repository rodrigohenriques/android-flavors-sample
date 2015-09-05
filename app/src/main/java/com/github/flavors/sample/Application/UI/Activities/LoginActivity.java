package com.github.flavors.sample.Application.UI.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.declink.msg.Greetings;

import com.github.flavors.sample.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
        Greetings greetings = new Greetings();
        Toast.makeText(this, greetings.teste(), Toast.LENGTH_LONG).show();
    }
}
