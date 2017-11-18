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
        textGuide.add(new TextGuide(getString(R.string.Tiran_Iland), getString(R.string.locationTiran_Iland), R.drawable.tiran));
        textGuide.add(new TextGuide(getString(R.string.rasmohamamed_Park), getString(R.string.locationrasmouhamedpark), R.drawable.rasmouhamed));
        textGuide.add(new TextGuide(getString(R.string.SeaWorld_Driving), getString(R.string.locationseaworld_driving), R.drawable.seaworld));
        textGuide.add(new TextGuide(getString(R.string.Aswan_Garden), getString(R.string.locationaswangarden), R.drawable.aswangarden));
        textGuide.add(new TextGuide(getString(R.string.Desert_Hurghada), getString(R.string.locationdesert_hurghada), R.drawable.safari));
        TextAdapter itemAdapter = new TextAdapter(this, textGuide, R.color.public_places);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}
