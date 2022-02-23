package com.files.shoppie;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PhotosAdapter extends FragmentStatePagerAdapter {
    public PhotosAdapter(FragmentManager fm, Integer[] imageId) {
        super(fm);

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 2;
    }
}
