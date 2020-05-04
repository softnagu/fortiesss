package com.example.forties.ui.main;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.forties.Booking;
import com.example.forties.Profile;
import com.example.forties.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment2 extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel2 pageViewModel2;

    public static PlaceholderFragment2 newInstance(int index) {
        PlaceholderFragment2 fragment = new PlaceholderFragment2();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel2 = ViewModelProviders.of(this).get(PageViewModel2.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel2.setIndex(index);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootview = null;
        switch(getArguments().getInt(ARG_SECTION_NUMBER))
        {
            case 1 :
                //do
                rootview = inflater.inflate(R.layout.fragment_profile, container, false);
                Button btn;
                final CheckBox location,location1,location2;
                btn = rootview.findViewById(R.id.click);
                location = rootview.findViewById(R.id.check1);
                location1 = rootview.findViewById(R.id.check2);
                location2 =  rootview.findViewById(R.id.check3);

                btn.setOnClickListener(new View.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.O)
                    @Override
                    public void onClick(View v) {

                        if(location.isChecked())
                        {
                            Toast.makeText(getActivity(), "Successfully Selected :", Toast.LENGTH_SHORT).show();
                            Intent l = new Intent(getActivity(), Booking.class);
                            startActivity(l);
                        }
                        else if(location1.isChecked())
                        {
                            Toast.makeText(getActivity(), "Successfully Selected :", Toast.LENGTH_SHORT).show();
                            Intent l = new Intent(getActivity(), Booking.class);
                            startActivity(l);
                        }
                        else if(location2.isChecked())
                        {
                            Toast.makeText(getActivity(), "Successfully Selected :", Toast.LENGTH_SHORT).show();
                            Intent l = new Intent(getActivity(), Booking.class);
                            startActivity(l);
                        }
                        else
                        {
                            Toast.makeText(getActivity(), "Please Select Location", Toast.LENGTH_SHORT).show();
                        }

                    }
                });

                break;
            case 2 :
                //do
                rootview = inflater.inflate(R.layout.fragment_thirdfragment, container, false);
                break;

        }

        return rootview;
    }
}