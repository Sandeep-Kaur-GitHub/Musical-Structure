package com.example.musicalstructure;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DisplayAdapter extends ArrayAdapter<Display> {
    public DisplayAdapter(Activity context, ArrayList<Display> display) {
        super(context, 0, display);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }
        Display currentWord = getItem(position);

        TextView album_textView = (TextView) listItemView.findViewById(R.id.textview_album);
        album_textView.setText(currentWord.getAlbumName());

        TextView artist_textView = (TextView) listItemView.findViewById(R.id.textview_artist);
        artist_textView.setText(currentWord.getArtistName());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_view);
        iconView.setImageResource(currentWord.getImageResourceId());
        return listItemView;
    }
}
