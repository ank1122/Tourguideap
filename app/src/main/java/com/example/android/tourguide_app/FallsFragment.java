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
 * {@link FallsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FallsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FallsFragment extends Fragment {


    public FallsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of words
        final ArrayList<Tour> words = new ArrayList<Tour>();
        words.add(new Tour("Dasam Fall", "The Dassam Falls is 40 kilometres (25 mi) from Ranchi on NH 33 or Ranchi-Jamshedpur highway.", R.drawable.dassam_fall));
        words.add(new Tour("Hundru Fall", "The Hundru Falls is a waterfall located in Ranchi district in the Indian state of Jharkhand. It is the 34th highest waterfall in India.", R.drawable.hundru_fall));
        words.add(new Tour("Sita fall", "Sita falls is located in Ramgarh district of Jharkhand state. The district is located at 23°20’30″N   85°38’38″E.", R.drawable.sita_fall));
        words.add(new Tour("Jona Fall", "The Jonha Falls (Hindi: जोन्हा जलप्रपात) (also called Gautamdhara Falls) is a waterfall located in Ranchi district in the Indian state of Jharkhand.", R.drawable.jona_fall));
        words.add(new Tour("Hirni Fall", "Hirni Falls is a waterfall located in West Singhbhum in the Indian state of Jharkhand", R.drawable.hirni_fall));


        TourAdapter adapter = new TourAdapter(getActivity(), words, R.color.category_numbers);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);

        return rootView;
    }


}
