package com.example.darazinternassignment2.daraz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.darazinternassignment2.R;

public class Setting extends Fragment {


View root;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.setting, container, false);
        ImageButton backButton = root.findViewById(R.id.back1);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                int count = fragmentManager.getBackStackEntryCount();
                for (int i = count - 1; i >= 0; i--) {
                    FragmentManager.BackStackEntry entry = fragmentManager.getBackStackEntryAt(i);
                    if (entry.getName() != null && entry.getName().equals("Account")) {
                        fragmentManager.popBackStack(entry.getId(), FragmentManager.POP_BACK_STACK_INCLUSIVE);
                        break;
                    }
                }
            }
        });


        return root;
    }
}