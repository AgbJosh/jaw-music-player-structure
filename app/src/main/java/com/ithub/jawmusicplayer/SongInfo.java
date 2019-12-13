package com.ithub.jawmusicplayer;

public class SongInfo {
    // Create variables for imageResource, songTitle and artisteName
    private int mImageResource;
    private String mSongTitle;
    private String mArtisteName;

    // Public constructor accepts 3 parameters and creates SongInfo objects
    public SongInfo(int imageResource, String songTitle, String artisteName){
        mImageResource = imageResource;
        mSongTitle = songTitle;
        mArtisteName = artisteName;
    }

    // Create getter methods to access private variables
    public String getmSongTitle() {
        return mSongTitle;
    }

    public String getmArtisteName() {
        return mArtisteName;
    }

    public int getmImageResource() {
        return mImageResource;
    }
}
