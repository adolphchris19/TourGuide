package com.adolphchris.android.tourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MallsFragment extends Fragment {

    public MallsFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_malls, container, false);


        final ArrayList<ListData> listData = new ArrayList<>();

        listData.add(new ListData(R.drawable.maryland_mall, getContext().getString(R.string.maryland), getContext().getString(R.string.hotel_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.palms_mall, getContext().getString(R.string.palms), getContext().getString(R.string.hotel_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.entourage, getContext().getString(R.string.entourage), getContext().getString(R.string.hotel_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.ikeja_city_mall, getContext().getString(R.string.ikeja_mall), getContext().getString(R.string.hotel_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.greenville_mall, getContext().getString(R.string.greenville), getContext().getString(R.string.hotel_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.park_mall, getContext().getString(R.string.park_n_shop), getContext().getString(R.string.hotel_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.lagos_city_mall, getContext().getString(R.string.lagos_city_mall), getContext().getString(R.string.hotel_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));


        ListViewAdapter adapter = new ListViewAdapter(getActivity(), R.layout.list_template, listData);

        ListView listView = (ListView) view.findViewById(R.id.malls_List);

        listView.setAdapter(adapter);


        return view;
    }


}