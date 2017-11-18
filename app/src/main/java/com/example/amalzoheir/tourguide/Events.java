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
        textGuide.add(new TextGuide(getString(R.string.Islamic_New_Year), getString(R.string.descriptionnIslamic_New_Year)));
        textGuide.add(new TextGuide(getString(R.string.new_year), getString(R.string.descriptionnew_year)));
        textGuide.add(new TextGuide(getString(R.string.Sham_El_Nessim), getString(R.string.descriptionnSham_El_Nessim)));
        textGuide.add(new TextGuide(getString(R.string.Mouhamed_birhtday), getString(R.string.descriptionnMouhamed_birhtday)));
        textGuide.add(new TextGuide(getString(R.string.Revolution_25January), getString(R.string.descriptionnRevolution_25January)));
        TextAdapter itemAdapter = new TextAdapter(this, textGuide, R.color.events);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}
