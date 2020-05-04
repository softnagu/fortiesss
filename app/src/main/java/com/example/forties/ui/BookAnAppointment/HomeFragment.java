package com.example.forties.ui.BookAnAppointment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import com.example.forties.Book_health;
import com.example.forties.Main3Activity;
import com.example.forties.Main5Activity;
import com.example.forties.MainActivity;
import com.example.forties.Profile;
import com.example.forties.R;
import com.example.forties.thirdfragment;
import com.example.forties.ui.BookHelthCareCenter.GalleryFragment;


public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        Button cardlogy = root.findViewById(R.id.card);
        Button health = root.findViewById(R.id.book);
        ImageView bk = root.findViewById(R.id.bk);
        final Spinner lc = root.findViewById(R.id.location);
        ImageView img = root.findViewById(R.id.sp);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),R.array.location, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lc.setAdapter(adapter);



        cardlogy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(getActivity(), Main5Activity.class);
                startActivity(c);

            }
        });

        health.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

//                Fragment fragment = new GalleryFragment();
//                Fragment fragment1 = new HomeFragment();
//
//                FragmentManager fm = getFragmentManager();
//                FragmentTransaction transaction = fm.beginTransaction();
//                transaction.replace(R.id.contentFragment,fragment);
//                transaction.remove(fragment1);
//                transaction.commit();
                Intent b = new Intent(getActivity(), Book_health.class);
                startActivity(b);
            }
        });


        return root;
    }

    public void onBackPressed() {
        Intent bk = new Intent(getActivity(),MainActivity.class);
        startActivity(bk);
    }
}
