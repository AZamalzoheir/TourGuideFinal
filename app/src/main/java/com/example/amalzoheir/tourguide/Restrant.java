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
        textGuide.add(new TextGuide("Nagguib Mahfouz Cafe", "5 El Baddistan Lane| Khan el_Khalili", R.drawable.naghib));
        textGuide.add(new TextGuide("Felfela", "15 Sharia Hoda Shaarawi Street", R.drawable.falafel));
        textGuide.add(new TextGuide("Esplanade Cafe Restaurant", "El Kahattab InterContinental Cairo Citystars | omar ibn", R.drawable.esplande));
        textGuide.add(new TextGuide("El Fishawi", "Midan Hussien|Cairo", R.drawable.elfishawy));
        textGuide.add(new TextGuide("Koshary Abou Tarek", "Choppin In | Champollion", R.drawable.koshary));
        TextAdapter itemAdapter = new TextAdapter(this, textGuide, R.color.resturant);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}
