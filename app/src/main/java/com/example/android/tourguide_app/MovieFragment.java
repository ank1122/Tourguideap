package com.example.android.tourguide_app;

import android.content.Context;
import android.net.Uri;;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MovieFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MovieFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MovieFragment extends Fragment {
    public MovieFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of words
        final ArrayList<Tour> words = new ArrayList<Tour>();
        words.add(new Tour(getString(R.string.m1), getString(R.string.Eyelex), R.drawable.eyelexcinema));
        words.add(new Tour(getString(R.string.m2), getString(R.string.Popcorn), R.drawable.popcorncinema));
        words.add(new Tour(getString(R.string.m3), getString(R.string.Fun), R.drawable.funcinemas));
        words.add(new Tour(getString(R.string.m4), getString(R.string.Pvr), R.drawable.pvrcinema));
        words.add(new Tour(getString(R.string.m5), getString(R.string.Carnival), R.drawable.carnivalcinema));
        words.add(new Tour(getString(R.string.m6), getString(R.string.Jd), R.drawable.srscinema));
        words.add(new Tour(getString(R.string.m7), getString(R.string.Plaza), R.drawable.plazacinema));



        TourAdapter adapter = new TourAdapter(getActivity(), words, R.color.category_numbers);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);


        return rootView;
    }
}
