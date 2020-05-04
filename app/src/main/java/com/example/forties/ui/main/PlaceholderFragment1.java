package com.example.forties.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.forties.Conference;
import com.example.forties.Main5Activity;
import com.example.forties.Main7Activity;
import com.example.forties.Profile;
import com.example.forties.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment1 extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel1 pageViewModel;

    public static PlaceholderFragment1 newInstance(int index) {
        PlaceholderFragment1 fragment = new PlaceholderFragment1();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel1.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);
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
               rootview = inflater.inflate(R.layout.fragment_first, container, false);
                Button btn;
                 btn= rootview.findViewById(R.id.doctor);

                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getActivity(), Profile.class);
                        startActivity(i);
                    }
                });
                break;
            case 2 :
                //do
                rootview = inflater.inflate(R.layout.fragment_secand, container, false);
                break;

        }

        return rootview;


    }
}