package com.theironyard.charlotte;

/**
 * Created by kelseynewman on 11/29/16.
 */
public class Spell {
    String type;
    int timesHit;
    String defense;
    Boolean deadly;
    int threatLevel;
    String outcome;


    public void spellCast(){
        if (threatLevel < 8){
            outcome = "Success!";
        } else if (threatLevel >= 8){
            outcome = "You died :(";
        }
    }




}
