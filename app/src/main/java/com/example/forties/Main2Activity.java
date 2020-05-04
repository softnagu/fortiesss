package com.example.forties;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Main2Activity extends AppCompatActivity {

    private static final int CAMERA_REQUEST = 1888;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final EditText first = (EditText) findViewById(R.id.fname);
        final EditText last = (EditText) findViewById(R.id.lname);
        final EditText email = (EditText) findViewById(R.id.mail);
        final EditText mob = (EditText) findViewById(R.id.mobile);
        final EditText emergency = (EditText) findViewById(R.id.emergency);
        final EditText guardian = (EditText) findViewById(R.id.guardian);
        final EditText address = (EditText) findViewById(R.id.add1);
        final EditText address1 = (EditText) findViewById(R.id.add2);
        final EditText pin = (EditText) findViewById(R.id.pincode);
        Button register = (Button) findViewById(R.id.register);
        final Spinner country = (Spinner) findViewById(R.id.country);
        final Spinner state = (Spinner) findViewById(R.id.state);
        final Spinner city = (Spinner) findViewById(R.id.city);
        final Spinner gender = (Spinner) findViewById(R.id.gender);
        Spinner marital = (Spinner) findViewById(R.id.marital);
        TextView logs = (TextView) findViewById(R.id.login);
        ImageView bk = (ImageView) findViewById(R.id.bk);
        ImageView img = (ImageView) this.findViewById(R.id.photo);
        ImageView img1 = (ImageView) this.findViewById(R.id.profile);
        ImageView call = (ImageView) this.findViewById(R.id.call);
        ImageView not = (ImageView) this.findViewById(R.id.info);
//        FloatingActionButton fab = findViewById(R.id.fab);
//
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Snackbar.make(view, "Emergency Please Contact : 9148045287", Snackbar.LENGTH_LONG)
////                        .setAction("Action", null).show();
//                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://feedback.avriant.com"));
//                startActivity(Getintent);
//            }
//        });

        not.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent cl = new Intent(Main2Activity.this, Notification.class);
                startActivity(cl);
            }
        });
        call.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent cl = new Intent(Main2Activity.this, Calling.class);
                startActivity(cl);
            }
        });

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.country, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        country.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.state, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        state.setAdapter(adapter1);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.city, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        city.setAdapter(adapter2);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.gender, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gender.setAdapter(adapter3);

        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this, R.array.marital, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        marital.setAdapter(adapter4);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname = first.getText().toString().trim();
                String lname = last.getText().toString().trim();
                String mail = email.getText().toString().trim();
                String mobile = mob.getText().toString().trim();
                String emer = emergency.getText().toString().trim();
                String guard = guardian.getText().toString().trim();
                String add = address.getText().toString().trim();
                String add1 = address1.getText().toString().trim();
                String pincode = pin.getText().toString().trim();
                String MobilePattern = "[0-9]{10}";
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


                if (fname.isEmpty()) {
                    Toast.makeText(Main2Activity.this, "Please enter First Name", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (lname.isEmpty()) {
                    Toast.makeText(Main2Activity.this, "Please enter Last Name", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (mobile.isEmpty()) {
                    Toast.makeText(Main2Activity.this, "Please enter Mobile Number", Toast.LENGTH_SHORT).show();
                    return;
                } else if (!mob.getText().toString().matches(MobilePattern)) {

                    Toast.makeText(Main2Activity.this, "Please enter 10 Mobile Number  ", Toast.LENGTH_SHORT).show();
                    return;

                }
//                else if(mob.getText().toString().matches(MobilePattern)) {
//
//                    Toast.makeText(getApplicationContext(), "phone number is valid", Toast.LENGTH_SHORT).show();
//                    return;
//                }

                if (emer.isEmpty()) {
                    Toast.makeText(Main2Activity.this, "Please enter Emergency Mobile Number", Toast.LENGTH_SHORT).show();
                    return;
                } else if (!emergency.getText().toString().matches(MobilePattern)) {

                    Toast.makeText(Main2Activity.this, "Please enter 10 Mobile Number  ", Toast.LENGTH_SHORT).show();
                    return;

                }
//                else if(emergency.getText().toString().matches(MobilePattern)) {
//
//                    Toast.makeText(getApplicationContext(), "phone number is valid", Toast.LENGTH_SHORT).show();
//                    return;
//
//                }

                if (mail.isEmpty()) {
                    Toast.makeText(Main2Activity.this, "Please enter Email", Toast.LENGTH_SHORT).show();
                    return;
                } else if (!email.getText().toString().matches(emailPattern)) {

                    Toast.makeText(Main2Activity.this, "Please Enter Valid Email Address", Toast.LENGTH_SHORT).show();
                    return;

                }
//                else if(email.getText().toString().matches(emailPattern)) {
//
//                    Toast.makeText(getApplicationContext(), "valid email address", Toast.LENGTH_SHORT).show();
//                    return;
//                }

                if (guard.isEmpty()) {
                    Toast.makeText(Main2Activity.this, "Please enter Guardian Name", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (add.isEmpty()) {
                    Toast.makeText(Main2Activity.this, "Please enter Address", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (add1.isEmpty()) {
                    Toast.makeText(Main2Activity.this, "Please enter Address", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (pincode.isEmpty()) {
                    Toast.makeText(Main2Activity.this, "Please enter Pincode", Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(Main2Activity.this, "Your Registration successfull", Toast.LENGTH_SHORT).show();
                Intent regi = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(regi);

            }
        });
        logs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(l);

            }
        });

        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(b);

            }
        });
        img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);
            }
        });


    }
    @Override
    public void onBackPressed() {
        Intent bk = new Intent(Main2Activity.this,MainActivity.class);
        startActivity(bk);
    }

}
