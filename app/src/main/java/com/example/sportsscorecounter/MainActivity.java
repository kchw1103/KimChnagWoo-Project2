package com.example.sportsscorecounter;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    int koScore = 0;
    int hoScore = 0;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView kScore = (TextView) findViewById(
                R.id.koreaScore);

        final TextView hScore = (TextView) findViewById(
                R.id.hongScore);

        Button koreaPlus = (Button) findViewById(R.id.koreaPlus);
        koreaPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                koScore++;
                kScore.setText("" + koScore);
                if(koScore > hoScore) {
                    result = "Korea";
                }

                if(koScore == hoScore)
                {
                    result = "Korea and Hongkong";
                }

                if(koScore < hoScore)
                {
                    result = "Hongkong";
                }
            }
        });

        Button koreaMinus = (Button) findViewById(R.id.koreaMinus);
        koreaMinus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (koScore >= 0) {
                    koScore--;
                } else
                    koScore = 0;
                kScore.setText("" + koScore);
                if(koScore > hoScore) {
                    result = "Korea";
                }

                if(koScore == hoScore)
                {
                    result = "Korea and Hongkong";
                }

                if(koScore < hoScore)
                {
                    result = "Hongkong";
                }
            }
        });

        Button hongkongPlus = (Button) findViewById(R.id.hongkongPlus);
        hongkongPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                hoScore++;
                hScore.setText("" + hoScore);
                if(koScore > hoScore) {
                    result = "Korea";
                }

                if(koScore == hoScore)
                {
                    result = "Korea and Hongkong";
                }

                if(koScore < hoScore)
                {
                    result = "Hongkong";
                }
            }
        });

        Button hongkongMinus = (Button) findViewById(R.id.hongkongMinus);
        hongkongMinus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (hoScore >= 0) {
                    hoScore--;
                } else
                    hoScore = 0;
                hScore.setText("" + hoScore);
                if(koScore > hoScore) {
                    result = "Korea";
                }

                if(koScore == hoScore)
                {
                    result = "Korea and Hongkong";
                }

                if(koScore < hoScore)
                {
                    result = "Hongkong";
                }
            }
        });

        Button sendbutton = (Button) findViewById(R.id.sendScore);
        sendbutton.setOnClickListener(new View.OnClickListener(){
            public  void  onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Result")
                        .setMessage("Winner is  :  " + result + "\n"
                                + "\n" + "\n" + "\n" + "               Thank you for watching")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).show();
            }
        });
    }


}
