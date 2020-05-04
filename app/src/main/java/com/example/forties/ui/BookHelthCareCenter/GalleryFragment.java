package com.example.forties.ui.BookHelthCareCenter;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.forties.Booking;
import com.example.forties.Details;
import com.example.forties.Main3Activity;
import com.example.forties.Main4Activity;
import com.example.forties.R;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        Button btn = root.findViewById(R.id.booking);
        Button dtl = root.findViewById(R.id.detail);
        Button btn1 = root.findViewById(R.id.book);
        Button dtl1 = root.findViewById(R.id.detail1);
        ImageView bk = root. findViewById(R.id.bkk);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(getActivity(), Booking.class);
                startActivity(h);

            }
        });

        dtl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(getActivity(), Details.class);
                startActivity(c);

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(getActivity(),Booking.class);
                startActivity(h);

            }
        });

        dtl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(getActivity(), Main4Activity.class);
                startActivity(c);

            }
        });
        return root;
    }
    public void onBackPressed() {
        Intent bk = new Intent(getActivity(), Main3Activity.class);
        startActivity(bk);
    }
}
