package com.example.forties;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //  getSupportActionBar().setDisplayHomeAsUpEnabled(false);

       final EditText mobile = (EditText) findViewById(R.id.mobile);
        Button login =  (Button) findViewById(R.id.register);
        Button guest =  (Button) findViewById(R.id.guest);
        TextView reg = (TextView) findViewById(R.id.log);
        TextView terms = (TextView)findViewById(R.id.condition);
        TextView privacy = (TextView)findViewById(R.id.policy);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mob = mobile.getText().toString().trim();
                String MobilePattern = "[0-9]{10}";

                if(mob.isEmpty())
                {

                    Toast.makeText(MainActivity.this, "Please enter Mobile Number  ", Toast.LENGTH_SHORT).show();
                    return;
                }else if(!mobile.getText().toString().matches(MobilePattern)){

                    Toast.makeText(MainActivity.this, "Please enter 10 Mobile Number  ", Toast.LENGTH_SHORT).show();
                    return;

            }
                else if(mobile.getText().toString().matches(MobilePattern)) {

                    //Toast.makeText(getApplicationContext(), "phone number is valid", Toast.LENGTH_SHORT).show();

                    Intent l = new Intent(MainActivity.this,Location.class);
                    startActivity(l);
                }

            }

        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(r);

            }
        });
        guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(MainActivity.this,Main6Activity.class);
                startActivity(g);

            }
        });

        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(MainActivity.this,Condition.class);
                startActivity(g);

            }
        });

        privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(MainActivity.this,Policy.class);
                startActivity(g);

            }
        });

    }
    @Override
    public void onBackPressed() {
        Intent bk = new Intent(MainActivity.this,MainActivity.class);
        startActivity(bk);
    }

}
