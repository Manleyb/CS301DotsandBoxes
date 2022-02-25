/*
    author tags here:
    ______
 */
package edu.up.dbgui;

import java.util.Arrays;

public class GameState {
    private int[] scores = new int[1];
    private int whosTurn;

    /*
        constructor for your class that initializes all the variables to reflect the start
        of the game before any actions have been taken.
     */
    public GameState(){
        //scores start from 0 for all players
        for(int i = 0; i < scores.length; i++){
            scores[i] = 0;
        }
        //player 0 always starts
        this.whosTurn = 0;
    }

   /*
   copy constructor that makes a deep copy of a given instance of your
    class and adjusts it so it shows only the data visible to a specific player.
    */
    public GameState(GameState gs){
        //sets scores of the current game to this copy
        for(int i = 0; i < scores.length; i++){
            scores[i] = gs.scores[i];
        }
        this.whosTurn = gs.whosTurn;
    }

    public boolean drawLine(){
        //if valid move, return true. Else, return false
        return true;
    }
    public boolean mainMenu(){
        return true;
    }
    public boolean restart(){
        return true;
    }
    public boolean quit(){
        return true;
    }
    public boolean rules(){
        return true;
    }

    /*
    describes the state of the game as a string.
    */
    @Override
    public String toString() {
        return "{scores=" + Arrays.toString(scores) +
                ", whosTurn=" + whosTurn +
                '}';
    }
}
