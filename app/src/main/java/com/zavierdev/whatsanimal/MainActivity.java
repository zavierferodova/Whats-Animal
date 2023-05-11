package com.zavierdev.whatsanimal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.TargetApi;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private static int checkAudio = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.viewpager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new OneFragment(), "Home");
        adapter.addFragment(new TwoFragment(), "About");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        if(checkAudio == 0) {
            MediaPlayer player = MediaPlayer.create(MainActivity.this,R.raw.selamat_datang);
            player.start();
            checkAudio++;
        }
        else if(checkAudio == 1) {
            checkAudio = 1;
        }
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mList = new ArrayList<>();
        private final List<String> mTitleList = new ArrayList<>();
        public ViewPagerAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }
        @Override
        public Fragment getItem(int i) {
            return mList.get(i);
        }
        @Override
        public int getCount() {
            return mList.size();
        }
        public void addFragment(Fragment fragment, String title) {
            mList.add(fragment);
            mTitleList.add(title);
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return mTitleList.get(position);
        }
    }
}
