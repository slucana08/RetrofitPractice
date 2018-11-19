package com.example.sting.retrofitexample.model;

import com.google.gson.annotations.SerializedName;


public class GOTSeason1 {
    @SerializedName("Title")
    private String title;
    @SerializedName("Released")
    private String released;
    @SerializedName("Episode")
    private int episode;
    @SerializedName("imdbRating")
    private String imdbRating;
    @SerializedName("imdbID")
    private String imdbID;

    public GOTSeason1(String title, String released, int episode, String imdbRating, String imdbID){
        this.title = title;
        this.released = released;
        this.episode = episode;
        this.imdbRating = imdbRating;
        this.imdbID = imdbID;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getReleased() {
        return released;
    }
    public void setReleased(String released) {
        this.released = released;
    }
    public int getEpisode() {
        return episode;
    }
    public void setEpisode(int episode) {
        this.episode = episode;
    }
    public String getImdbRating() {
        return imdbRating;
    }
    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }
    public String getImdbID() {
        return imdbID;
    }
    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }
}

