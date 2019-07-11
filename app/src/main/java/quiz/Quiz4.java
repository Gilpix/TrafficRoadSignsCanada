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

public class Quiz4 extends Activity {

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
    String option1[] ={"Slight bend or curve in the road ahead",
            "One way traffic only up ahead",
            "Intersection ahead. The arrow shows which direction of traffic has the right-of-way",
            "Highway traffic merging",
            "Right turning vehicles only",
            "Temporary detour",
            "Only bicycles permitted",
            "Dead-end street up ahead",
            "Bumpy road ahead",
            "Divided highway ends",
            "Road break up ahead, expect detour",
            "Railway crossing ahead",
            "Steep hill ahead. You may need to use a lower gear",
            "One-way road up ahead",
            "Entry gate up ahead. Slow down",
    };
    String option2[] ={"Two roads going in the same direction are about to join into one",
            "Road branching off ahead",
            "Available parking on side streets",
            "Bridge ahead",
            "Sharp bend or turn in the road ahead",
            "Winding road up ahead",
            "Bicycle safety enforced",
            "Stop sign ahead. Slow down",
            "curved road up ahead",
            "Narrow bridge ahead. Stop and proceed with caution",
            "Bicycle lane ending",
            "Stop sign 150 metres (500 feet) ahead",
            "Trucks not allowed",
            "Construction traffic merging from right",
            "Narrow bridge ahead. Stop and wait for direction",
    };
    String option3[] ={"The road ahead is split into two separate roads",
            "Rest stop on right",
            "Cross street intersects with a one-way street",
            "Road ending",
            "Construction zone on right",
            "Road slippery when wet",
            "Bicycle parking available",
            "Stop and then proceed",
            "Road ahead slippery when wet",
            "Road under construction, proceed with caution",
            "Right Lane ends, merge in to left lane",
            "Traffic signal ahead, slow down",
            "Truck inspection station up ahead",
            "Two lanes join, drivers on both roads are equally responsible to ensure traffic merges smoothly and safely",
            "Road under construction. Watch for construction workers",
    };
    String option4[] ={"Narrow bridge/passage ahead",
            "Hidden detour on right",
            "Hidden roadway on both the left and right",
            "Pavement narrows ahead",
            "Detour on right",
            "Steep climb up ahead",
            "Bicycle crossing ahead",
            "Stop sign only for traffic coming from ahead",
            "Streetcar tracks ahead, proceed with caution",
            "The road ahead is split into two separate roads by a median, Keep right",
            "Pedestrian crossing up ahead",
            "Watch for traffic (400 feet) ahead",
            "Trailer park up ahead",
            "Highway on ramp merging from right. Watch for fast moving traffic",
            "Divided highway ends ahead",
    };
    String answer[]={"Narrow bridge/passage ahead",
            "Road branching off ahead",
            "Intersection ahead. The arrow shows which direction of traffic has the right-of-way",
            "Pavement narrows ahead",
            "Sharp bend or turn in the road ahead",
            "Winding road up ahead",
            "Bicycle crossing ahead",
            "Stop sign ahead. Slow down",
            "Road ahead slippery when wet",
            "The road ahead is split into two separate roads by a median, Keep right",
            "Right Lane ends, merge in to left lane",
            "Traffic signal ahead, slow down",
            "Steep hill ahead. You may need to use a lower gear",
            "Two lanes join, drivers on both roads are equally responsible to ensure traffic merges smoothly and safely",
            "Divided highway ends ahead",
    };


    int signsImage[] = {R.drawable.qc16,
            R.drawable.qc17,
            R.drawable.qc18,
            R.drawable.qc19,
            R.drawable.qc20,
            R.drawable.qc21,
            R.drawable.qc22,
            R.drawable.qc23,
            R.drawable.qc24,
            R.drawable.qc25,
            R.drawable.qc26,
            R.drawable.qc27,
            R.drawable.qc28,
            R.drawable.qc29,
            R.drawable.qc30};




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
        headerText.setText("Quiz D");


        numOfQue =que.length;

    }






    public void backToHome(View view) {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent mainIntent = new Intent(Quiz4.this,Quiz.class);
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
                        Intent mainIntent = new Intent(Quiz4.this,Quiz.class);
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



            Intent i = new Intent (Quiz4.this, Result.class);
            String headText="Quiz D";
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

            Toast.makeText(Quiz4.this, "Select One Option", Toast.LENGTH_SHORT).show();
            // toast.setGravity(Gravity.CENTER|Gravity.CENTER_HORIZONTAL,0,0);

        }

    }
}