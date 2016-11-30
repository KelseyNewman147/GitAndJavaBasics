package com.theironyard.charlotte;


/**
 * Created by kelseynewman on 11/29/16.
 */
public class House {
    String houseName;
    int numberOfStudents;
    int numberOfRooms;
    String houseColor;
    String headOfHouse;
    String outcome;


    public void newYear(){
        numberOfStudents++;

    }

    public void houseCup(){
        if (Math.random() > .50){
            outcome = "Gryffindor wins!";
        } else if (Math.random()< .50){
            outcome = "Oh no, Slytherin wins!";
        }

    }

    public void expandingCharm(){
        numberOfRooms++;
    }





}
