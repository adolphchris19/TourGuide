package com.adolphchris.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter  extends ArrayAdapter<ListData> {

    public ListViewAdapter(Context context, int list_template, ArrayList<ListData> users) {
        super(context, 0, users);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Recycling Mechanism
        View listItemView = convertView;

        if(listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_template, parent, false);

        }

        // Current Item Position
        ListData currentListItem = getItem(position);


        // Get ListItem Image
        ImageView listItemImageView = (ImageView) listItemView.findViewById(R.id.image_widget);
        listItemImageView.setImageResource(currentListItem.getmImageResource());

        // Get ListItem Name
        TextView listItemName = (TextView) listItemView.findViewById(R.id.textName_widget);
        listItemName.setText(currentListItem.getmListName());

        // Get ListItem Description
        TextView listItemDescription = (TextView) listItemView.findViewById(R.id.textDescription_widget);
        listItemDescription.setText(currentListItem.getmListDescription());

        // Get ListItem Location
        TextView listItemRating = (TextView) listItemView.findViewById(R.id.textRating_widget);
        listItemRating.setText(currentListItem.getmListRating());

        // Get ListItem Phone
        TextView listItemRatingNumber = (TextView) listItemView.findViewById(R.id.textRatingNumber_widget);
        listItemRatingNumber.setText(currentListItem.getmListRatingNumber());


        return listItemView;

    }

}
