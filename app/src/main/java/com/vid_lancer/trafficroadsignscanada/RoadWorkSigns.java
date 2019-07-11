package com.vid_lancer.trafficroadsignscanada;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class RoadWorkSigns extends Activity {


    TextView headerText;
    ImageButton backButton;
    ListView simpleList;
    String signsDescription[] = {
            "Construction work one kilometre ahead.",
            "Road work ahead.",
            "Survey crew working on the road ahead.",
            "Traffic control person ahead. Drive slowly and watch for instructions.",
            "You are entering a construction zone. Drive with extra caution and be prepared for a lower speed limit.",
            "Temporary detour from normal traffic route.",
            "Flashing lights on the arrows show the direction to follow.",
            "Pavement has been milled or grooved. Your vehicle's stopping ability may be affected so obey the speed limit and drive with extra caution. Motorcyclists may experience reduced traction on these surfaces.",
            "Lane ahead is closed for roadwork. Obey the speed limit and merge with traffic in the open lane.",
            "Closed lane. Adjust speed to merge with traffic in lane indicated by arrow.",
            "Do not pass the pilot vehicle or pace vehicle bearing this sign.",
            "Reduce speed and be prepared to stop.",
            "Follow detour marker until you return to regular route.",
            "Enforces doubling the HTA fines for speeding in a designated construction zone when there are workers present."};
    int signsImage[] = {R.drawable.rws0,
            R.drawable.rws1,
            R.drawable.rws2,
            R.drawable.rws3,
            R.drawable.rws4,
            R.drawable.rws5,
            R.drawable.rws6,
            R.drawable.rws7,
            R.drawable.rws8,
            R.drawable.rws9,
            R.drawable.rws10,
            R.drawable.rws11,
            R.drawable.rws12,
            R.drawable.rws13};



    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regulatory_signs);

        simpleList = (ListView)findViewById(R.id.simpleListView);
        RegulatoryCustomAdapter customAdapter = new RegulatoryCustomAdapter(getApplicationContext(), signsDescription, signsImage);
        simpleList.setAdapter(customAdapter);

        backButton=(ImageButton)findViewById(R.id.backArrow);
        headerText =(TextView)findViewById(R.id.headerText);
        headerText.setText("Road Work Signs");



    }



    public void backToHome(View view) {
        Intent mainIntent = new Intent(RoadWorkSigns.this,Home.class);
        startActivity(mainIntent);
    }

    @Override
    public void onBackPressed() {
        Intent mainIntent = new Intent(RoadWorkSigns.this,Home.class);

        startActivity(mainIntent);

        return;
    }


}