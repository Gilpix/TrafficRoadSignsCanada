package com.vid_lancer.trafficroadsignscanada;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class OtherSigns extends Activity {


    TextView headerText;
    ImageButton backButton;
    ListView simpleList;
    String signsDescription[] = {
            "Only public vehicles such as buses, or passenger vehicles carrying a specified minimum number of passengers, may use this lane.",
            "Vehicles cannot change lanes into or out of a high-occupancy vehicle lane in this area.",
            "The “slow-moving vehicle” sign is an orange triangle with a red border. It alerts other drivers that the vehicle ahead will be travelling at 40 km/h or less. When on a road, farm tractors, farm implements/machinery, and vehicles not capable of sustaining speeds over 40 km/h must display the slow moving vehicle sign. Watch for these slow moving vehicles and reduce your speed as necessary.",
            "EDR signs are used during the unscheduled closure of a provincial highway when OPP detour all traffic off the highway. The EDR markers are located along alternative routes and provide direction to motorists around the closure and back onto the highway.",
            "This placard indicates a long commercial vehicle, which is a double trailer and can be up to 40 metres in length. It is important to be able to recognize an LCV on the highway, based on rear signage, and anticipate both the extended length and limited speed when preparing to pass one on the highway.",
            "Some information signs include a numbering system along the bottom of the sign to assist emergency vehicles and drivers in determining an appropriate route.",
            "Watch for these signs when driving in designated bilingual areas. Read the messages in the language you understand best. Bilingual messages may be together on the same sign or separate, with an English sign immediately followed by a French sign."};
    int signsImage[] = {R.drawable.os0,
            R.drawable.os1,
            R.drawable.os2,
            R.drawable.os3,
            R.drawable.os4,
            R.drawable.os5,
            R.drawable.os6};



    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regulatory_signs);

        simpleList = (ListView)findViewById(R.id.simpleListView);
        RegulatoryCustomAdapter customAdapter = new RegulatoryCustomAdapter(getApplicationContext(), signsDescription, signsImage);
        simpleList.setAdapter(customAdapter);

        backButton=(ImageButton)findViewById(R.id.backArrow);
        headerText =(TextView)findViewById(R.id.headerText);
        headerText.setText("Other Signs");



    }



    public void backToHome(View view) {
        Intent mainIntent = new Intent(OtherSigns.this,Home.class);
        startActivity(mainIntent);
    }

    @Override
    public void onBackPressed() {
        Intent mainIntent = new Intent(OtherSigns.this,Home.class);

        startActivity(mainIntent);

        return;
    }


}