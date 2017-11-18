package com.example.amalzoheir.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Restrant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_list);
        ArrayList<TextGuide> textGuide = new ArrayList<TextGuide>();
        textGuide.add(new TextGuide(getString(R.string.naghib), getString(R.string.descriptionnaghib), R.drawable.naghib));
        textGuide.add(new TextGuide(getString(R.string.falafel), getString(R.string.descriptionfalafel), R.drawable.falafel));
        textGuide.add(new TextGuide(getString(R.string.naghib), getString(R.string.descriptionnaghib), R.drawable.esplande));
        textGuide.add(new TextGuide(getString(R.string.naghib), getString(R.string.descriptionnaghib), R.drawable.elfishawy));
        textGuide.add(new TextGuide(getString(R.string.koshary), getString(R.string.descriptionkoshary), R.drawable.koshary));
        TextAdapter itemAdapter = new TextAdapter(this, textGuide, R.color.resturant);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}
