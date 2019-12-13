package com.ithub.jawmusicplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Find the songs CardView
        CardView cardViewSongs = findViewById(R.id.cv_all_songs);

        // Associate an onClickListener for cardViewSong and pass an Intent to the MainActivity.class
        cardViewSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Find the songs CardView
        CardView cardViewAlbum = findViewById(R.id.cv_album);

        // Associate an onClickListener for cardViewAlbum and pass an Intent to the Album.class
        cardViewAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Album.class);
                startActivity(intent);
            }
        });
    }
}
