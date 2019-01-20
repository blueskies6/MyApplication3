package com.example.administrator.myapplication;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.administrator.myapplication.base.BaseFragment;
import com.example.administrator.myapplication.fragment.AnimalFragment;
import com.example.administrator.myapplication.fragment.CarToonFragment;
import com.example.administrator.myapplication.fragment.DishFragment;

public class BilibiliMyself extends AppCompatActivity {
    private android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    private BaseFragment[] fragments = {new AnimalFragment(),new CarToonFragment(),new DishFragment()};



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                        changeFragment(0);
                    return true;
                case R.id.navigation_dashboard:
                        changeFragment(1);
                    return true;
                case R.id.navigation_notifications:
                        changeFragment(2);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilibili_myself);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        initFragment();
    }

    private void initFragment()
    {
        for (int i = 0; i < 3; i++)
        {
            fragmentManager.beginTransaction().add(R.id.fragment_container,fragments[i]);
        }
    }
    private void changeFragment(int position){
        fragmentManager.beginTransaction().replace(R.id.fragment_container,fragments[position]).commit();
    }

}
