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

public class AlbumInfoAdapter extends ArrayAdapter<AlbumInfo> {

    //Create a new AlbumInfoAdapter object
    public AlbumInfoAdapter(@NonNull Context context, ArrayList<AlbumInfo> albumInfo) {
        super(context, 0, albumInfo);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.album_list, parent, false);
        }

        // Get the AlbumInfo object located at this position in the list
        AlbumInfo currentAlbum = getItem(position);

        // Find the 2 TextView and ImageView in the album_list.xml layout
        ImageView mImage = listItemView.findViewById(R.id.img_album_icon_white);
        TextView mArtiste = listItemView.findViewById(R.id.txt_all_songs);
        TextView mNumberOfSongs = listItemView.findViewById(R.id.txt_numberOfSongs);

        // Get the image resource, artisteName and numberOfSongs and set it to the views in album_list.xml
        mImage.setImageResource(currentAlbum.getmImageResource());
        mArtiste.setText(currentAlbum.getmArtisteName());
        mNumberOfSongs.setText(currentAlbum.getmNumberOfSongs());
        return listItemView;
    }
}
