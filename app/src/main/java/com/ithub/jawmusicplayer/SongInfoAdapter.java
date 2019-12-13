package com.ithub.jawmusicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SongInfoAdapter extends ArrayAdapter<SongInfo> {

    //Create a new SongInfoAdapter object
    public SongInfoAdapter(@NonNull Context context, ArrayList<SongInfo> songInfo) {
        super(context, 0, songInfo);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.song_list, parent, false);
        }

        // Get the SongInfo object located at this position in the list
        SongInfo currentSong = getItem(position);

        // Find the 2 TextView and ImageView in the song_list.xml layout
        ImageView mImage = listItemView.findViewById(R.id.img_song);
        TextView mTitle = listItemView.findViewById(R.id.txt_title);
        TextView mArtiste = listItemView.findViewById(R.id.txt_all_songs);

        // Get the image resource, songTitle and artisteName and set it to the views in song_list.xml
        mImage.setImageResource(currentSong.getmImageResource());
        mTitle.setText(currentSong.getmSongTitle());
        mArtiste.setText(currentSong.getmArtisteName());
        return listItemView;
    }
}
