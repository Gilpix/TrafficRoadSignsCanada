package com.vid_lancer.trafficroadsignscanada;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.content.ActivityNotFoundException;

import quiz.Quiz;
import quiz.Quiz5;

public class Options extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options);


    }


    public void roadSigns(View view) {
        Intent sign =new Intent(Options.this, Home.class);
        startActivity(sign);
        finish();
    }

    public void quiz(View view) {
        Intent quiz =new Intent(Options.this, Quiz.class);
        startActivity(quiz);
        finish();
    }

    public void shareApp(View v) {
        Intent shareIntent =   new Intent(android.content.Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Install This Application");
        String app_url = "https://play.google.com/store/apps/details?id=com.vid_lancer.trafficroadsignscanada";
        shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,app_url);
        startActivity(Intent.createChooser(shareIntent, "Share via"));

    }

    public void rateUsOnAppStore(View view) {



            try
            {
                Intent rateIntent = rateIntentForUrl("market://details");
                startActivity(rateIntent);
            }
            catch (ActivityNotFoundException e)
            {
                Intent rateIntent = rateIntentForUrl("https://play.google.com/store/apps/details");
                startActivity(rateIntent);
            }
        }

        private Intent rateIntentForUrl(String url)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(String.format("%s?id=%s", url, getPackageName())));
            int flags = Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_MULTIPLE_TASK;
            if (Build.VERSION.SDK_INT >= 21)
            {
                flags |= Intent.FLAG_ACTIVITY_NEW_DOCUMENT;
            }
            else
            {
                //noinspection deprecation
                flags |= Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET;
            }
            intent.addFlags(flags);
            return intent;
        }


    @Override
    public void onBackPressed() {


        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();



                    }
                })
                .setNegativeButton("No", null)
                .show();



        return;
    }




}
