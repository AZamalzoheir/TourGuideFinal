package com.example.amalzoheir.tourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Amalzoheir on 11/1/2017.
 */

public class TextAdapter extends ArrayAdapter<TextGuide> {
    int mColorSourceId;

    public TextAdapter(Activity context, ArrayList<TextGuide> textGuide, int colorSourceId) {
        super(context, 0, textGuide);
        mColorSourceId = colorSourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        TextGuide currentTextGuide = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentTextGuide.getName());
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentTextGuide.getDescription());
        ImageView pictureimageview = (ImageView) listItemView.findViewById(R.id.picture);
        if (currentTextGuide.hasImage()) {
            pictureimageview.setImageResource(currentTextGuide.getScourceNumberImage());
            pictureimageview.setVisibility(View.VISIBLE);
        }
        else{
            pictureimageview.setVisibility(View.GONE);
        }
        View textConatainer = listItemView.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),mColorSourceId);
        pictureimageview.setBackgroundColor(color);
        textConatainer.setBackgroundColor(color);
        return listItemView;
    }
}
