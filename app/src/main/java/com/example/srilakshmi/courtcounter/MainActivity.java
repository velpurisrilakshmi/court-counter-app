package com.example.srilakshmi.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 int scoreteamA=0;
 int scoreteamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    public void addthreeforteamA(View view)

    {

        scoreteamA += 3 ;
        displayForTeamA(scoreteamA);

    }

    public void addtwoforteamA(View view)

    {

        scoreteamA += 2 ;
        displayForTeamA(scoreteamA);

    }

    public void addfreeforteamA(View view)

    {
        scoreteamA += 1 ;
        displayForTeamA(scoreteamA);

    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

   public void resetscore(View view)
   {
       scoreteamA=0;
       scoreteamB=0;
       displayForTeamA(scoreteamA);
       displayForTeamB(scoreteamB);
   }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addthreeforteamB(View view)

    {

        scoreteamB += 3 ;
        displayForTeamB(scoreteamB);

    }

    public void addtwoforteamB(View view)

    {

        scoreteamB += 2 ;
        displayForTeamB(scoreteamB);

    }

    public void addfreeforteamB(View view)

    {
        scoreteamB += 1 ;
        displayForTeamB(scoreteamB);

    }
}
