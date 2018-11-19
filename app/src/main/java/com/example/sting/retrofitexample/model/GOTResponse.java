package com.example.sting.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GOTResponse {
    @SerializedName("Title")
    private String title;
    @SerializedName("Season")
    private int season;
    @SerializedName("totalSeasons")
    private int totalSeasons;
    @SerializedName("Episodes")
    private List<GOTSeason1> episodes;
    @SerializedName("Response")
    private boolean response;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getSeason() {
        return season;
    }
    public void setSeason(int season) {
        this.season = season;
    }
    public int getTotalSeasons() {
        return totalSeasons;
    }
    public void setTotalSeasons(int totalSeasons) {
        this.totalSeasons = totalSeasons;
    }
    public List<GOTSeason1> getEpisodes() {
        return episodes;
    }
    public void setEpisodes(List<GOTSeason1> episodes) {
        this.episodes = episodes;
    }
    public boolean getResponse (){
        return response;
    }
    public void setResponse(boolean response){
        this.response = response;
    }
}

