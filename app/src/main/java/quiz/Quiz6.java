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

public class Quiz6 extends Activity {

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
    String option1[] ={"Vehicles displayed may not drive in this lane",
            "Keep to the left",
            "Winding road up ahead",
            "Winding road ahead",
            "Pavement has been grooved",
            "Road ending on left",
            "Only pass vehicles when you see this sign flashing",
            "Stop and drive slowly through school zone",
            "Follow detour marker until you return to the regular route",
            "Construction work one kilometre ahead",
            "Police with scanner ahead",
            "Wait for policeman to direct traffic direction",
            "Detour up ahead",
            "Road work ahead",
            "Sharp right turn up ahead",

    };
    String option2[] ={"Public vehicles like buses, or passenger vehicles carrying a specified minimum number of passengers, may use this lane",
            "Only high occupancy vehicles may cross",
            "Road slippery when wet",
            "Drivers must follow the road in the direction shown",
            "Ferry route",
            "Bridge narrow ahead",
            "No passing at any time",
            "Reduce speed and be prepared to stop",
            "Follow sign to use short cut to highway",
            "Next 1 km construction zone",
            "Survey crew working on the road ahead",
            "No hitchhiking permitted",
            "construction zone begins here. Drive carefully and be prepared for a lower speed limit",
            "Slow down, detour to follow",
            "Lane closing, merge in direction of arrow",

    };
    String option3[] ={"Specified vehicles may use this lane",
            "Vehicles cannot change lanes into or out of a high occupancy vehicle lane in this area",
            "Temporary detour from normal traffic route",
            "Farm vehicles entering roadway from the direction of the arrow",
            "Provincial campground ahead",
            "Lane ahead is closed for roadwork. Obey speed limit and merge with traffic in the open lane",
            "Pass only from the right of the vehicle bearing this sign",
            "Slow down and follow directions on how to exit construction zone",
            "Lane closed ahead, make u-turn and find alternate route",
            "Construction zone ends",
            "Bird watching ahead",
            "Traffic control person ahead. Drive slowly and watch for instructions",
            "Drive slowly and watch for construction workers",
            "Slow down pedestrian crossing ahead",
            "Steep climb up ahead",

    };
    String option4[] ={"This lane is designated for high performance 2 passenger vehicles",
            "Hazardous roadway, pass to the left",
            "Steep climb up ahead",
            "Rest stop in the direction of the arrow",
            "Car pool parking ahead",
            "Paved roadway ending ahead",
            "Do not pass the pilot or pace vehicle that has this sign flashing",
            "Slow down and only stop if you see school children",
            "Merge with traffic in the open lane",
            "Roadwork up ahead",
            "Sight seeing ahead",
            "Wait for pedestrians and then proceed with caution",
            "Watch for uneven road",
            "Watch for bumps",
            "Construction up ahead",

    };
    String answer[]={"Public vehicles like buses, or passenger vehicles carrying a specified minimum number of passengers, may use this lane",
            "Vehicles cannot change lanes into or out of a high occupancy vehicle lane in this area",
            "Temporary detour from normal traffic route",
            "Drivers must follow the road in the direction shown",
            "Pavement has been grooved",
            "Lane ahead is closed for roadwork. Obey speed limit and merge with traffic in the open lane",
            "Do not pass the pilot or pace vehicle that has this sign flashing",
            "Reduce speed and be prepared to stop",
            "Follow detour marker until you return to the regular route",
            "Construction work one kilometre ahead",
            "Survey crew working on the road ahead",
            "Traffic control person ahead. Drive slowly and watch for instructions",
            "construction zone begins here. Drive carefully and be prepared for a lower speed limit",
            "Road work ahead",
            "Lane closing, merge in direction of arrow",

    };


    int signsImage[] = {R.drawable.qf1,
            R.drawable.qf2,
            R.drawable.qf3,
            R.drawable.qf4,
            R.drawable.qf5,
            R.drawable.qf6,
            R.drawable.qf7,
            R.drawable.qf8,
            R.drawable.qf9,
            R.drawable.qf10,
            R.drawable.qf11,
            R.drawable.qf12,
            R.drawable.qf13,
            R.drawable.qf14,
            R.drawable.qf15};




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
        headerText.setText("Quiz F");


        numOfQue =que.length;

    }






    public void backToHome(View view) {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent mainIntent = new Intent(Quiz6.this,Quiz.class);
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
                        Intent mainIntent = new Intent(Quiz6.this,Quiz.class);
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



            Intent i = new Intent (Quiz6.this, Result.class);
            String headText="Quiz F";
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

            Toast.makeText(Quiz6.this, "Select One Option", Toast.LENGTH_SHORT).show();
            // toast.setGravity(Gravity.CENTER|Gravity.CENTER_HORIZONTAL,0,0);

        }

    }
}