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
    int levelOfInjury;


    public void spellCast(){
        if (threatLevel < 8){
            outcome = "Success!";
        } else if (threatLevel >= 8){
            outcome = "You died :(";
        }
    }

    public void counterCurse(){
        if (threatLevel >= 5){
            outcome =  "protego!";
        } else if (threatLevel < 5){
            outcome = "expelliarmus!";
        }
    }

    public void iveBeenHit(){
        if (levelOfInjury >= 3){
            outcome = "To the hospital wing!";
        } else if (levelOfInjury < 3){
            outcome = "eh, you'll be okay";
        }
    }




}
