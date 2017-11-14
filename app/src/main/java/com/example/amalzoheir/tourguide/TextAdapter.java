package com.example.amalzoheir.tourguide;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Amalzoheir on 11/1/2017.
 */

public class TextAdapter extends ArrayAdapter<TextGuide>{
    public TextAdapter (Activity context, ArrayList<TextGuide> textGuide) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context,0,textGuide);
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link AndroidFlavor} object located at this position in the list
        TextGuide currentTextGuide = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView.setText(currentTextGuide.getName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defualtTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defualtTextView.setText(currentTextGuide.getDescription());
        ImageView pictureimageview = (ImageView) listItemView.findViewById(R.id.picture);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        /*if(currentTextGuide.hasImage()) {
            pictureimageview.setImageResource(currentWord.getScourceNumberImage());
            pictureimageview.setVisibility(View.VISIBLE);
        }
        else{
            pictureimageview.setVisibility(View.GONE);
        }
        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        /*View  textConatainer=listItemView.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),mColorSourceId);
        textConatainer.setBackgroundColor(color);*/

        return listItemView;
    }
}
