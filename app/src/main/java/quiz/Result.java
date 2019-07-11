package quiz;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ProgressBar;
import android.os.Handler;


import com.vid_lancer.trafficroadsignscanada.R;

public class Result extends Activity {

    int progVal=0;
    TextView pV;
    TextView headerText;
    TextView marks, passFail;
    String htext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);



        headerText=(TextView)findViewById(R.id.headerText);
        marks=(TextView)findViewById(R.id.marks);
        passFail=(TextView)findViewById(R.id.passFail);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.circularProgressBar);
        pV=(TextView)findViewById(R.id.progressVal);







        Intent i = getIntent();
         htext=i.getStringExtra("Header");
        headerText.setText(htext);

        String quesNum=i.getStringExtra("NumOfQ");
        int queNum = Integer.parseInt(quesNum);


        String easyPuzzle = i.getStringExtra("Result");
        int point = Integer.parseInt(easyPuzzle);

        int pointPer=((point)*100)/queNum;

        pV.setText("Correct " +pointPer+"%");
        marks.setText(point+" out of "+quesNum);

        progressBar.setProgress(pointPer);
        passFail.setText(quizRes(point));





    }

    public String quizRes(int point)
    {
        if(point<=5)
            return "Quiz Fail";
        else
            return "Quiz Pass";
    }


    public void OtherQuiz(View view) {
        Intent intent=new Intent(Result.this,Quiz.class);
        startActivity(intent);
        finish();

    }

    public void tryQuizAgain(View view) {
        if(htext.equals("Quiz A")) {
            Intent intent = new Intent(Result.this, Quiz1.class);
            startActivity(intent);
            finish();
        }
        if(htext.equals("Quiz B")) {
            Intent intent = new Intent(Result.this, Quiz2.class);
            startActivity(intent);
            finish();
        }
        if(htext.equals("Quiz C")) {
            Intent intent = new Intent(Result.this, Quiz3.class);
            startActivity(intent);
            finish();
        }
        if(htext.equals("Quiz D")) {
            Intent intent = new Intent(Result.this, Quiz4.class);
            startActivity(intent);
            finish();
        }
        if(htext.equals("Quiz E")) {
            Intent intent = new Intent(Result.this, Quiz5.class);
            startActivity(intent);
            finish();
        }
        if(htext.equals("Quiz F")) {
            Intent intent = new Intent(Result.this, Quiz6.class);
            startActivity(intent);
            finish();
        }
        if(htext.equals("Quiz G")) {
            Intent intent = new Intent(Result.this, Quiz7.class);
            startActivity(intent);
            finish();
        }

    }


    @Override
    public void onBackPressed() {


        Intent intent=new Intent(Result.this,Quiz.class);
        startActivity(intent);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK |Intent.FLAG_ACTIVITY_CLEAR_TOP);

        finish();
    }


}
