package com.vid_lancer.trafficroadsignscanada;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class RegulatorySigns extends Activity {

    TextView headerText;



    ImageButton backButton;
    ListView simpleList;
    String signsDescription[] = {"A stop sign is eight-sided and has a red background with white letters. Indicates that drivers must come to a full stop at an intersection.",
            "A school zone sign is five-sided and has a fluorescent yellow/green background with black symbols. It warns that you are coming to a school zone. Slow down, drive with extra caution and watch for children.",
            "A yield sign is a triangle with a white background and a red border. It means you must let traffic in the intersection or close to it go first. Stop if necessary and go only when the way is clear.",
            "A railway crossing sign is X-shaped with a white background and red outline. It warns that railway tracks cross the road. Watch for this sign. Slow down and look both ways for trains. Be prepared to stop.",
            "This road is an official bicycle route. Watch for cyclists and be prepared to share the road with them.",
            "You may park in the area between the signs during the times posted. (Used in pairs or groups.)",
            "Snowmobiles may use this road.",
            "Do not enter this road",
            "Do not stop in the area between the signs. This means you may not stop your vehicle in this area, even for a moment. (Used in pairs or groups.)",
            "Do not stand in the area between the signs. This means you may not stop your vehicle in this area except while loading or unloading passengers. (Used in pairs or groups.)",
            "Do not park in the area between the signs. This means you may not stop your vehicle except to load or unload passengers or merchandise. (Used in pairs or groups.)",
            "Do not turn left at the intersection.",
            "Do not drive through the intersection.",
            "Do not turn to go in the opposite direction. (U-turn)",
            "Do not turn right when facing a red light at the intersection.",
            "Do not turn left during the times shown.",
            "This parking space is only for vehicles displaying a valid Accessible Parking Permit.",
            "No bicycles allowed on this road.",
            "No pedestrians allowed on this road.",
            "Keep to the right of the traffic island.",
            "Speed limit changes ahead.",
            "Do not pass on this road.",
            "Slow traffic on multi-lane roads must keep right.",
            "Indicates areas where the community has identified that there is a special risk to pedestrians. Traffic related offences committed within the zone are subject to increased fines.",
            "The speed limit in this zone is lower during school hours. Observe the speed limit shown when the yellow lights are flashing.",
            "Stop for school bus when signals are flashing.",
            "This sign is installed on multi-lane highways with no centre median divider. It informs drivers approaching from both directions that they must stop for a school bus when its signal lights are flashing.",
            "These signs, above the road or on the pavement before an intersection, tell drivers the direction they must travel. For example: the driver in lane one must turn left; the driver in lane two must turn left or go straight ahead; and the driver in lane three must turn right.",
            "Traffic may travel in one direction only.",
            "This is a pedestrian crossover. Be prepared to stop and yield right-of-way to pedestrians.",
            "This sign, above the road or on the ground, means the lane is only for two-way left turns.",
            "This sign reserves curb area for vehicles displaying a valid Accessible Person Parking Permit picking up and dropping off passengers with disabilities.",
            "These signs mean lanes are only for specific types of vehicles, either all the time or during certain hours. Different symbols are used for the different types of vehicles. They include: buses, taxis, vehicles with three or more people and bicycles.",
            "Keep to the right lane except when passing on two-lane sections where climbing or passing lanes are provided.",
            "This sign on the back of transit buses serves as a reminder to motorists of the law requiring vehicles approaching a bus stopped at a dedicated Bus Stop to yield to the bus, once the bus has signalled its intent to return to the lane.",
            "Road forks to the right.",
            "Marks a zone within which school buses load or unload passengers without using the red alternating lights and stop arm."};
    int signsImage[] = {R.drawable.qrs0,R.drawable.qrs1,R.drawable.qrs2,R.drawable.qrs3,
            R.drawable.rsa, R.drawable.rsb, R.drawable.rsc, R.drawable.rsd, R.drawable.rse, R.drawable.rsf,R.drawable.rsg,R.drawable.rsh,R.drawable.rsi,R.drawable.rsj,R.drawable.rsk,R.drawable.rsl,R.drawable.rsm,R.drawable.rsn,R.drawable.rso,R.drawable.rsp,R.drawable.rsq,R.drawable.rsr,R.drawable.rss,R.drawable.rst,R.drawable.rsu,R.drawable.rsv,R.drawable.rsw,R.drawable.rsx,R.drawable.rsy,R.drawable.rsz,R.drawable.rsza,R.drawable.rszb,R.drawable.rszc,R.drawable.rszd,R.drawable.rsze,R.drawable.rszf,R.drawable.rszg};



    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regulatory_signs);

        simpleList = (ListView)findViewById(R.id.simpleListView);
        RegulatoryCustomAdapter customAdapter = new RegulatoryCustomAdapter(getApplicationContext(), signsDescription, signsImage);
        simpleList.setAdapter(customAdapter);

        backButton=(ImageButton)findViewById(R.id.backArrow);
        headerText =(TextView)findViewById(R.id.headerText);
        headerText.setText("Regulatory Signs");



        //backButton.setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);


    }

    public void backToHome(View view) {
        Intent mainIntent = new Intent(RegulatorySigns.this,Home.class);
        mainIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(mainIntent);
    }

    @Override
    public void onBackPressed() {
        Intent mainIntent = new Intent(RegulatorySigns.this,Home.class);

        mainIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(mainIntent);

        return;
    }
}