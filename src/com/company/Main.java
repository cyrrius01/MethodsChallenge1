package com.company;



public class Main {

    public static void main(String[] args) {

        displayHighScorePosition("Fred", 4000);

    }

    public static void displayHighScorePosition(String playersName, int highScorePosition) {

        int position = calculateHighScorePosition(highScorePosition);
        System.out.println(playersName + " managed to get into position " + position + " on the high score table.");

    }

    public static int calculateHighScorePosition(int playerScore) {
        int highScorePosition;

        if(playerScore > 1000) {
            highScorePosition = 1;
            return highScorePosition;
        } else if(playerScore > 500 && playerScore < 1000) {
            highScorePosition = 2;
            return highScorePosition;
        } else if(playerScore > 100 && playerScore < 500) {
            highScorePosition = 3;
            return highScorePosition;
        } else {
            highScorePosition = 4;
            return highScorePosition;
        }


    }
}
