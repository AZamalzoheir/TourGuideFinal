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
        textGuide.add(new TextGuide("Cairo", "City of a Thousand Minarets", R.drawable.cairo));
        textGuide.add(new TextGuide("Luxor", "Historic sites,Museums,Shopping", R.drawable.luxor));
        textGuide.add(new TextGuide("Sharm El Sheikh", "Nature,Shopping", R.drawable.sharm));
        textGuide.add(new TextGuide("Giza Governorate", "Pyramids", R.drawable.giza));
        textGuide.add(new TextGuide("Red Sea and Sinai", " natural and archaeological landmarks", R.drawable.redsea));
        TextAdapter itemAdapter = new TextAdapter(this, textGuide, R.color.attraction);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}
