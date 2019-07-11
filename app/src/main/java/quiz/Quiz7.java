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

public class Quiz7 extends Activity {

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
    String option1[] ={"An exit sign telling you which lane to drive in if you want to exit on Delta street",
            "Right turn only",
            "Highway closed ahead, all traffic must exit off in the direction of the arrows",
            "Trafalgar Road exit in 204 km",
            "The term \"VIA\" is used to describe the roads that must be followed to reach a destination. To get to the Q.E.W go by the way of the 403",
            "Sign indicates there is only an airport nearby",
            "Shows wheelchair accessible facilities",
            "Yield to vehicles entering from the left",
            "Advertisement signs on highways",
            "Obey signs only if you know French",
            "Sign displayed on public transit vehicles",
            "Bridge up ahead",
            "Delta population 144 thousand and Surrey population 164 thousand",
            "Route to airport",
            "Road is slippery when wet",

    };
    String option2[] ={"Right turn only",
            "Steep curve up ahead",
            "Advance directional sign showing which lanes lead off the highway",
            "You will be approaching interchange 204, Trafalgar Road in 1 km",
            "Exit to the 403 is coming up on the left",
            "Sign showing off-road facilities such as hospitals, airports, universities or carpool lots",
            "Wheelchair parking only",
            "Yield to vehicles entering from the right",
            "Traffic bulletin signs that change according to traffic conditions to give drivers current information on delays and lane closures ahead",
            "Bilingual signs are for educational purposes only",
            "Sign displayed on wheelchair accessible vehicles",
            "Shows route to ferry",
            "Next exit to Delta in 144 meters",
            "Plane flying zone",
            "Beware of slow moving vehicles entering traffic",

    };
    String option3[] ={"Road ending exit to right",
            "All lanes ending up ahead",
            "Highway sign indicating next exit in 10 km",
            "Interchange 204 is 1 km away from Toronto",
            "Exit to the Q.E.W is coming up on the left",
            "Sign showing emergency number to call if in trouble",
            "Vehicles displaying an Accessible Parking Permit may only park here",
            "Sign displayed by slow-moving vehicles on road, travelling less than 40 km/h",
            "Information sign informing drivers of upcoming exits",
            "Bilingual signs only posted in communities with a French school",
            "Sign displayed on school buses",
            "Deep water up ahead",
            "Destination board - Delta 144 kms and Surrey 164 kms",
            "Air force base up ahead",
            "Approaching roadworks, slow down",

    };
    String option4[] ={"Traffic merging from left",
            "One or more lanes allow you to exit off the highway",
            "Highway sign indicating next exit in 30 km",
            "It is 204 km to Trafalgar Road",
            "The 403 and the Q.E.W are the same highway",
            "Sign indicating next on highway rest stop facilities",
            "Indicates retirement living community. Slow down and keep noise low",
            "Watch for snow removal vehicle ahead",
            "Information sign informing drivers of nearby recreational sites",
            "Bilingual signs provide important information. Read message in language understood best",
            "Over-sized load sign, drive around vehicle bearing this with caution",
            "No public swimming ahead",
            "Road ending in 144 kms",
            "Travel services on next exit",
            "Watch out for loose stones",

    };
    String answer[]={"An exit sign telling you which lane to drive in if you want to exit on Delta street",
            "One or more lanes allow you to exit off the highway",
            "Advance directional sign showing which lanes lead off the highway",
            "You will be approaching interchange 204, Trafalgar Road in 1 km",
            "The term \"VIA\" is used to describe the roads that must be followed to reach a destination. To get to the Q.E.W go by the way of the 403",
            "Sign showing off-road facilities such as hospitals, airports, universities or carpool lots",
            "Shows wheelchair accessible facilities",
            "Sign displayed by slow-moving vehicles on road, travelling less than 40 km/h",
            "Traffic bulletin signs that change according to traffic conditions to give drivers current information on delays and lane closures ahead",
            "Bilingual signs provide important information. Read message in language understood best",
            "Over-sized load sign, drive around vehicle bearing this with caution",
            "Shows route to ferry",
            "Destination board - Delta 144 kms and Surrey 164 kms",
            "Route to airport",
            "Watch out for loose stones",

    };


    int signsImage[] = {R.drawable.qf16,
            R.drawable.qf17,
            R.drawable.qf18,
            R.drawable.qf19,
            R.drawable.qf20,
            R.drawable.qf21,
            R.drawable.qf22,
            R.drawable.qf23,
            R.drawable.qf24,
            R.drawable.qf25,
            R.drawable.qf26,
            R.drawable.qf27,
            R.drawable.qf28,
            R.drawable.qf29,
            R.drawable.qf30};




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
        headerText.setText("Quiz G");


        numOfQue =que.length;

    }






    public void backToHome(View view) {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent mainIntent = new Intent(Quiz7.this,Quiz.class);
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
                        Intent mainIntent = new Intent(Quiz7.this,Quiz.class);
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



            Intent i = new Intent (Quiz7.this, Result.class);
            String headText="Quiz G";
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

            Toast.makeText(Quiz7.this, "Select One Option", Toast.LENGTH_SHORT).show();
            // toast.setGravity(Gravity.CENTER|Gravity.CENTER_HORIZONTAL,0,0);

        }

    }
}