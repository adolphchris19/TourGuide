package com.adolphchris.android.tourguide;

public class ListData {
    public int mImageResource;
    public String mListName;
    public String mListDescription;
    public String mListRating;
    public String mListRatingNumber;


    public ListData(int mImageResource, String mListName, String mListDescription, String mListRating, String mListRatingNumber) {
        this.mImageResource = mImageResource;
        this.mListName = mListName;
        this.mListDescription = mListDescription;
        this.mListRating = mListRating;
        this.mListRatingNumber = mListRatingNumber;
    }
    public int getmImageResource(){
        return  mImageResource;
    }
    public String getmListName(){
        return mListName;
    }
    public String getmListDescription(){
        return mListDescription;
    }
    public String getmListRating(){
        return mListRating;
    }
    public String getmListRatingNumber(){
        return mListRatingNumber;
    }
}

