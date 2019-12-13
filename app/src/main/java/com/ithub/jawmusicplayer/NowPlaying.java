package com.ithub.jawmusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Find the Home button
        Button homeButton = findViewById(R.id.btn_home);

        // Associate an OnClickListener and pass an Intent to Home.class
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NowPlaying.this, Home.class);
                startActivity(intent);
            }
        });
    }
}
