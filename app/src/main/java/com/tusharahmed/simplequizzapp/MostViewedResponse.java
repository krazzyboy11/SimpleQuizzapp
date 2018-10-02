package com.tusharahmed.simplequizzapp;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class MostViewedResponse {

    @SerializedName("data")
    private ArrayList<AllPost> allpost = new ArrayList<>();

    public ArrayList<AllPost> getAllpost() {
        return allpost;
    }

    public void setAllpost(ArrayList<AllPost> allpost) {
        this.allpost = allpost;
    }
}
