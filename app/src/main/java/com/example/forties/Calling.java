package com.example.forties;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Calling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calling);
        ImageView cal = (ImageView) findViewById(R.id.call);
        ImageView cancel = (ImageView)findViewById(R.id.cancel);


        cal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:7406068033"));
//
//                if (ActivityCompat.checkSelfPermission(Calling.this,
//                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    return;
//                }
//                startActivity(callIntent);

                final int REQUEST_PHONE_CALL = 1;
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+91 91480 45287"));
                if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (ContextCompat.checkSelfPermission(Calling.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(Calling.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else

                    {
                        startActivity(intent);
                    }
                }
                else
                {
                    startActivity(intent);

                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bk = new Intent(Calling.this,Main6Activity.class);
                startActivity(bk);
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent bk = new Intent(Calling.this,Main6Activity.class);
        startActivity(bk);
    }
}
