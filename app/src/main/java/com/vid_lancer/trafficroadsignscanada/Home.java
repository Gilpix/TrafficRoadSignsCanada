package com.vid_lancer.trafficroadsignscanada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.support.v7.widget.CardView;
import android.widget.GridLayout;
import android.widget.TextView;

import quiz.Quiz;

public class Home extends AppCompatActivity {

    TextView headerText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        headerText=(TextView)findViewById(R.id.headerText);
        headerText.setText("Learn Road Signs");
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

        Intent mainIntent = new Intent(Home.this, TrafficLights.class);
        startActivity(mainIntent);
    }

    public void backToOptions(View view) {
        Intent mainIntent = new Intent(Home.this, Options.class);
        mainIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK |Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(mainIntent);
    }

    @Override
    public void onBackPressed() {
        Intent mainIntent = new Intent(Home.this,Options.class);

        mainIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK |Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(mainIntent);


        return;
    }

}

