package com.example.viewpagerfestivaldevelop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    WormDotsIndicator dots;
    AdapterViewPager adapterViewPager;
    LinearLayout ground;

    int[] background = {
            R.color.bg_1,
            R.color.bg_2,
            R.color.bg_3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        dots = findViewById(R.id.dot);
        ground = findViewById(R.id.ground);

        adapterViewPager = new AdapterViewPager(this);
        viewPager.setAdapter(adapterViewPager);
        dots.setViewPager(viewPager);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                ground.setBackgroundResource(background[position]);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}