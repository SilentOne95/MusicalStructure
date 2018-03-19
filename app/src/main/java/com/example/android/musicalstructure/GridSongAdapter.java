package com.example.android.musicalstructure;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Marcin on 2018-03-19.
 */

public class GridSongAdapter extends ArrayAdapter<Song> {

    private static final String LOG_TAG = GridSongAdapter.class.getSimpleName();

    /**
     * This is a custom constructor.
     * The context is used to inflate the layout file.
     * The list is the data we want to populate into the list
     * @param context The current context. Used to inflate the layout.
     * @param songItem A list of AlbumItems object to display in a list
     */
    public GridSongAdapter(Activity context, ArrayList<Song> songItem){
        // Initialize the ArrayAdapter's internal storage for the context
        super(context, 0, songItem);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView)
     * @param position The position in the list of data that should be displayed.
     * @param convertView The recycled view to populate.
     * @param parent Te parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songName = listItemView.findViewById(R.id.song_list_title);
        // Get the version name from the current Song object and
        // set this text on the name TextView
        if (currentSong != null) {
            songName.setText(currentSong.getSongName());
        }

        // Find the ImageView in the grid_item.xml layout with the ID version_number
        ImageView imageResource = listItemView.findViewById(R.id.song_list_image);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        if (currentSong != null) {
            imageResource.setImageResource(currentSong.getImageResourceId());
        }

        // Return the whole list item layout (containing TextView and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
