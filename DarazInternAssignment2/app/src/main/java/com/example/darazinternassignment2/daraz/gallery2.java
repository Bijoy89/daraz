package com.example.darazinternassignment2.daraz;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.darazinternassignment2.MainActivity;
import com.example.darazinternassignment2.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class gallery2 extends Fragment {

View root;
    private ImageButton closeButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root= inflater.inflate(R.layout.gallery2, container, false);
        closeButton = root.findViewById(R.id.closeButton);
        BottomNavigationView bottomNavigationView = getActivity().findViewById(R.id.nav_view1);
        bottomNavigationView.setVisibility(View.GONE);

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(gallery2.this)
                        .navigate(R.id.action_gallery2_to_home);
                bottomNavigationView.setVisibility(View.VISIBLE);


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