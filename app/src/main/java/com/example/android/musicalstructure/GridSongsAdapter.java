package com.example.android.musicalstructure;

/**
 * Created by Marcin on 2018-03-24.
 */

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GridSongsAdapter extends ArrayAdapter<Songs> {
    private static final String LOG_TAG = GridSongsAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the List is the data we want
     * to populate into the lists
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param songsList A List of AndroidFlavor objects to display in a list
     */
    public GridSongsAdapter(Activity context, List<Songs> songsList) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songsList);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The AdapterView position that is requesting a view
     * @param convertView The recycled view to populate.
     *                    (search online for "android view recycling" to learn more)
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Gets the Songs object from the ArrayAdapter at the appropriate position
        View gridView = convertView;
        if (gridView == null) {
            gridView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }

        Songs songsList = getItem(position);

        // Adapters recycle views to AdapterViews.
        // If this is a new View object we're getting, then inflate the layout.
        // If not, this view already has the layout inflated from a previous call to getView,
        // and we modify the View widgets as usual.

        TextView vSongName = gridView.findViewById(R.id.song_list_title);
        if(songsList != null)
            vSongName.setText(songsList.getSongName());

        ImageView vAlbumImage = gridView.findViewById(R.id.song_list_image);
        if(songsList != null)
            vAlbumImage.setImageResource(songsList.getAlbumImage());

        return gridView;
    }
}
