package com.example.viewpagerfestivaldevelop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class AdapterViewPager extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public AdapterViewPager(Context context) {
        this.context = context;
    }

    int [] gambar = {
            R.drawable.gambar_1,
            R.drawable.gambar_2,
            R.drawable.gambar_3,
    };

    @Override
    public int getCount() {
        return gambar.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.layout_item,container,false);

        ImageView gambars = view.findViewById(R.id.gambar);

        gambars.setImageResource(gambar[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        View view = (View) object;
        container.removeView(view);
    }
}
