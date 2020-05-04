package com.example.forties;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class Details extends AppCompatActivity {
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String > adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
       // Button bck = (Button)findViewById(R.id.bk);
        Button bk = (Button)findViewById(R.id.book);
        ImageView ck = (ImageView) findViewById(R.id.ck);
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


//        bck.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent back = new Intent(Details.this,Book_health.class);
//                startActivity(back);
//                finish();
//            }
//        });

        ImageView call = (ImageView) this.findViewById(R.id.call);
        ImageView not = (ImageView) this.findViewById(R.id.info);

        not.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent cl = new Intent(Details.this, Notification.class);
                startActivity(cl);
            }
        });
        call.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent cl = new Intent(Details.this, Calling.class);
                startActivity(cl);
            }
        });
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent book = new Intent(Details.this,Booking.class);
                startActivity(book);
                finish();
            }
        });

        ck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Details.this,Book_health.class);
                startActivity(b);

            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent b = new Intent(Details.this,Book_health.class);
        startActivity(b);
    }
}
