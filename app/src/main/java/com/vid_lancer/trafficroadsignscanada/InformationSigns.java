package com.vid_lancer.trafficroadsignscanada;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class InformationSigns extends Activity {


    TextView headerText;
    ImageButton backButton;
    ListView simpleList;
    String signsDescription[] = {
            "Shows directions to nearby towns and cities.",
            "Shows the distances in kilometres to towns and cities on the road.",
            "Various exit signs are used on freeways. In urban areas, many exit ramps have more than one lane. Overhead and ground-mounted signs help drivers choose the correct lane to exit or stay on the freeway.",
            "Advance signs use arrows to show which lanes lead off the freeway. Signs are also posted at the exit.",
            "Sometimes one or more lanes may lead off the freeway. The arrows matching the exit lanes are shown on the advance sign in a yellow box with the word ‘exit' under them.",
            "Freeway interchanges or exits have numbers that correspond to the distance from the beginning of the freeway. For example, interchange number 204 on Highway 401 is 204 kilometres from Windsor, where the freeway begins. Distances can be calculated by subtracting one interchange number from another.",
            "The term 'VIA' is used to describe the roads that must be followed to reach a destination.",
            "Shows the upcoming roundabout exits and where they will take you.",
            "These signs change according to traffic conditions to give drivers current information on delays and lane closures ahead.",
            "Shows off-road facilities such as hospitals, airports, universities or carpool lots.",
            "Shows route to passenger railway station.",
            "Shows route to airport.",
            "Shows facilities that are accessible by wheelchair.",
            "D sign – Oversize load"};
    int signsImage[] = {R.drawable.is0,
            R.drawable.is1,
            R.drawable.is2,
            R.drawable.is3,
            R.drawable.is4,
            R.drawable.is5,
            R.drawable.is6,
            R.drawable.is7,
            R.drawable.is8,
            R.drawable.is9,
            R.drawable.is10,
            R.drawable.is11,
            R.drawable.is12,
            R.drawable.is13};



    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regulatory_signs);

        simpleList = (ListView)findViewById(R.id.simpleListView);
        RegulatoryCustomAdapter customAdapter = new RegulatoryCustomAdapter(getApplicationContext(), signsDescription, signsImage);
        simpleList.setAdapter(customAdapter);

        backButton=(ImageButton)findViewById(R.id.backArrow);
        headerText =(TextView)findViewById(R.id.headerText);
        headerText.setText("Information Signs");



    }



    public void backToHome(View view) {
        Intent mainIntent = new Intent(InformationSigns.this,Home.class);
        mainIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(mainIntent);
    }

    @Override
    public void onBackPressed() {
        Intent mainIntent = new Intent(InformationSigns.this,Home.class);

        mainIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(mainIntent);

        return;
    }


}