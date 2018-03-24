package com.example.android.musicalstructure;

import android.os.Parcel;
import android.os.Parcelable;

public class Data implements Parcelable {

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

    private long id;
    private String albumName;
    private String songName;
    private int imageResourceId;

    // Constructor
    public Data(long id, String albumName, String songName, int imageResourceId){
        this.id = id;
        this.albumName = albumName;
        this.songName = songName;
        this.imageResourceId = imageResourceId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    // Parcelling part
    public Data(Parcel in){
        this.id = in.readLong();
        this.albumName = in.readString();
        this.songName = in.readString();
        this.imageResourceId =  in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
        dest.writeString(this.albumName);
        dest.writeString(this.songName);
        dest.writeInt(this.imageResourceId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", albumName='" + albumName + '\'' +
                ", songName='" + songName + '\'' +
                ", imageResourceId='" + imageResourceId + '\'' +
                '}';
    }
}