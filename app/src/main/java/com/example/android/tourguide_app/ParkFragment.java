package com.example.android.tourguide_app;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ParkFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ParkFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ParkFragment extends Fragment {
    public ParkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);


        // Create a list of words
        final ArrayList<Tour> words = new ArrayList<Tour>();
        words.add(new Tour(getString(R.string.p1), getString(R.string.Jubli), R.drawable.jubli_park));
        words.add(new Tour(getString(R.string.p2), getString(R.string.Rock), R.drawable.rock_garden_park));
        words.add(new Tour(getString(R.string.p3), getString(R.string.Tagore), R.drawable.tagore_hill_park));
        words.add(new Tour(getString(R.string.p4), getString(R.string.Water), R.drawable.water_park));



        TourAdapter adapter = new TourAdapter(getActivity(), words, R.color.category_numbers);

        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);


        return rootView;
    }
}
