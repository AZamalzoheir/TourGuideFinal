package com.example.amalzoheir.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PublicPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_list);
        ArrayList<TextGuide> textGuide = new ArrayList<TextGuide>();
        textGuide.add(new TextGuide("Tiran Iland", "Lodg Hotel | Hadaba | Sharm El Sheikh", R.drawable.tiran));
        textGuide.add(new TextGuide("Ras Mohamamed National Park", "Sinai | Sharm El Sheikh", R.drawable.rasmouhamed));
        textGuide.add(new TextGuide("SeaWorld Driving Center ", "Three Corners Sea Beach Resort | Marsa Alam", R.drawable.seaworld));
        textGuide.add(new TextGuide("Aswan Botanical Garden", "Aswan CitY", R.drawable.aswangarden));
        textGuide.add(new TextGuide("Desert Safari Hurghada", " Hurghada", R.drawable.safari));
        TextAdapter itemAdapter = new TextAdapter(this, textGuide, R.color.public_places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}
