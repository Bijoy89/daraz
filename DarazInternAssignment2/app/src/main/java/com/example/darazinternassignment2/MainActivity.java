package com.example.darazinternassignment2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.ImageButton;

import com.bumptech.glide.Glide;
import com.example.darazinternassignment2.daraz.Home;
import com.example.darazinternassignment2.daraz.gallery2;
import com.example.darazinternassignment2.daraz.slideshow;
import com.example.darazinternassignment2.ui.home.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    FloatingActionButton fab;
/*
    private AppBarConfiguration mAppBarConfiguration1;
*/

    //private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);
//        setSupportActionBar(binding.appBarMain.toolbar);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        fab = findViewById(R.id.fab);

        Glide.with(this)
                .asGif()
                .load(R.drawable.fabgif)
                .into(fab);
        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              /*  Snackbar.make(view, "This is a Floating Action Button", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/

                String url = "https://pages.daraz.com.bd/wow/gcp/daraz/megascenario/bd/global-fiesta-2024-bd/free-delivery-electronics?spm=a2a0e.tm800174660.1356928660.2.4e56f7a4TzhHxH";

                // Create an Intent to open the URL in a web browser
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                // Start the Intent
                startActivity(intent);
            }
        });

/*
        DrawerLayout drawer = binding.drawerLayout;
*/
        DrawerLayout drawer=findViewById(R.id.drawer_layout);
/*
        NavigationView navigationView = binding.navView;
*/
        NavigationView navigationView=findViewById(R.id.nav_view);
        BottomNavigationView bottomNavigationView=findViewById(R.id.nav_view1);

/*
        NavigationView navigationView1=findViewById(R.id.nav_view1);
*/


        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(

               R.id.home1, R.id.registration,R.id.gallery2, R.id.slideshow)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        NavigationUI.setupWithNavController(bottomNavigationView,navController);

        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController controller, @NonNull NavDestination destination, @Nullable Bundle arguments) {
                if (destination.getId() == R.id.gallery2 || destination.getId() == R.id.slideshow) {
                    bottomNavigationView.setVisibility(View.GONE);
                }
                if (destination.getId() == R.id.gallery2 || destination.getId() == R.id.slideshow|| destination.getId() == R.id.registration) {
                    findViewById(R.id.fab).setVisibility(View.GONE);
                }


                else {
                findViewById(R.id.fab).setVisibility(View.VISIBLE);
                bottomNavigationView.setVisibility(View.VISIBLE);
                }
            }
        });

/*
NavigationUI.setupWithNavController(navigationView1,navController);
*/
      /*  mAppBarConfiguration1 = new AppBarConfiguration.Builder(
                R.id.home2, R.id.gallery, R.id.slideshow)
                .setOpenableLayout(drawer)
                .build();
        NavController navController1 = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController1, mAppBarConfiguration1);
        NavigationUI.setupWithNavController(navigationView1, navController1);*/
/*
        NavigationUI.setupWithNavController(navigationView1, navController);
*/

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.gallery2) {
            NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
            navController.navigate(R.id.gallery2);
            return true;

        }
        if (id == R.id.registration) {
            NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
            navController.navigate(R.id.registration);
            return true;

        }
        if (id == R.id.home1) {
            NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
            navController.navigate(R.id.home1);
            return true;
        }
        if (id == R.id.slideshow) {
            NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
            navController.navigate(R.id.slideshow);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration) || super.onSupportNavigateUp();

    }

}