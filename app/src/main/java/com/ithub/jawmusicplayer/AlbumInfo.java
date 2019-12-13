package com.ithub.jawmusicplayer;

class AlbumInfo {
    // Create variables for imageResource, numberOfSongs and artisteName
    private int mImageResource;
    private String mNumberOfSongs;
    private String mArtisteName;

    // Public constructor accepts 3 parameters and creates AlbumInfo objects
    public AlbumInfo(int imageResource, String numberOfSongs, String artisteName){
        mImageResource = imageResource;
        mNumberOfSongs = numberOfSongs;
        mArtisteName = artisteName;
    }

    // Create getter methods to access private variables
    public int getmImageResource() {
        return mImageResource;
    }

    public String getmNumberOfSongs() {
        return mNumberOfSongs;
    }

    public String getmArtisteName() {
        return mArtisteName;
    }
}
