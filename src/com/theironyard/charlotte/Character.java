package com.theironyard.charlotte;

/**
 * Created by kelseynewman on 11/29/16.
 */
public class Character {
    String name;
    String house;
    int age;
    int year;
    Boolean isWizard;
    String outcome;

    public void hadBirthday() {
        age++;


    }
    public void sortingHat(){
        if (Math.random() >= .75){
            outcome = "Gryffindor!";
        } else if (Math.random() >= .50) {
            outcome = "Ravenclaw!";
        } else if (Math.random() >= .25) {
            outcome = "Hufflepuff!";
        } else if (Math.random() < .25){
            outcome = "Slytherin!";
        }
    }

    public void owls(){
        year++;
    }
}