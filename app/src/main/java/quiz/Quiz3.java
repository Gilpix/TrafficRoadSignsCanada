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

public class Quiz3 extends Activity {

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
    String option1[] ={"Drivers on the sideroad at the intersection ahead don't have a clear view of traffic",
            "Minimum speed 50 km/h",
            "Bus stop on the right",
            "Hospital entrance on the right",
            "Hazard close to the edge of the road. Downward line indicate side to pass hazard on",
            "Road broken ahead",
            "Railway crossing ahead",
            "Maximum safe speed to drive on ramp is 60 km/h",
            "Public transit terminal up ahead",
            "Road ends",
            "No animals allowed",
            "Snowmobiles cross this road",
            "Cross-country skiing zone up ahead",
            "Hidden school bus stop coming up. Slow down, drive with caution, watch for children and flashing red lights",
            "Right turning lane only",
            };
    String option2[] ={"Hidden detour on right",
            "Maximum safe speed on ramp is 50 km/hr",
            "Construction vehicles entering from the right",
            "Upcoming fire truck entrance on the right and vehicles should yield to fire trucks entering the roadway",
            "Single lane ahead",
            "The bridge ahead lifts or swings to let boats pass",
            "Sign indicating an upcoming exit to the right",
            "Next rest stop is in 60 km",
            "Pedestrian crossing up ahead",
            "Paved surface ends ahead",
            "Deer may cross the road",
            "Snowmobile recreation facility up ahead",
            "Hiking trail entrance up ahead",
            "Public transit terminal up ahead. Slow down and proceed with caution",
            "Slight bend or curve in the road ahead",
    };
    String option3[] ={"Dead end road on right",
            "Next rest stop in 50 km",
            "Upcoming bus entrance on the right and vehicles should be prepared to yield to buses entering the roadway",
            "Construction vehicles entering from the right",
            "Roadway ending, detour route to be indicated",
            "Scenic water route up ahead",
            "Chevron points - This sign warns drivers of upcoming sharp turns",
            "Dangerous driving for next 60 km",
            "Kids playing ahead",
            "Roadway under construction",
            "You are entering a game farm",
            "Snowmobile's must adhere to traffic lights",
            "Watch for pedestrians and be prepared to share the road with them",
            "Pedestrian crossing up ahead",
            "Highway onramp approaching ahead",
    };
    String option4[] ={"Police station on right",
            "No stopping for next 50 km",
            "Highway exit coming up on the right",
            "Highway exit coming up on the right",
            "Crossing up ahead, proceed with caution",
            "Ramp ahead - drive with caution",
            "Sign indicating an upcoming pedestrian crosswalk",
            "Drive at least 60 km/hr on ramp",
            "Slow down, school zone ahead, watch for children and drive with extra caution",
            "Only local traffic allowed beyond this point",
            "Watch for deer hunters",
            "Slow moving snowmobiles must stay right",
            "Crosswalk up ahead. Slow down and proceed with caution",
            "Do not pass when flashing",
            "Right turns permitted",
    };
    String answer[]={"Drivers on the sideroad at the intersection ahead don't have a clear view of traffic",
            "Maximum safe speed on ramp is 50 km/hr",
            "Upcoming bus entrance on the right and vehicles should be prepared to yield to buses entering the roadway",
            "Upcoming fire truck entrance on the right and vehicles should yield to fire trucks entering the roadway",
            "Hazard close to the edge of the road. Downward line indicate side to pass hazard on",
            "The bridge ahead lifts or swings to let boats pass",
            "Chevron points - This sign warns drivers of upcoming sharp turns",
            "Maximum safe speed to drive on ramp is 60 km/h",
            "Slow down, school zone ahead, watch for children and drive with extra caution",
            "Paved surface ends ahead",
            "Deer may cross the road",
            "Snowmobiles cross this road",
            "Watch for pedestrians and be prepared to share the road with them",
            "Hidden school bus stop coming up. Slow down, drive with caution, watch for children and flashing red lights",
            "Slight bend or curve in the road ahead",
    };


    int signsImage[] = {R.drawable.qc1,
            R.drawable.qc2,
            R.drawable.qc3,
            R.drawable.qc4,
            R.drawable.qc5,
            R.drawable.qc6,
            R.drawable.qc7,
            R.drawable.qc8,
            R.drawable.qc9,
            R.drawable.qc10,
            R.drawable.qc11,
            R.drawable.qc12,
            R.drawable.qc13,
            R.drawable.qc14,
            R.drawable.qc15};




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
        headerText.setText("Quiz C");


        numOfQue =que.length;

    }






    public void backToHome(View view) {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent mainIntent = new Intent(Quiz3.this,Quiz.class);
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
                        Intent mainIntent = new Intent(Quiz3.this,Quiz.class);
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



            Intent i = new Intent (Quiz3.this, Result.class);
            String headText="Quiz C";
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

            Toast.makeText(Quiz3.this, "Select One Option", Toast.LENGTH_SHORT).show();
            // toast.setGravity(Gravity.CENTER|Gravity.CENTER_HORIZONTAL,0,0);

        }

    }
}