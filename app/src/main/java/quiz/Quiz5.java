package quiz;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.os.Build;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.content.DialogInterface;
import android.app.AlertDialog;
import android.widget.Toast;

import android.widget.TextView;

import com.vid_lancer.trafficroadsignscanada.R;

public class Quiz5 extends Activity {

    RadioGroup radioGroup;
    TextView headerText;
    ImageButton backButton;
    int correct=0;

    private int currentQuestion;
    int numOfQue;



    TextView rque;
    ImageView queImg;
    RadioButton []ropt= new RadioButton[4];



    String que[] ={"Q1. What does this road sign mean?",
            "Q2. What does this road sign mean?",
            "Q3. What does this road sign mean?",
            "Q4. What does this road sign mean?",
            "Q5. What does this road sign mean?",
            "Q6. What does this road sign mean?",
            "Q7. What does this road sign mean?",
            "Q8. What does this road sign mean?",
            "Q9. What does this road sign mean?",
            "Q10. What does this road sign mean?",
            "Q11. What does this road sign mean?",
            "Q12. What does this road sign mean?",
            "Q13. What does this road sign mean?",
            "Q14. What does this road sign mean?",
            "Q15. What does this road sign mean?"};
    String option1[] ={"Railway sign indicating railway tracks close to the road, look both ways and be prepared to stop",
            "Maximum speed allowed is 50 km/hr",
            "Accessible permit parking only",
            "Approaching school zone, slow down and watch for children",
            "School zone coming up, slow down and watch for children",
            "School zone, drive with caution",
            "No entry",
            "Underpass with safe clearance indicated",
            "Construction up ahead",
            "Road ending",
            "Trucks at high speeds entering roadway",
            "Broken road up ahead",
            "Bridge up ahead",
            "Bridge coming up ahead",
            "Gas station located on the next right turning street",
    };
    String option2[] ={"No entry",
            "Maximum speed allowed is 80 km/hr",
            "Wheelchair accessible entrance",
            "All vehicles must stop for school bus in all directions when lights are flashing",
            "No cars allowed, pedestrian access only",
            "Crossing coming up, slow down and watch for children",
            "No U Turn allowed",
            "Maintain a minimum 3.9 meter distance from vehicle infront of you",
            "Bridge up ahead",
            "Railway crossing ahead",
            "Truck entrance ahead",
            "Watch for fallen rock and be prepared to avoid a collision",
            "Possible roadway flooding",
            "One way traffic only",
            "No right turns allowed",
    };
    String option3[] ={"Deer crossing in this area",
            "Minimum speed allowed is 50 km/hr",
            "Area between signs reserved for vehicles with a valid Accessible Person Parking Permit who are picking or dropping disabled passengers",
            "Approaching pedestrian cross-walk",
            "Area identified as a special risk to pedestrians, traffic related offences committed within this zone are subject to increased fines",
            "Bus loading zone coming up where school buses may load/unload passengers without using the red alternating lights and stop arm",
            "Roundabout up ahead",
            "Minimum parking distance on either side of sign",
            "Bumpy/uneven pavement ahead",
            "Streetcar tracks ahead",
            "No trucks allowed",
            "Rock climbing recreational facility up ahead",
            "Road broken up ahead",
            "The two-way road ahead is not divided by a median and you will be required to share the road ahead with oncoming traffic",
            "Right turning traffic only",
    };
    String option4[] ={"Approaching pedestrian crossing",
            "Speed limit changing to 50 km/hr up ahead",
            "Office issuing Accessible Peron Parking Permits located here",
            "School bus pickup/drop off location",
            "Police patrolled area",
            "School entrance to the right of sign",
            "Road slippery when wet",
            "Water depth",
            "Road block up ahead",
            "You are approaching a school zone",
            "Truck lane only",
            "Earthquake zone",
            "Green belt approaching",
            "The two way road ahead is divided by a median",
            "Sharp turn or bend in the road in the direction of the arrow, slow down and drive carefully",
    };
    String answer[]={"Railway sign indicating railway tracks close to the road, look both ways and be prepared to stop",
            "Speed limit changing to 50 km/hr up ahead",
            "Area between signs reserved for vehicles with a valid Accessible Person Parking Permit who are picking or dropping disabled passengers",
            "All vehicles must stop for school bus in all directions when lights are flashing",
            "Area identified as a special risk to pedestrians, traffic related offences committed within this zone are subject to increased fines",
            "Bus loading zone coming up where school buses may load/unload passengers without using the red alternating lights and stop arm",
            "No U Turn allowed",
            "Underpass with safe clearance indicated",
            "Bumpy/uneven pavement ahead",
            "Railway crossing ahead",
            "Truck entrance ahead",
            "Watch for fallen rock and be prepared to avoid a collision",
            "Possible roadway flooding",
            "The two-way road ahead is not divided by a median and you will be required to share the road ahead with oncoming traffic",
            "Sharp turn or bend in the road in the direction of the arrow, slow down and drive carefully",
    };


    int signsImage[] = {R.drawable.q31,
            R.drawable.q32,
            R.drawable.q33,
            R.drawable.q34,
            R.drawable.q35,
            R.drawable.q36,
            R.drawable.q37,
            R.drawable.qc31,
            R.drawable.qc32,
            R.drawable.qc33,
            R.drawable.qc34,
            R.drawable.qc35,
            R.drawable.qc36,
            R.drawable.qc37,
            R.drawable.qc38};




    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_custom_questions);


        radioGroup=(RadioGroup)findViewById(R.id.optGroup);
        rque =(TextView)findViewById(R.id.question);
        ropt[0]=(RadioButton)findViewById(R.id.opt1);
        ropt[1]=(RadioButton)findViewById(R.id.opt2);
        ropt[2]=(RadioButton)findViewById(R.id.opt3);
        ropt[3]=(RadioButton)findViewById(R.id.opt4);
        queImg=(ImageView)findViewById(R.id.queImage);


        rque.setText(que[currentQuestion]);
        queImg.setImageResource(signsImage[currentQuestion]);
        ropt[0].setText(option1[currentQuestion]);
        ropt[1].setText(option2[currentQuestion]);
        ropt[2].setText(option3[currentQuestion]);
        ropt[3].setText(option4[currentQuestion]);



        backButton=(ImageButton)findViewById(R.id.backArrow);
        headerText =(TextView)findViewById(R.id.headerText);
        headerText.setText("Quiz E");


        numOfQue =que.length;

    }






    public void backToHome(View view) {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent mainIntent = new Intent(Quiz5.this,Quiz.class);
                        startActivity(mainIntent);

                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    @Override
    public void onBackPressed() {


        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent mainIntent = new Intent(Quiz5.this,Quiz.class);
                        startActivity(mainIntent);

                    }
                })
                .setNegativeButton("No", null)
                .show();



        return;
    }




    public void option1Selected(View view) {
        checkAnswer(option1[currentQuestion],0);
        ropt[1].setEnabled(false);
        ropt[2].setEnabled(false);
        ropt[3].setEnabled(false);


    }

    public void option2Selected(View view) {
        checkAnswer(option2[currentQuestion],1);
        ropt[0].setEnabled(false);
        ropt[2].setEnabled(false);
        ropt[3].setEnabled(false);

    }

    public void option3Selected(View view) {
        checkAnswer(option3[currentQuestion],2);
        ropt[0].setEnabled(false);
        ropt[1].setEnabled(false);
        ropt[3].setEnabled(false);

    }

    public void option4Selected(View view) {
        checkAnswer(option4[currentQuestion],3);
        ropt[0].setEnabled(false);
        ropt[1].setEnabled(false);
        ropt[2].setEnabled(false);

    }



    public void checkAnswer(String selAns, int radioBt)
    {
        if(selAns==answer[currentQuestion])
        {
            correct++;
            ropt[radioBt].setTextColor(getResources().getColor(R.color.wrightAnswer));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
                ropt[radioBt].setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.wrightAnswer)));


        }
        else {
            ropt[radioBt].setTextColor(getResources().getColor(R.color.wrongAnswer));
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
                ropt[radioBt].setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.wrongAnswer)));


            if(option1[currentQuestion].equals(answer[currentQuestion]))
                ropt[0].setTextColor(getResources().getColor(R.color.wrightAnswer));

            if(option2[currentQuestion].equals(answer[currentQuestion]))
                ropt[1].setTextColor(getResources().getColor(R.color.wrightAnswer));

            if(option3[currentQuestion].equals(answer[currentQuestion]))
                ropt[2].setTextColor(getResources().getColor(R.color.wrightAnswer));

            if(option4[currentQuestion].equals(answer[currentQuestion]))
                ropt[3].setTextColor(getResources().getColor(R.color.wrightAnswer));
        }


    }


    public void showQuestion(int i)
    {
        {
            rque.setText(que[currentQuestion]);
            queImg.setImageResource(signsImage[currentQuestion]);
            ropt[0].setText(option1[currentQuestion]);
            ropt[1].setText(option2[currentQuestion]);
            ropt[2].setText(option3[currentQuestion]);
            ropt[3].setText(option4[currentQuestion]);
        }

    }

    public void nextQuestion(View view) {

        if(currentQuestion==que.length-1)
        {
            String correctAns = Integer.toString(correct);



            Intent i = new Intent (Quiz5.this, Result.class);
            String headText="Quiz E";
            String n= Integer.toString(numOfQue);
            i.putExtra("Header", headText);
            i.putExtra("NumOfQ",n);

            i.putExtra("Result", correctAns);
            currentQuestion =0;
            correct=0;
            startActivity(i);

        }

        else if(ropt[0].isChecked() || ropt[1].isChecked() || ropt[2].isChecked() || ropt[3].isChecked())
        {
            currentQuestion++;
            radioGroup.clearCheck();
            radioGroup.setEnabled(true);

            for (int i = 0; i < 4; i++) {
                ropt[i].setEnabled(true);
                ropt[i].setTextColor(getResources().getColor(R.color.radioOptText));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
                    ropt[i].setButtonTintList(ColorStateList.valueOf(getResources().getColor(R.color.solveQuiz)));
            }
            showQuestion(currentQuestion);

        }
        else if(!ropt[0].isChecked() && !ropt[1].isChecked() && !ropt[2].isChecked() && !ropt[3].isChecked())
        {

            Toast.makeText(Quiz5.this, "Select One Option", Toast.LENGTH_SHORT).show();
            // toast.setGravity(Gravity.CENTER|Gravity.CENTER_HORIZONTAL,0,0);

        }

    }
}