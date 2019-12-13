package com.ithub.jawmusicplayer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class Album extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        // Create an ArrayList and populate it with new AlbumInfo objects
        ArrayList<AlbumInfo> albumInfo = new ArrayList<>();
        albumInfo.add(new AlbumInfo(R.drawable.ic_album,"5 Songs","MC Jin ft. Dawen"));
        albumInfo.add(new AlbumInfo(R.drawable.ic_album,"2 Songs","Newsboys"));
        albumInfo.add(new AlbumInfo(R.drawable.ic_album,"4 Songs","Lecrae"));
        albumInfo.add(new AlbumInfo(R.drawable.ic_album,"9 Songs","Hillsong Worship"));
        albumInfo.add(new AlbumInfo(R.drawable.ic_album,"6 Songs","Riley Clemmons"));
        albumInfo.add(new AlbumInfo(R.drawable.ic_album,"1 Song","Tauren Wells"));
        albumInfo.add(new AlbumInfo(R.drawable.ic_album,"3 Songs","The Afters"));
        albumInfo.add(new AlbumInfo(R.drawable.ic_album,"12 Songs","Lauren Daigle"));

        // Create and initialize a new custom AlbumInfo adapter and pass albumInfo as a parameter
        AlbumInfoAdapter albumInfoAdapter = new AlbumInfoAdapter(this, albumInfo);

        // Find the ListView to be populated
        ListView listView = findViewById(R.id.list_album);

        // Associate the custom adapter
        listView.setAdapter(albumInfoAdapter);
    }
}
