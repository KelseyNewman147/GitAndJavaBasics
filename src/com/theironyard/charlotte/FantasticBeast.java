package com.theironyard.charlotte;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by kelseynewman on 11/29/16.
 */
public class FantasticBeast {
    String type;
    int numberOfLegs;
    int numberOfHeads;
    String color;
    int legitimateThreat;
    String outcome;

    public void beastIsProvoked(){
        if (legitimateThreat < 5){
            outcome = "Easy, Buckbeak";
        } else if (legitimateThreat >= 5){
            outcome = "attack with giant talons";
        }
    }


}
