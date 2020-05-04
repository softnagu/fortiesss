package com.example.forties;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Location extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        ImageView bk = (ImageView) findViewById(R.id.bk);
        final Spinner place = (Spinner)findViewById(R.id.place);
        final Spinner location = (Spinner) findViewById(R.id.location);
        Button sub = (Button)findViewById(R.id.submit);
        ImageView call = (ImageView) this.findViewById(R.id.call);
        ImageView not = (ImageView) this.findViewById(R.id.info);
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Emergency Please Contact : 9148045287", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://feedback.avriant.com"));
                startActivity(Getintent);
            }
        });

        not.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent cl = new Intent(Location.this, Notification.class);
                startActivity(cl);
            }
        });
        call.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent cl = new Intent(Location.this, Calling.class);
                startActivity(cl);
            }
        });
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.hospital, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        place.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.location, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        location.setAdapter(adapter1);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(Location.this,Main6Activity.class);
                startActivity(s);

            }
        });

        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Location.this,MainActivity.class);
                startActivity(b);

            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent bk = new Intent(Location.this,MainActivity.class);
        startActivity(bk);
    }
}
