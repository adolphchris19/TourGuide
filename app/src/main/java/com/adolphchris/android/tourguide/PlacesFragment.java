package com.adolphchris.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PlacesFragment extends Fragment {

    public PlacesFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_places, container, false);


        final ArrayList<ListData> listData = new ArrayList<>();

        listData.add(new ListData(R.drawable.national_museum, getContext().getString(R.string.national_museum), getContext().getString(R.string.national_museum_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.freedom_park, getContext().getString(R.string.freedom_park), getContext().getString(R.string.freedom_park_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.tarkwa_beach, getContext().getString(R.string.tarkwa_beach), getContext().getString(R.string.tarkwa_beach_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.jhalobia, getContext().getString(R.string.jhalobia_park), getContext().getString(R.string.jhalobia_park_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.dreamworld, getContext().getString(R.string.dreamworld), getContext().getString(R.string.dreamworld_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.high_impact, getContext().getString(R.string.hi_impact_planet), getContext().getString(R.string.hi_impact_planet_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.fun_factory, getContext().getString(R.string.fun_factory), getContext().getString(R.string.fun_factory_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.musical, getContext().getString(R.string.musical_society), getContext().getString(R.string.musical_society_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.tafawa, getContext().getString(R.string.tafawa_square), getContext().getString(R.string.tafawa_square_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.eko_atlantic, getContext().getString(R.string.eko_atlantic), getContext().getString(R.string.eko_atlantic_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));


        ListViewAdapter adapter = new ListViewAdapter(getActivity(), R.layout.list_template, listData);

        ListView listView = (ListView) view.findViewById(R.id.places_List);

        listView.setAdapter(adapter);



        return view;
    }


}