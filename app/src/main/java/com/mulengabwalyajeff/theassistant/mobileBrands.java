package com.mulengabwalyajeff.theassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mulengabwalyajeff.theassistant.uploadstock.sam_home_upload;
import com.mulengabwalyajeff.theassistant.uploadstock.techno_home;

public class mobileBrands extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_brands);
    }

    public void samdevdata(View view) {
        Intent samdevices = new Intent(this, sam_home_upload.class);
        startActivity(samdevices);
    }

    public void uploadtechno(View view) {
        Intent samdevices = new Intent(this, techno_home.class);
        startActivity(samdevices);
    }
}
