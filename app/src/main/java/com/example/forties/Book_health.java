package com.example.forties;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Book_health extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_health);
        Button btn = (Button)findViewById(R.id.booking);
        Button dtl = (Button)findViewById(R.id.detail);
        Button btn1 = (Button)findViewById(R.id.book);
        Button dtl1 = (Button)findViewById(R.id.detail1);
        ImageView bk = (ImageView) findViewById(R.id.bkk);
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
                Intent cl = new Intent(Book_health.this, Notification.class);
                startActivity(cl);
            }
        });
        call.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent cl = new Intent(Book_health.this, Calling.class);
                startActivity(cl);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(Book_health.this,Booking.class);
                startActivity(h);
                finish();
            }
        });

        dtl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Book_health.this,Details.class);
                startActivity(c);
                finish();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(Book_health.this,Booking.class);
                startActivity(h);
                finish();
            }
        });

        dtl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Book_health.this,Main4Activity.class);
                startActivity(c);
                finish();
            }
        });
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Book_health.this,Main6Activity.class);
                startActivity(b);

            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent bk = new Intent(Book_health.this,Main6Activity.class);
        startActivity(bk);
    }
}
