package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAscore = 0;
    int teamBscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /**
     * Displays the given score when +3points button is clicked for Team A.
     */
    public void teamA3Points(View view){
        teamAscore = teamAscore +3;
        displayForTeamA(teamAscore);
    }

    /**
     * Displays the given score when +3points button is clicked for Team B.
     */
    public void teamB3Points(View view){
        teamBscore = teamBscore +3;
        displayForTeamB(teamBscore);
    }

    /**
     * Displays the given score when +2points button is clicked for Team A.
     */
    public void teamA2Points(View view){
        teamAscore = teamAscore +2;
        displayForTeamA(teamAscore);
    }
    /**
     * Displays the given score when +2points button is clicked for Team B.
     */
    public void teamB2Points(View view){
        teamBscore = teamBscore +2;
        displayForTeamB(teamBscore);
    }
    /**
     * Displays the given score when Free Throw button is clicked for Team A.
     */
    public void teamAFreeThrow(View view){
        teamAscore = teamAscore +1;
        displayForTeamA(teamAscore);
    }
    /**
     * Displays the given score when Free Throw button is clicked for Team B.
     */
    public void teamBFreeThrow(View view){
        teamBscore = teamBscore +1;
        displayForTeamB(teamBscore);
    }
    /**
     * Displays the given score when reset button is clicked .
     */
    public void reset(View view){
        teamAscore = 0;
        teamBscore = 0;
        displayForTeamA(teamAscore);
        displayForTeamB(teamBscore);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
