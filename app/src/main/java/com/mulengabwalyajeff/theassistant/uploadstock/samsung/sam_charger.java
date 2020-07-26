package com.mulengabwalyajeff.theassistant.uploadstock.samsung;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.mulengabwalyajeff.theassistant.R;

import java.util.HashMap;
import java.util.Map;

public class sam_charger extends AppCompatActivity {

    public static final  String TAG = "sam_charger";
    public static final  String KEY_TITLE="title";
    public static final  String KEY_DESCRIPTION="description";
    public static final  String KEY_INFORMATION="information";
    public static final  String KEY_PRICE="price";


    EditText chargertitle;
    EditText chargerdescription;
    EditText chargerinfomation;
    EditText chargerprice;

    private FirebaseFirestore samchargerdb = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sam_charger);

        chargertitle=findViewById(R.id.samchargername);
        chargerdescription=findViewById(R.id.samchargerdescription);
        chargerinfomation=findViewById(R.id.samchargerinfomation);
        chargerprice=findViewById(R.id.samchargerprice);
    }

    public void saveNote(View view) {
        String title = chargertitle.getText().toString();
        String description = chargerdescription.getText().toString();
        String information = chargerinfomation.getText().toString();
        String price = chargerprice.getText().toString();

        Map<String, Object> samcharger = new HashMap<>();
        samcharger.put(KEY_TITLE,title);
        samcharger.put(KEY_DESCRIPTION,description);
        samcharger.put(KEY_INFORMATION,information);
        samcharger.put(KEY_PRICE,price);

        samchargerdb.collection("SAMSUNG").document("CHARGER")
                .set(samcharger)

                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(sam_charger.this, "ADDED PROPERLY", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(sam_charger.this, " DIDNT ADD", Toast.LENGTH_SHORT).show();
                    }
                });



    }
}