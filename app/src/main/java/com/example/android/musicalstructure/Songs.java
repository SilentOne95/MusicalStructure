package com.example.android.musicalstructure;

import android.os.Parcel;
import android.os.Parcelable;

public class Songs implements Parcelable {

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Songs createFromParcel(Parcel in) {
            return new Songs(in);
        }

        public Songs[] newArray(int size) {
            return new Songs[size];
        }
    };

    private long id;
    private String songName;
    private int imageResourceId;

    // Constructor
    public Songs(long id, String songName, int imageResourceId){
        this.id = id;
        this.songName = songName;
        this.imageResourceId = imageResourceId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    public Songs(Parcel in){
        this.id = in.readLong();
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
        dest.writeString(this.songName);
        dest.writeInt(this.imageResourceId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", songName='" + songName + '\'' +
                ", imageResourceId='" + imageResourceId + '\'' +
                '}';
    }
}