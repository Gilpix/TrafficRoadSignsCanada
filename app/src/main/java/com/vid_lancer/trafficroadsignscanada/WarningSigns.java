package com.vid_lancer.trafficroadsignscanada;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class WarningSigns extends Activity {


    TextView headerText;
    ImageButton backButton;
    ListView simpleList;
    String signsDescription[] = {
            "Narrow bridge ahead.",
            "Road branching off ahead.",
            "Intersection ahead. The arrow shows which direction of traffic has the right-of-way.",
            "Roundabout Ahead. Reduce Speed. The counter-clockwise arrows show the direction of vehicle traffic within the roundabout.",
            "Drivers on the sideroad at the intersection ahead don't have a clear view of traffic.",
            "Pavement narrows ahead.",
            "Slight bend or curve in the road ahead.",
            "Posted under a curve warning, this sign shows the maximum safe speed for the curve.",
            "Sharp bend or turn in the road ahead.",
            "Chevron (arrowhead) signs are posted in groups to guide drivers around sharp curves in the road.",
            "Winding road ahead.",
            "The bridge ahead lifts or swings to let boats pass.",
            "Paved surface ends ahead.",
            "Bicycle crossing ahead.",
            "Stop sign ahead. Slow down.",
            "Share the road with oncoming traffic.",
            "The share the road sign is used to warn motorists that they are to provide safe space on the road for cyclists and other vehicles. This sign also warns motorists and cyclists to exercise additional caution on the upcoming section of road.",
            "Pavement is slippery when wet. Slow down and drive with caution.",
            "Hazard close to the edge of the road. The downward lines show the side on which you may safely pass",
            "Divided highway begins: traffic travels in both directions on separated roads ahead. Keep to the right-hand road. Each road carries one-way traffic",
            "Right lane ends ahead. If you are in the right-hand lane, you must merge safely with traffic in the lane to the left.",
            "Traffic lights ahead. Slow down.",
            "Steep hill ahead. You may need to use a lower gear.",
            "Two roads going in the same direction are about to join into one. Drivers on both roads are equally responsible for seeing that traffic merges smoothly and safely.",
            "Snowmobiles cross this road.",
            "Divided highway ends: traffic travels in both directions on the same road ahead. Keep to the right-hand road.",
            "Underpass ahead. Take care if you are driving a tall vehicle. Sign shows how much room you have.",
            "Bump or uneven pavement on the road ahead. Slow down and keep control of your vehicle.",
            "Railway crossing ahead. Be alert for trains. This sign also shows the angle at which the railway tracks cross the road.",
            "Sharp turn or bend in the road in the direction of the arrow. The checkerboard border warns of danger. Slow down; be careful.",
            "Deer regularly cross this road; be alert for animals.",
            "Truck entrance on the right side of the road ahead. If the sign shows the truck on the left, the entrance is on the left side of the road.",
            "Shows maximum safe speed on ramp.",
            "Watch for pedestrians and be prepared to share the road with them.",
            "Watch for fallen rock and be prepared to avoid a collision.",
            "There may be water flowing over the road.",
            "This sign warns you that you are coming to a hidden school bus stop. Slow down, drive with extra caution, watch for children and for a school bus with flashing red lights.",
            "Indicates an upcoming bus entrance on the right and vehicles should be prepared to yield to buses entering the roadway.",
            "Indicates an upcoming fire truck entrance on the right and vehicles should be prepared to yield to fire trucks entering the roadway.",
            "These signs warn of a school crossing. Watch for children and follow the directions of the crossing guard or school safety patroller.",
            };
    int signsImage[] = {R.drawable.ws0,
            R.drawable.ws1,
            R.drawable.ws2,
            R.drawable.ws3,
            R.drawable.ws4,
            R.drawable.ws5,
            R.drawable.ws6,
            R.drawable.ws7,
            R.drawable.ws8,
            R.drawable.ws9,
            R.drawable.ws10,
            R.drawable.ws11,
            R.drawable.ws12,
            R.drawable.ws13,
            R.drawable.ws14,
            R.drawable.ws15,
            R.drawable.ws16,
            R.drawable.ws17,
            R.drawable.ws18,
            R.drawable.ws19,
            R.drawable.ws20,
            R.drawable.ws21,
            R.drawable.ws22,
            R.drawable.ws23,
            R.drawable.ws24,
            R.drawable.ws25,
            R.drawable.ws26,
            R.drawable.ws27,
            R.drawable.ws28,
            R.drawable.ws29,
            R.drawable.ws30,
            R.drawable.ws31,
            R.drawable.ws32,
            R.drawable.ws33,
            R.drawable.ws34,
            R.drawable.ws35,R.drawable.ws36,R.drawable.ws37,R.drawable.ws38,R.drawable.ws39};



    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regulatory_signs);

        simpleList = (ListView)findViewById(R.id.simpleListView);
        RegulatoryCustomAdapter customAdapter = new RegulatoryCustomAdapter(getApplicationContext(), signsDescription, signsImage);
        simpleList.setAdapter(customAdapter);

        backButton=(ImageButton)findViewById(R.id.backArrow);
        headerText =(TextView)findViewById(R.id.headerText);
        headerText.setText("Warning Signs");







    }



    public void backToHome(View view) {

        Intent mainIntent = new Intent(WarningSigns.this,Home.class);

        mainIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(mainIntent);
    }

    @Override
    public void onBackPressed() {
        Intent mainIntent = new Intent(WarningSigns.this,Home.class);

        mainIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(mainIntent);

            return;
        }
    }



