package com.example.sting.retrofitexample.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.sting.retrofitexample.R;
import com.example.sting.retrofitexample.activity.Episode;
import com.example.sting.retrofitexample.model.GOTEpisode;
import com.example.sting.retrofitexample.model.GOTSeason1;
import com.example.sting.retrofitexample.network.GOTApiService;
import com.example.sting.retrofitexample.network.RetrofitInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GOTSeasonAdapter extends RecyclerView.Adapter<GOTSeasonAdapter.GOTViewHolder>{
        private List<GOTSeason1> episodes;
        private int rowLayout;
        private Context context;
        private final static String API_KEY = "a946379a";

        public GOTSeasonAdapter(List<GOTSeason1> episodes, int rowLayout, Context context){
        this.episodes = episodes;
        this.rowLayout = rowLayout;
        this.context = context;
        }

        //A view holder inner class where we get reference to the views in the layout using their ID
        public static class GOTViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
            LinearLayout episodesLayout;
            TextView title;
            TextView episode;
            TextView rating;
            TextView released;

            public GOTViewHolder(View v) {
                super(v);
                episodesLayout = v.findViewById(R.id.episodes_layout);
                title = v.findViewById(R.id.title_TextView);
                released = v.findViewById(R.id.released_TextView);
                episode = v.findViewById(R.id.episode_TextView);
                rating = v.findViewById(R.id.rating_TextView);
            }

            @Override
            public void onClick(View view) {

            }
        }

        @Override
        public GOTViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new GOTViewHolder(view);
        }

        @Override
        public void onBindViewHolder (GOTViewHolder holder, final int position){
            final String[] title = new String[1];
            final String[] year = new String[1];
            final String[] runtime = new String[1];
            final String[] genre = new String[1];
            final String[] actors = new String[1];
            final String[] plot = new String[1];
            final int[] season = new int[1];
            final int[] episodeNumber = new int[1];

        holder.title.setText(episodes.get(position).getTitle());
        holder.released.setText(episodes.get(position).getReleased());
        holder.episode.setText(String.valueOf(episodes.get(position).getEpisode()));
        holder.rating.setText(episodes.get(position).getImdbRating());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(final View view) {
                final Intent episodeDisplay = new Intent(view.getContext(),Episode.class);
                GOTApiService GOTApiService = RetrofitInstance.getRetrofitInstance()
                        .create(com.example.sting.retrofitexample.network.GOTApiService.class);
                Call<GOTEpisode> call = GOTApiService.getGOTEpisode1(
                        episodes.get(position).getEpisode(),API_KEY);
                call.enqueue(new Callback<GOTEpisode>() {
                    @Override
                    public void onResponse(Call<GOTEpisode> call, Response<GOTEpisode> response) {
                        GOTEpisode episode = response.body();
                        title[0] = episode.getTitle();
                        year[0] = episode.getYear();
                        runtime[0] = episode.getRuntime();
                        genre[0] = episode.getGenre();
                        actors[0] = episode.getActors();
                        plot[0] = episode.getPlot();
                        season[0] = episode.getSeason();
                        episodeNumber[0] = episode.getEpisode();
                        Log.i("App", "Data captured");
                        episodeDisplay.putExtra("title", title[0]);
                        episodeDisplay.putExtra("year", year[0]);
                        episodeDisplay.putExtra("runtime", runtime[0]);
                        episodeDisplay.putExtra("genre", genre[0]);
                        episodeDisplay.putExtra("actors", actors[0]);
                        episodeDisplay.putExtra("plot", plot[0]);
                        episodeDisplay.putExtra("season", season[0]);
                        episodeDisplay.putExtra("episodeNumber", episodeNumber[0]);
                        view.getContext().startActivity(episodeDisplay);
                    }

                    @Override
                    public void onFailure(Call<GOTEpisode> call, Throwable throwable) {
                        Log.e("App", throwable.toString());
                    }
                });
            }
        });
        }

        @Override
        public int getItemCount(){
        return episodes.size();
        }
}

