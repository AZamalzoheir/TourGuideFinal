package com.example.amalzoheir.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView attraction=(TextView)findViewById(R.id.attraction);
        TextView resturant=(TextView)findViewById(R.id.resturant);
        TextView publicplaces=(TextView)findViewById(R.id.publicplaces);
        final TextView events=(TextView)findViewById(R.id.events);
        attraction.setOnClickListener(new View.OnClickListener() {//define anew object//attach view
            @Override
            public void onClick(View view) {
                Intent attractionIntent=new Intent(MainActivity.this,Atractions.class);
                startActivity(attractionIntent);// define event listener
            }
        });
        resturant.setOnClickListener(new View.OnClickListener() {//define anew object//attach view
            @Override
            public void onClick(View view) {
                Intent  resturantIntent=new Intent(MainActivity.this,Restrant.class);
                startActivity( resturantIntent);// define event listener
            }
        });
        publicplaces.setOnClickListener(new View.OnClickListener() {//define anew object//attach view
            @Override
            public void onClick(View view) {
                Intent  publicplacesIntent=new Intent(MainActivity.this,PublicPlaces.class);
                startActivity(publicplacesIntent);// define event listener
            }
        });
       events.setOnClickListener(new View.OnClickListener() {//define anew object//attach view
            @Override
            public void onClick(View view) {
                Intent eventsIntent=new Intent(MainActivity.this,Events.class);
                startActivity(eventsIntent);// define event listener
            }
        });

    }

}

