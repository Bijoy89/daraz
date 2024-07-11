package com.example.darazinternassignment2.daraz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.darazinternassignment2.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Registration extends Fragment {

   View root;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.registration, container, false);
        ImageButton settingsButton = root.findViewById(R.id.setting);
        ImageView i1=root.findViewById(R.id.Freedelivery);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLink("https://pages.daraz.com.bd/wow/gcp/daraz/channel/bd/free-delivery/free-shipping?spm=a2a0e.home.top.dbr2.26ae12f7ZIy226&pfilter=1010Badge_206524&scm=1003.4.icms-zebra-100031732-2885620.OTHER_6502964490_7766365");
            }

        });
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the settings layout
                // Example: Replace current fragment with the settings fragment
                Setting settingsFragment = new Setting();
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment_content_main, settingsFragment)
                        .addToBackStack("Account")
                        .commit();
            }
        });

        return root;
    }
    public void onResume() {
        super.onResume();
        FloatingActionButton fab = requireActivity().findViewById(R.id.fab);
        fab.setVisibility(View.GONE);
    }
    private void openLink(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}