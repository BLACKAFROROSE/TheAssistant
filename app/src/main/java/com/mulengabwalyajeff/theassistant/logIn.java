package com.mulengabwalyajeff.theassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class logIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }
    public  void loginpage (View view){
        Intent intent =new Intent( this, welcomeActivity.class);
        startActivity(intent);

    }
}
