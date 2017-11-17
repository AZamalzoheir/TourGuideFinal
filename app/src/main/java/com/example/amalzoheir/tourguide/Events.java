package com.example.amalzoheir.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_list);
        ArrayList<TextGuide> textGuide = new ArrayList<TextGuide>();
        textGuide.add(new TextGuide("New Year", "Celebrating the new year"));
        textGuide.add(new TextGuide("Sham El Nessim", "The Mondy following Orthodox Easter"));
        textGuide.add(new TextGuide("Birthday of the Prophet Mouhamed", "12 Rbi Al AwwalL"));
        textGuide.add(new TextGuide("Revolution Day 25 January", "Egyptian Revolution 2011"));
        textGuide.add(new TextGuide("Islamic New Year", "The first day of the year based on the launar Islamic Calender"));
        TextAdapter itemAdapter = new TextAdapter(this, textGuide, R.color.events);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}
