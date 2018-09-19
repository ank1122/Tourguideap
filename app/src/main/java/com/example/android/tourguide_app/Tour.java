package com.example.android.tourguide_app;

import java.lang.String;

public class Tour {


    private String mDefaultPlaces;

    private String mDetail;

    private int mImageResourceId = No_IMAGE_PROVIDED;

    private static final int No_IMAGE_PROVIDED = -1;


    public Tour(String defaultPlaces, String mPlacesdetail) {
        mDefaultPlaces = defaultPlaces;
        mDetail = mPlacesdetail;

    }


    public Tour(String defaultPlaces, String mPlacesdetail, int imageResourceId) {
        mDefaultPlaces = defaultPlaces;
        mDetail = mPlacesdetail;
        mImageResourceId = imageResourceId;
    }


    public String getmDefaultPlaces() {
        return mDefaultPlaces;
    }


    public String getmDetail() {
        return mDetail;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != No_IMAGE_PROVIDED;
    }


}
