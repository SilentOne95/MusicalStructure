package com.example.android.musicalstructure;

/**
 * Created by Marcin on 2018-03-19.
 */

public class Song {

    // Name of song title
    private String mSongTitle;

    // Drawable resource ID
    private int mImageResourceId;

    /*
    * Create a new AndroidFlavor object.
    *
    * @param mSongTitle is the name of the song in the album
    * @param image is drawable reference ID that corresponds to the Android version
    * */

    public Song(String songTitle, int imageResourceId)
    {
        mSongTitle = songTitle;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the song
     */
    public String getSongName() { return mSongTitle; }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() { return mImageResourceId; }

}
