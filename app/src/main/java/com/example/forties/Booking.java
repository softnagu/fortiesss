package com.example.forties;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Booking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        Button btn = (Button)findViewById(R.id.confirm);
        Button btn1 = (Button)findViewById(R.id.conference);
        ImageView bk = (ImageView) findViewById(R.id.bk);
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
                Intent cl = new Intent(Booking.this, Notification.class);
                startActivity(cl);
            }
        });
        call.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent cl = new Intent(Booking.this, Calling.class);
                startActivity(cl);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(Booking.this, "Booking Confirmed", Toast.LENGTH_SHORT).show();

                Intent c = new Intent(Booking.this,Billing.class);
                startActivity(c);
                finish();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(Booking.this, "Booking Confirmed", Toast.LENGTH_SHORT).show();

                Intent c = new Intent(Booking.this,Main7Activity.class);
                startActivity(c);
                finish();
            }
        });
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Booking.this,Main3Activity.class);
                startActivity(b);

            }
        });

    }
    @Override
    public void onBackPressed() {
        Intent bk = new Intent(Booking.this,Main3Activity.class);
        startActivity(bk);
    }
}
