package com.files.shoppie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ViewPagerAdapter extends PagerAdapter {
    int[] img;
    Context context;

    public ViewPagerAdapter(Context context, int[] img) {
        this.img = img;
        this.context = context;
    }


    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.slide_layout, container, false);
        container.addView(view);
        ImageView imageView = view.findViewById(R.id.imageView3);
        // Glide.with(context).load(images[position]).into(imageView);//uses in case of url
        imageView.setBackgroundResource(img[position]);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

}