package com.theironyard.charlotte;

public class Main {

    public static void main(String[] args) {
        Character harry = new Character();
        //describes character
        harry.name = "Harry Potter";
        harry.age = 11;
        harry.house = "Gryffindor";
        harry.isWizard = true;
        harry.year = 1;
        //call up method to age harry
        harry.hadBirthday();
        System.out.println("Harry's age is " + harry.age);

        Aggressor voldemort = new Aggressor();
        voldemort.isItYouKnowWho = true;
        voldemort.numberOfFoes = 1;
        voldemort.howDangerousAreThey = 9000;
        voldemort.whoIsIt = "He who must not be named";
        voldemort.spellOfChoice = "Avada Kedavra";

        voldemort.attackedHarry();
        System.out.println(voldemort.outcome);

        FantasticBeast buckbeak = new FantasticBeast();
        buckbeak.type = "hippogriff";
        buckbeak.color = "silver";
        buckbeak.numberOfHeads = 1;
        buckbeak.numberOfLegs = 4;
        buckbeak.threatLevel = 4;

        buckbeak.beastIsProvoked();
        System.out.println(buckbeak.outcome);

        House gryffindor = new House();
        gryffindor.headOfHouse = "Minerva McGonagall";
        gryffindor.houseColor = "Scarlett and Gold";
        gryffindor.houseName = "Gryffindor";
        gryffindor.numberOfRooms = 3;
        gryffindor.numberOfStudents = 24;

        gryffindor.newYear();
        System.out.println("Gryffindor now has " + gryffindor.numberOfStudents + " students!");

        Spell avadaKedavra = new Spell();
        avadaKedavra.type = "Killing curse";
        avadaKedavra.defense = "Mother's love";
        avadaKedavra.threatLevel = 7;
        avadaKedavra.deadly = true;
        avadaKedavra.timesHit = 1;

        avadaKedavra.spellCast();
        System.out.println(avadaKedavra.outcome);


    }
}
