package com.example.android.musicalstructure;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Marcin on 2018-03-24.
 */
public class Songs implements Parcelable{
    private String albumName;
    private String songName;
    private int albumImage; // drawable reference id

    public Songs(String vAlbumName, String vSongName, int vAlbumImage)
    {
        this.albumName = vAlbumName;
        this.songName = vSongName;
        this.albumImage = vAlbumImage;
    }

    private Songs(Parcel in){
        albumName = in.readString();
        songName = in.readString();
        albumImage = in.readInt();
    }

    @Override
    public int describeContents() { return 0; }

    public String toString() { return albumName + "--" + songName + "--" + albumImage; }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(albumName);
        parcel.writeString(songName);
        parcel.writeInt(albumImage);
    }

    public final Parcelable.Creator<Songs> CREATOR = new Parcelable.Creator<Songs>() {
        @Override
        public Songs createFromParcel(Parcel parcel) {
            return new Songs(parcel);
        }

        @Override
        public Songs[] newArray(int i) {
            return new Songs[i];
        }

    };
}