package com.mulengabwalyajeff.theassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class welcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Button checksales = findViewById(R.id.checkSalesButton);

        Button uploadstock = findViewById(R.id.uploadStockButton);

    }

public void makesales(View view){


}

    public void uploadstock(View view) {
        Intent intent = new Intent(this,mobileBrands.class);
        startActivity(intent);

    }
}
