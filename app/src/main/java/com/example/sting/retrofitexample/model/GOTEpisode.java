package com.example.sting.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GOTEpisode {
    @SerializedName("Title")
    private String title;
    @SerializedName("Year")
    private String year;
    @SerializedName("Rated")
    private String rated;
    @SerializedName("Released")
    private String released;
    @SerializedName("Season")
    private int season;
    @SerializedName("Episode")
    private int episode;
    @SerializedName("Runtime")
    private String runtime;
    @SerializedName("Genre")
    private String genre;
    @SerializedName("Director")
    private String director;
    @SerializedName("Writer")
    private String writer;
    @SerializedName("Actors")
    private String actors;
    @SerializedName("Plot")
    private String plot;
    @SerializedName("Language")
    private String language;
    @SerializedName("Country")
    private String country;
    @SerializedName("Awards")
    private String awards;
    @SerializedName("Poster")
    private String poster;
    @SerializedName("Ratings")
    private List<Ratings> ratings;
    @SerializedName("Metascore")
    private String metascore;
    @SerializedName("imdbRating")
    private String imdbRating;
    @SerializedName("imdbVotes")
    private String imdbVotes;
    @SerializedName("imdbID")
    private String imdbID;
    @SerializedName("seriesID")
    private String seriesID;
    @SerializedName("Type")
    private String type;
    @SerializedName("Response")
    private boolean response;

    public GOTEpisode(String title, String year, String rated, String released,
                      int season, int episode, String runtime, String genre,
                      String director, String writer, String actors, String plot,
                      String language, String country, String awards, String poster,
                      List<Ratings> ratings, String metascore, String imdbRating,
                      String imdbVotes, String imdbID, String seriesID, String type,
                      boolean response){
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.released = released;
        this.season = season;
        this.episode = episode;
        this.runtime = runtime;
        this.genre = genre;
        this.director = director;
        this.writer = writer;
        this.actors = actors;
        this.plot = plot;
        this.language = language;
        this.country = country;
        this.awards = awards;
        this.poster = poster;
        this.ratings = ratings;
        this.metascore = metascore;
        this.imdbRating = imdbRating;
        this.imdbVotes = imdbVotes;
        this.imdbID = imdbID;
        this.seriesID = seriesID;
        this.type = type;
        this.response = response;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getYear() {return year;}
    public void setYear(String year){ this.year = year; }
    public String getRated() {return rated;}
    public void setRated(String rated){ this.rated = rated; }
    public String getReleased() {
        return released;
    }
    public void setReleased(String released) {
        this.released = released;
    }
    public int getSeason() {
        return season;
    }
    public void setSeason(int season) {
        this.season = season;
    }
    public int getEpisode() {
        return episode;
    }
    public void setEpisode(int episode) {
        this.episode = episode;
    }
    public String getRuntime() {return runtime;}
    public void setRuntime(String runtime){ this.runtime = runtime; }
    public String getGenre() {return genre;}
    public void setGenre(String genre){ this.genre = genre; }
    public String getDirector() {return director;}
    public void setDirector(String director){ this.director = director; }
    public String getWriter() { return writer; }
    public void setWriter(String writer){ this.writer = writer; }
    public String getActors() {return actors;}
    public void setActors(String actors){ this.actors = actors; }
    public String getPlot() {return plot;}
    public void setPlot(String plot){ this.plot = plot; }
    public String getLanguage() {return language;}
    public void setLanguage(String language){ this.language = language; }
    public String getCountry() {return country;}
    public void setCountry(String country){ this.country = country; }
    public String getAwards() {return awards;}
    public void setAwards(String awards){ this.awards = awards; }
    public String getPoster() {return poster;}
    public void setPoster(String poster){ this.poster = poster; }
    public List<Ratings> getRatings() {return ratings;}
    public void setRatings(List<Ratings> ratings){ this.ratings = ratings; }
    public String getMetascore() {return metascore;}
    public void setMetascore(String metascore){ this.metascore = metascore; }
    public String getImdbRating() {
        return imdbRating;
    }
    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }
    public String getImdbVotes(){ return imdbVotes;}
    public void setImdbVotes(String imdbVotes) { this.imdbVotes = imdbVotes; }
    public String getImdbID() {
        return imdbID;
    }
    public void setImdbID(String imdbID) { this.imdbID = imdbID; }
    public String getSeriesID() {
        return seriesID;
    }
    public void setSeriesID(String seriesID) { this.seriesID = seriesID; }
    public String getType() {
        return type;
    }
    public void setType(String type) { this.type = type; }
    public boolean getResponse() {
        return response;
    }
    public void setResponse(boolean response) { this.response = response; }

    public static class Ratings{
        @SerializedName("Source")
        private String source;
        @SerializedName("Value")
        private String value;
    }
}
