package com.vid_lancer.trafficroadsignscanada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.support.v7.widget.CardView;
import android.widget.GridLayout;

public class Home extends AppCompatActivity {

    //GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        //mainGrid =(android.widget.GridLayout)findViewById(R.id.mainGrid);


        //setSingleEvent(mainGrid);
    }




    public void RegulatorySigns(View view) {

         CardView cardView1 = (CardView)findViewById(R.id.R1C1);

        cardView1.setCardBackgroundColor(Color.parseColor("#A1FF0000"));


            Intent mainIntent = new Intent(Home.this,RegulatorySigns.class);
            startActivity(mainIntent);


        }

    public void WarningSigns(View view) {
        CardView cardView2 = (CardView)findViewById(R.id.R1C2);
        cardView2.setCardBackgroundColor(Color.parseColor("#A1FF0000"));



        Intent mainIntent = new Intent(Home.this,WarningSigns.class);
        startActivity(mainIntent);
    }
    public void InformationSigns(View view) {
        CardView cardView3 = (CardView)findViewById(R.id.R2C1);

        cardView3.setCardBackgroundColor(Color.parseColor("#A1FF0000"));

        Intent mainIntent = new Intent(Home.this,InformationSigns.class);
        startActivity(mainIntent);
    }

    public void RoadWorkSigns(View view) {
        CardView cardView4 = (CardView)findViewById(R.id.R2C2);

        cardView4.setCardBackgroundColor(Color.parseColor("#A1FF0000"));

        Intent mainIntent = new Intent(Home.this,RoadWorkSigns.class);
        startActivity(mainIntent);
    }


    public void otherSigns(View view) {
        CardView cardView5 = (CardView)findViewById(R.id.R3C1);

        cardView5.setCardBackgroundColor(Color.parseColor("#A1FF0000"));

        Intent mainIntent = new Intent(Home.this,OtherSigns.class);
        startActivity(mainIntent);
    }

    public void trafficLights(View view) {
        CardView cardView5 = (CardView)findViewById(R.id.R3C2);

        cardView5.setCardBackgroundColor(Color.parseColor("#A1FF0000"));

        Intent mainIntent = new Intent(Home.this,TrafficLights.class);
        startActivity(mainIntent);
    }
}

