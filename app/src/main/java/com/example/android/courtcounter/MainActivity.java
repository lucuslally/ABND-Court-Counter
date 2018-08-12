package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*
     Global variables for tracking goals and fouls
     */
    int goalScoreTeamA = 0;
    int foulScoreTeamA = 0;

    int goalScoreTeamB = 0;
    int foulScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Displays the given goal score for Team A.
     */
    public void displayGoalsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goal_score);
        scoreView.setText(String.valueOf(score));
    }
    /*
     * Displays the given goal score for Team B
     */

    public void displayGoalsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goal_score);
        scoreView.setText(String.valueOf(score));
    }
    /*
     * Displays the given foul score for Team A
     */
    public void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul_score);
        scoreView.setText(String.valueOf(score));
    }
    /*
     * Displays the given foul score for Team B
     */

    public void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScoreBoard(View view) {
        goalScoreTeamA = 0;
        foulScoreTeamA = 0;
        goalScoreTeamB = 0;
        foulScoreTeamB = 0;

        displayGoalsForTeamA(goalScoreTeamA);
        displayFoulsForTeamA(foulScoreTeamA);
        displayGoalsForTeamB(goalScoreTeamB);
        displayFoulsForTeamB(foulScoreTeamB);
    }

    public void addGoalTeamA(View view) {
        goalScoreTeamA = goalScoreTeamA + 1;
        displayGoalsForTeamA(goalScoreTeamA);
    }

    public void addFoulTeamA(View view) {
        foulScoreTeamA = foulScoreTeamA + 1;
        displayFoulsForTeamA(foulScoreTeamA);
    }

    public void addGoalTeamB(View view) {
        goalScoreTeamB = goalScoreTeamB + 1;
        displayGoalsForTeamB(goalScoreTeamB);
    }

    public void addFoulTeamB(View view) {
        foulScoreTeamB = foulScoreTeamB + 1;
        displayFoulsForTeamB(foulScoreTeamB);
    }
}

