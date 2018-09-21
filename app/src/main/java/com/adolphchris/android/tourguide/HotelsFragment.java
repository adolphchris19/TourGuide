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

public class HotelsFragment extends Fragment {

    public HotelsFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hotels, container, false);


        final ArrayList<ListData> listData = new ArrayList<>();

        listData.add(new ListData(R.drawable.lagosmap, getContext().getString(R.string.hotel_name), getContext().getString(R.string.hotel_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.lagosmap, getContext().getString(R.string.hotel_name), getContext().getString(R.string.hotel_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.lagosmap, getContext().getString(R.string.hotel_name), getContext().getString(R.string.hotel_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.lagosmap, getContext().getString(R.string.hotel_name), getContext().getString(R.string.hotel_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.lagosmap, getContext().getString(R.string.hotel_name), getContext().getString(R.string.hotel_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.lagosmap, getContext().getString(R.string.hotel_name), getContext().getString(R.string.hotel_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.lagosmap, getContext().getString(R.string.hotel_name), getContext().getString(R.string.hotel_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));
        listData.add(new ListData(R.drawable.lagosmap, getContext().getString(R.string.hotel_name), getContext().getString(R.string.hotel_desc), getContext().getString(R.string.rating), getContext().getString(R.string.rate)));



        ListViewAdapter adapter = new ListViewAdapter(getActivity(), R.layout.list_template, listData);

        ListView listView = (ListView) view.findViewById(R.id.hotel_List);

        listView.setAdapter(adapter);


        return view;
    }


}
