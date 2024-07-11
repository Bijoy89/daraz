package com.example.darazinternassignment2.daraz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.darazinternassignment2.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class slideshow extends Fragment {
View root;
    private ImageButton closeButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.slideshow, container, false);
        closeButton = root.findViewById(R.id.closeButton);

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(slideshow.this)
                        .navigate(R.id.action_slideshow_to_home);

            }
        });
        return root;
    }
    public void onResume() {
        super.onResume();
        FloatingActionButton fab = requireActivity().findViewById(R.id.fab);
        fab.setVisibility(View.GONE);
    }
}