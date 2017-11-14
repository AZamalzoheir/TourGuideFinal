package com.example.amalzoheir.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Atractions extends AppCompatActivity {
    private static final String TAG = Atractions.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);
        ArrayList<TextGuide> textGuide=new ArrayList<TextGuide>();
        textGuide.add(new TextGuide("Cairo","City of a Thousand Minarets"));
        textGuide.add(new TextGuide("Luxor","Historic sites,Museums,Shopping"));
        textGuide.add(new TextGuide("Sharm El Sheikh","Nature,Shopping"));
        textGuide.add(new TextGuide("Giza Governorate","Pyramids"));
        textGuide.add(new TextGuide("Red Sea and Sinai"," natural and archaeological landmarks"));
        TextAdapter itemAdapter=new TextAdapter(this,textGuide);
        ListView listView=(ListView)findViewById(R.id.list);
        Log.d(TAG, "item");
        listView.setAdapter(itemAdapter);
    }
}
