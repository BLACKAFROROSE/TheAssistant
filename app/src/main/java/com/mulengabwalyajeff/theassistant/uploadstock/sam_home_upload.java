package com.mulengabwalyajeff.theassistant.uploadstock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mulengabwalyajeff.theassistant.R;
import com.mulengabwalyajeff.theassistant.uploadstock.samsung.sam_charger;
import com.mulengabwalyajeff.theassistant.uploadstock.samsung.sam_cover;
import com.mulengabwalyajeff.theassistant.uploadstock.samsung.sam_headsets;
import com.mulengabwalyajeff.theassistant.uploadstock.samsung.sam_lcd;
import com.mulengabwalyajeff.theassistant.uploadstock.samsung.sam_topglass;

public class sam_home_upload extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sam_home_upload);
    }

    public void addsamchargre(View view) {
        Intent addcharger = new Intent(this, sam_charger.class);
        startActivity(addcharger);
    }

    public void addsamheadsets(View view) {
        Intent addheadsets = new Intent(this, sam_headsets.class);
        startActivity(addheadsets);
    }

    public void addsamlcd(View view) {
        Intent addlcd = new Intent(this, sam_lcd.class);
        startActivity(addlcd);
    }

    public void addsamtopglass(View view) {
        Intent addtopglass = new Intent(this, sam_topglass.class);
        startActivity(addtopglass);
    }

    public void addsamcovers(View view) {
        Intent addcovers = new Intent(this, sam_cover.class);
        startActivity(addcovers);
    }
}