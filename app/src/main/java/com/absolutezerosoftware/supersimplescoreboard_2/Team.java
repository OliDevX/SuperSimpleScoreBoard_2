package com.absolutezerosoftware.supersimplescoreboard_2;

/**
 * Created by Armando Ibarrarán on 18/04/2016.
 */
public class Team {
    // Variable for team's points
    public int mPoints;

    // Variable for team's name
    public String mName;

    // Method to set team's points
    public void SetPoints(int points){
        mPoints = points;
    }

    // Method to increase points for each team
    public void onIncreasePoint () {
        if (mPoints < 999){
            mPoints++;
        }
    }

    public void onDecreasePoint () {
        if (mPoints > 0) {
            mPoints--;
        }
    }
}