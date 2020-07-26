package com.mulengabwalyajeff.theassistant.uploadstock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mulengabwalyajeff.theassistant.R;
import com.mulengabwalyajeff.theassistant.uploadstock.samsung.sam_charger;
import com.mulengabwalyajeff.theassistant.uploadstock.techno.techno_charger;
import com.mulengabwalyajeff.theassistant.uploadstock.techno.techno_cover;
import com.mulengabwalyajeff.theassistant.uploadstock.techno.techno_headsets;
import com.mulengabwalyajeff.theassistant.uploadstock.techno.techno_lcd;
import com.mulengabwalyajeff.theassistant.uploadstock.techno.techno_topglass;

public class techno_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techno_home);
    }

    public void addtechnocovers(View view) {
        Intent addcharger = new Intent(this, techno_cover.class);
        startActivity(addcharger);
    }

    public void addtechnotopglass(View view) {
        Intent addcharger = new Intent(this, techno_topglass.class);
        startActivity(addcharger);
    }

    public void addtechnolcd(View view) {
        Intent addcharger = new Intent(this, techno_lcd.class);
        startActivity(addcharger);
    }

    public void addtechnoheadsets(View view) {
        Intent addcharger = new Intent(this, techno_headsets.class);
        startActivity(addcharger);
    }

    public void addtechnochargre(View view) {
        Intent addcharger = new Intent(this, techno_charger.class);
        startActivity(addcharger);
    }
}