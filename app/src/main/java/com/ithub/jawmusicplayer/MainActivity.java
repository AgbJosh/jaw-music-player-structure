package com.ithub.jawmusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an ArrayList and populate it with new SongInfo objects
        ArrayList<SongInfo> songInfo = new ArrayList<>();
        songInfo.add(new SongInfo(R.drawable.ic_audiotrack,"Over The Edge","MC Jin ft. Dawen"));
        songInfo.add(new SongInfo(R.drawable.ic_audiotrack,"We Believe","Newsboys"));
        songInfo.add(new SongInfo(R.drawable.ic_audiotrack,"I'll Find You","Lecrae ft. Tori Kelly"));
        songInfo.add(new SongInfo(R.drawable.ic_audiotrack,"In Control","Hillsong Worship"));
        songInfo.add(new SongInfo(R.drawable.ic_audiotrack,"Fighting For Me","Riley Clemmons"));
        songInfo.add(new SongInfo(R.drawable.ic_audiotrack,"Start Over","Flame ft. NF"));
        songInfo.add(new SongInfo(R.drawable.ic_audiotrack,"Hills and Valleys","Tauren Wells"));
        songInfo.add(new SongInfo(R.drawable.ic_audiotrack,"Even When It Hurts","Hillsong United"));
        songInfo.add(new SongInfo(R.drawable.ic_audiotrack,"I Will Fear No More","The Afters"));
        songInfo.add(new SongInfo(R.drawable.ic_audiotrack,"You Say","Lauren Daigle"));
        songInfo.add(new SongInfo(R.drawable.ic_audiotrack,"Reckless Love","Cory Asbury"));
        songInfo.add(new SongInfo(R.drawable.ic_audiotrack,"Flood The Earth","Jesus Culture"));

        // Create and initialize a new custom SongInfo adapter and pass songInfo as a parameter
        SongInfoAdapter songInfoAdapter = new SongInfoAdapter(this, songInfo);

        // Find the ListView to be populated
        ListView listView = findViewById(R.id.list_song);

        // Associate the custom adapter
        listView.setAdapter(songInfoAdapter);

        // Associate an onItemClickListener for the listView and pass an Intent to the NowPlaying.class for each list item
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(intent);
            }
        });
    }
}
