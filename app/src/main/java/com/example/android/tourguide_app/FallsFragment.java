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
        words.add(new Tour("Dasam Fall", getResources().getString(R.string.dasam), R.drawable.dassam_fall));
        words.add(new Tour("Hundru Fall", getResources().getString(R.string.hundru), R.drawable.hundru_fall));
        words.add(new Tour("Sita fall", getResources().getString(R.string.sita), R.drawable.sita_fall));
        words.add(new Tour("Jona Fall", getResources().getString(R.string.jona), R.drawable.jona_fall));
        words.add(new Tour("Hirni Fall", getResources().getString(R.string.hirni), R.drawable.hirni_fall));


        TourAdapter adapter = new TourAdapter(getActivity(), words, R.color.category_numbers);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);

        return rootView;
    }


}
