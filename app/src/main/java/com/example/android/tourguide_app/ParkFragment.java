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
        words.add(new Tour("Jubli Park", "Jubilee Park is a park located in the city of Jamshedpur in India. It is a popular destination for all those who wish to have an outdoor picnic, enjoy some outdoor ...", R.drawable.jubli_park));
        words.add(new Tour("Rock Garden", "Rock Garden in Ranchi is considered to be one of the most visited places of the city as well as the state.", R.drawable.rock_garden_park));
        words.add(new Tour("Tagore Gill", "The Tagore Hill also known as Morabadi Hill is situated in Morabadi, Ranchi, Jharkhand. It's a place of attraction for jharkhand tourism due to its connection with great poet Rabindra Nath Tagore.", R.drawable.tagore_hill_park));
        words.add(new Tour("Water Park", "Fun Castle is the best water Park in Ranchi.If you are in Ranchi and when ever you gonna ask about the full Family and friends Masti Pack than one and only Name will come out that is Fun Castle Water Park. ", R.drawable.water_park));



        TourAdapter adapter = new TourAdapter(getActivity(), words, R.color.category_numbers);

        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);


        return rootView;
    }
}
