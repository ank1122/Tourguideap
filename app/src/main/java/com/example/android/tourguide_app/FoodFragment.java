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
        words.add(new Tour("Pitha", "The Pitthas in Jharkhand have a flavour of their own and is eaten with a variety of side dishes which sets it apart.", R.drawable.pitha));
        words.add(new Tour("Dhuska", "Dhuska is one of the most popular items in Jharkhand and is a part of every household. Your journey to Jharkhand is incomplete without tasting Dhuska", R.drawable.dhuska_food));
        words.add(new Tour("Rugra", "Rugra is an item which tastes like mushroom and is very delicious to eat. Rugra is basically an indigenous variety of vegetable, rich in protein and minerals and high on calorific value", R.drawable.rugra_food));
        words.add(new Tour("Thekua", " It has been used as a sweet snack in the region since centuries and is considered a revered Prasad during the Chatth Pooja.", R.drawable.thekua));
        words.add(new Tour("Litti", " Litti is a very famous food item in the State and savoured by the locals. It is eaten with Yoghurt, Baigan Bharta (Chokha), Alu Bharta or Papad.", R.drawable.litti));
        words.add(new Tour("Chilka", " Chilka Roti is one of those dishes which are prepared using rice flour and besan. ", R.drawable.chilka_food));
        words.add(new Tour("Bamboo Shoot", "The local people prepare a variety of dishes from the bamboo shot and mainly use it as a vegetable. You have to try it to experience its out-of-the-world flavour", R.drawable.bamboo_shoot__food));



        TourAdapter adapter = new TourAdapter(getActivity(), words, R.color.category_numbers);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);


        return rootView;
    }
}
