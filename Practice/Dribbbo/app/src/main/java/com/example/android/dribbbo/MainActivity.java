package com.example.android.dribbbo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

import butterknife.BindViews;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindViews(R.id.drawer) NavigationView navigationView;
    @BindViews(R.id.drawer_layout) DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setupDrawer();
//        if (savedInstanceState == null) {
//            getSupportFragmentManager()
//                    .beginTransaction()
//                    .add(R.id.fragment_container, ShotListFragment,newInstance())
//                    .commit();
//        }
    }
    public void setupDrawer() {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.isChecked()) {
                    drawerLayout.closeDrawers();
                    return true;
                }
                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.drawer_item_home:
                        fragment =ShotListFragment.newInstance();
                        setTitle(R.string.title_home);
                        //Toast.makeText(MainActivity.this, "home clicked", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.drawer_item_likes:
                        Toast.makeText(MainActivity.this, "Likes clicked", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.drawer_item_buckets:
                        Toast.makeText(MainActivity.this, "Buckets clicked", Toast.LENGTH_LONG).show();
                        break;
                }
                drawerLayout.closeDrawers();//关闭导航栏
                return false;
            }
        });
    }




}
