package com.example.forties;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import com.example.forties.ui.main.SectionsPagerAdapter2;

public class Profile extends AppCompatActivity {
    CheckBox location,location1,location2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        SectionsPagerAdapter2 sectionsPagerAdapter = new SectionsPagerAdapter2(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);
        ImageView call = (ImageView) this.findViewById(R.id.call);
        ImageView not = (ImageView) this.findViewById(R.id.info);

        not.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent cl = new Intent(Profile.this, Notification.class);
                startActivity(cl);
            }
        });
        call.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent cl = new Intent(Profile.this, Calling.class);
                startActivity(cl);
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Emergency Please Contact : 9148045287", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.feedback.avriant.com"));
                startActivity(Getintent);
            }
        });
    }
//    public void onCheckboxClicked(boolean view) {
//        switch(view.getId()) {
//
//            case R.id.check1:
//
//                location1.setChecked(false);
//                location2.setChecked(false);
//
//                break;
//
//            case R.id.check2:
//
//                location.setChecked(false);
//                location2.setChecked(false);
//
//                break;
//
//            case R.id.check3:
//
//                location.setChecked(false);
//                location1.setChecked(false);
//
//                break;
//        }}
    @Override
    public void onBackPressed() {
        Intent b = new Intent(Profile.this,Main5Activity.class);
        startActivity(b);
    }
}