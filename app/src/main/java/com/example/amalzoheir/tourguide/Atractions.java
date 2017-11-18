package com.example.amalzoheir.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Atractions extends AppCompatActivity {
    private static final String TAG = Atractions.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_list);
        ArrayList<TextGuide> textGuide = new ArrayList<TextGuide>();
        textGuide.add(new TextGuide(getString(R.string.cairo), getString(R.string.descriptionCairo), R.drawable.cairo));
        textGuide.add(new TextGuide(getString(R.string.Luxor), getString(R.string.descriptionLuxor), R.drawable.luxor));
        textGuide.add(new TextGuide(getString(R.string.giza), getString(R.string.descriptionGiza), R.drawable.giza));
        textGuide.add(new TextGuide(getString(R.string.redSea), getString(R.string.descriptionredsea), R.drawable.redsea));
        TextAdapter itemAdapter = new TextAdapter(this, textGuide, R.color.attraction);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}
