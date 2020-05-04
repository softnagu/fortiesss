package com.example.forties;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageView;

public class Main7Activity extends AppCompatActivity {
    private static final int CAMERA_REQUEST = 1888;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        ImageView img = (ImageView) findViewById(R.id.image);
        ImageView bk = (ImageView) findViewById(R.id.ck);


        img.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);
            }
        });
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Main7Activity.this,Booking.class);
                startActivity(b);

            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent bck = new Intent(Main7Activity.this,Booking.class);
        startActivity(bck);
    }
}
