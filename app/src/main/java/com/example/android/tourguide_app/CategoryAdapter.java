package com.example.android.tourguide_app;

import android.content.Context;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;


public class CategoryAdapter extends FragmentPagerAdapter {
   Context context;

    public CategoryAdapter(FragmentManager fm, Context nContext) {
        super(fm);
        context = nContext;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FallsFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if(position==2) {
            return new ParkFragment();
        }
        else{
            return new MovieFragment();
        }


    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return context.getResources().getString(R.string.ca1);
            case 1:
                return context.getResources().getString(R.string.ca2);
            case 2:
                return context.getResources().getString(R.string.ca3);
            case 3:
                return context.getResources().getString(R.string.ca4);
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }



}
