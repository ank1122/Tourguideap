package com.example.android.tourguide_app;

import android.content.Context;
import android.net.Uri;
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
 * {@link FoodFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FoodFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodFragment extends Fragment {
    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of words
        final ArrayList<Tour> words = new ArrayList<Tour>();
        words.add(new Tour("Pitha", getString(R.string.Pitha), R.drawable.pitha));
        words.add(new Tour("Dhuska", getString(R.string.Dhuska), R.drawable.dhuska_food));
        words.add(new Tour("Rugra", getString(R.string.Rugra), R.drawable.rugra_food));
        words.add(new Tour("Thekua", getString(R.string.Thekua), R.drawable.thekua));
        words.add(new Tour("Litti", getString(R.string.Litti), R.drawable.litti));
        words.add(new Tour("Chilka", getString(R.string.Chilka), R.drawable.chilka_food));
        words.add(new Tour("Bamboo Shoot", getString(R.string.bamboo_stick), R.drawable.bamboo_shoot__food));



        TourAdapter adapter = new TourAdapter(getActivity(), words, R.color.category_numbers);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);


        return rootView;
    }
}
