package com.example.android.tourguide_app;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;


public class CategoryAdapter extends FragmentPagerAdapter {
    private String tabTitles[] = new String[]{"Falls", "Food", "Park"};

    public CategoryAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FallsFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else {
            return new ParkFragment();
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return 3;
    }



}
