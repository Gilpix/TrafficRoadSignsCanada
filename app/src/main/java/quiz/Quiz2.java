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

public class Quiz2 extends Activity {

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
    String option1[] ={"No parking",
            "Road ends",
            "Valid bicycle permit required",
            "Maximum speed 50 km/hr ahead",
            "Traffic may travel slowly",
            "Maximum speed 40 km/hr",
            "Highway entrance ramps 100 meters ahead",
            "Roundabout up ahead",
            "Traffic permitted only in direction of sign",
            "Caution bicycle lane up ahead",
            "Vehicles displayed may not drive in this lane during the times indicated",
            "Approaching school zone",
            "Right turning vehicles only",
            "No stopping allowed within 10 feet of sign",
            "Vehicles approaching from the right have right-of-way"};
    String option2[] ={ "Emergency Parking only",
            "Do not drive through the intersection",
            "No bicycles allowed on this road",
            "Maximum speed 50 km/hr",
            "Speed limit changes ahead",
            "School zone, lowered speed when lights flashing",
            "The driver in - lane one must turn left; lane two must turn left or go straight ahead; and lane three must turn right",
            "the lane is only for two-way left turns",
            "No right turn",
            "No traffic permitted during times indicated",
            "Lane designated for the vehicles displayed and/or number of occupants in vehicle during times indicated",
            "Road closed",
            "Right of way belongs to vehicles turning right",
            "Bring your vehicle to a complete stop",
            "Vehicles approaching from the left have right-of-way"};
    String option3[] ={"You may not park unless a permit is obtained from the building owner",
            "Proceed through intersection if clear",
            "Do not leave bicycles unattended",
            "Maximum speed 50 km/hr ends",
            "Keep to the right of the traffic island",
            "Pedestrian crossing up ahead",
            "You may turn right if you stay in the right most lane",
            "Yield for left turning traffic",
            "Parking on right",
            "Yield for bicycle traffic",
            "No bicycles permitted during times indicated",
            "Do not Enter",
            "Road ending",
            "Road closed, do not enter",
            "Give others right of way"};
    String option4[] ={"This parking space is only for vehicles displaying a valid Accessible Parking Permit",
            "No left and right turns permitted",
            "Bicycles only",
            "Maximum speed 50 km/hr for trucks",
            "Slow traffic on multi-lane roads must keep right",
            "Caution - children playing",
            "You may turn right if you stay in the middle lane",
            "Option to turn left or right",
            "Sharp right turn up ahead",
            "Only bikes may use this lane, either all the time or during certain hours if displayed",
            "No traffic permitted during times indicated",
            "Do not pass",
            "Road forks to the right",
            "Stop if you see any vehicles approaching, otherwise slowly proceed through intersection",
            "Do not enter road"};
    String answer[]={"This parking space is only for vehicles displaying a valid Accessible Parking Permit",
            "Do not drive through the intersection",
            "No bicycles allowed on this road",
            "Maximum speed 50 km/hr",
            "Slow traffic on multi-lane roads must keep right",
            "School zone, lowered speed when lights flashing",
            "The driver in - lane one must turn left; lane two must turn left or go straight ahead; and lane three must turn right",
            "the lane is only for two-way left turns",
            "Traffic permitted only in direction of sign",
            "Only bikes may use this lane, either all the time or during certain hours if displayed",
            "Lane designated for the vehicles displayed and/or number of occupants in vehicle during times indicated",
            "Do not Enter",
            "Road forks to the right",
            "Bring your vehicle to a complete stop",
            "Give others right of way"};


    int signsImage[] = {R.drawable.q16,
            R.drawable.q17,
            R.drawable.q18,
            R.drawable.q19,
            R.drawable.q20,
            R.drawable.q21,
            R.drawable.q22,
            R.drawable.q23,
            R.drawable.q24,
            R.drawable.q25,
            R.drawable.q26,
            R.drawable.q27,
            R.drawable.q28,
            R.drawable.q29,
            R.drawable.q30};




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
        headerText.setText("Quiz B");


        numOfQue =que.length;

    }






    public void backToHome(View view) {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent mainIntent = new Intent(Quiz2.this,Quiz.class);
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
                        Intent mainIntent = new Intent(Quiz2.this,Quiz.class);
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



            Intent i = new Intent (Quiz2.this, Result.class);
            String headText="Quiz B";
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

            Toast.makeText(Quiz2.this, "Select One Option", Toast.LENGTH_SHORT).show();
            // toast.setGravity(Gravity.CENTER|Gravity.CENTER_HORIZONTAL,0,0);

        }

    }
}