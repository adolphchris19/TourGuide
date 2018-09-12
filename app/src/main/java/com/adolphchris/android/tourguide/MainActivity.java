package com.adolphchris.android.tourguide;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(navClickListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeFragment()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navClickListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Fragment selectedfragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    selectedfragment = new HomeFragment();
                    break;
                case R.id.navigation_hotels:
                    selectedfragment = new HotelsFragment();
                    break;
                case R.id.navigation_malls:
                    selectedfragment = new MallsFragment();
                    break;
                case R.id.navigation_eatery:
                    selectedfragment = new EateryFragment();
                    break;
                case R.id.navigation_places:
                    selectedfragment = new PlacesFragment();
                    break;
            }
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, selectedfragment);
            transaction.commit();
            return true;
        }
    };
}
