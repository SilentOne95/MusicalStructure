package com.example.android.musicalstructure;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Marcin on 2018-03-24.
 */
public class Songs implements Parcelable{

    String songName;
    int albumImage; // drawable reference id

    public Songs(String vSongName, int vAlbumImage)
    {
        this.songName = vSongName;
        this.albumImage = vAlbumImage;
    }

    private Songs(Parcel in){
        songName = in.readString();
        albumImage = in.readInt();
    }

    public static final Creator<Songs> CREATOR = new Creator<Songs>() {
        @Override
        public Songs createFromParcel(Parcel in) {
            return new Songs(in);
        }

        @Override
        public Songs[] newArray(int size) {
            return new Songs[size];
        }
    };

    public String getSongName() {
        return songName;
    }

    public int getAlbumImage() {
        return albumImage;
    }

    @Override
    public int describeContents() { return 0; }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(songName);
        parcel.writeInt(albumImage);
    }

    /** for debugging purpose - not necessary but highly recommended */
    public String toString() { return songName + "--" + albumImage; }

}