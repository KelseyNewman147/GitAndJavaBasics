package com.theironyard.charlotte;

/**
 * Created by kelseynewman on 11/29/16.
 */
public class Aggressor {
    int numberOfFoes;
    String whoIsIt;
    int howDangerousAreThey;
    Boolean isItYouKnowWho;
    String spellOfChoice;
    String outcome;

    public void attackedHarry(){
        if (numberOfFoes <= 2) {
            outcome = "Harry wins";
        } else if (numberOfFoes > 2 ) {
            outcome = "Harry is in distress";
        }
    }

    public void wizardsDuel(){
        if (howDangerousAreThey <= 5){
            outcome = "Harry can take 'em!";
        } else if (howDangerousAreThey >= 6){
            outcome = "Run away!";
        }
    }
    public void harryFights(){
        if (howDangerousAreThey < 5){
            outcome = "Expelliarmus!";
        } else if (howDangerousAreThey >= 5){
            outcome = "Stupefy!";
        }
    }
}
